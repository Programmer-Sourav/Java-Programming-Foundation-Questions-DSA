package FindHotelRoomsCount;

import java.util.*;

/**
 * Yes — this problem follows partitioning patterns and greedy strategies, where you break a total (numberOfGuests) into meaningful subgroups based on specific criteria.
 *
 * 🧠 Underlying Patterns
 * You're essentially creating different partitions of an integer. Let's go over the three patterns your code aims to produce:
 *
 * ✅ 1. Divide by Two Repeatedly (Greedy Halving Pattern)
 * Repeatedly divide the number by 2.
 *
 * Good for modeling resource halving or exponential decay.
 *
 * Stops when the number reaches 1.
 *
 * For 6:
 * 6 → 3 → 1
 * Output: [3, 1]
 *
 * ✅ 2. Equal Partition (Split into 2 Equal Parts)
 * If the number is even, return two equal halves.
 *
 * If odd, can’t divide equally.
 *
 * For 6:
 * Output: [3, 3]
 *
 * ✅ 3. Strictly Increasing Partition (Greedy, similar to "maximum unique addends")
 * Keep adding increasing numbers starting from 1 until the total is used.
 *
 * This is similar to the "Maximum Number of Unique Summands" problem.
 *
 * For 6:
 * Take 1 → 2 → 3 (sums to 6)
 * Output: [1, 2, 3]
 *
 * For 8:
 * Take 1 → 2 → 3 → 4 → can't take 5 (would go over 8)
 * So backtrack last one and add remainder to last valid number: [1, 2, 5]
 *
 */

/**
 * ✅ Pattern Logic (Greedy Approach)
 * Start from 1, then 2, 3, ...
 *
 * Add them to a result list as long as the remaining sum is larger than the next number.
 *
 * When the remaining value is less than or equal to the next number,
 * add it as the last element to ensure total sum equals n.
 */


public class FindNumberOfRooms {

    public String findNumberOfRooms(int numberOfGuests) {
        String option1 = divideIntoTwos(numberOfGuests);         // [2, 2, 2]
        String option2 = divideIntoTwoEquals(numberOfGuests);    // [3, 3]
        String option3 = maxUniqueSummands(numberOfGuests);      // [1, 2, 3]

        return "Fixed Twos: " + option1 + " | Equal Halves: " + option2 + " | Max Unique: " + option3;
    }

    // 🔸 [2, 2, 2] — Fixed size of 2
    private String divideIntoTwos(int numberOfGuests) {
        List<Integer> result = new ArrayList<>();
        while (numberOfGuests >= 2) {
            result.add(2);
            numberOfGuests -= 2;
        }
        if (numberOfGuests == 1) result.add(1); // handle leftover 1
        return result.toString();
    }

    // 🔸 [3, 3] — Two equal parts
    private String divideIntoTwoEquals(int numberOfGuests) {
        if (numberOfGuests % 2 != 0) {
            return "[Not divisible equally]";
        }
        int half = numberOfGuests / 2;
        return "[" + half + ", " + half + "]";
    }

    // 🔸 [1, 2, 3] — Max number of unique summands
    private String maxUniqueSummands(int numberOfGuests) {
        List<Integer> result = new ArrayList<>();
        int current = 2; //taking in most of the hotels, max 3 guests are allowed in a room
        int sum = 0;

        while (sum + current <= numberOfGuests) {
            result.add(current);
            sum += current;
            current++;
        }

        // Add leftover to last number
        if (sum < numberOfGuests && !result.isEmpty()) {
            int lastIndex = result.size() - 1;
            result.set(lastIndex, result.get(lastIndex) + (numberOfGuests - sum));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        FindNumberOfRooms obj = new FindNumberOfRooms();
        int guests = 6;

        System.out.println(obj.findNumberOfRooms(guests));
    }
}

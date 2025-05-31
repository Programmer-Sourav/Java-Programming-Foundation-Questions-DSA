package FindHotelRoomsCount;

import java.util.*;

/**
 * 🧠 Notes
 * divideIntoTwosRecursive breaks the number into 2s (and 1 if odd) using recursion.
 *
 * divideIntoTwoEqualsRecursive just checks even/odd and returns halves.
 *
 * maxUniqueSummandsRecursive follows a greedy recursive strategy to include as many
 * unique summands as possible.
 *
 * Let me know if you'd like to return them as a map or structured result object instead of a string.
 *
 */

public class FindNumberOfRoomsRecursive {

    public String findNumberOfRooms(int numberOfGuests) {
        List<Integer> option1 = new ArrayList<>();
        divideIntoTwosRecursive(numberOfGuests, option1);

        List<Integer> option2 = divideIntoTwoEqualsRecursive(numberOfGuests);

        List<Integer> option3 = new ArrayList<>();
        maxUniqueSummandsRecursive(numberOfGuests, 1, option3);

        return "Fixed Twos: " + option1 + " | Equal Halves: " + option2 + " | Max Unique: " + option3;
    }

    // 🔸 Pattern 1: Fixed [2, 2, ..., 1]
    private void divideIntoTwosRecursive(int number, List<Integer> result) {
        if (number == 0) return;
        if (number >= 2) {
            result.add(2);
            divideIntoTwosRecursive(number - 2, result);
        } else {
            result.add(1);
        }
    }

    // 🔸 Pattern 2: [n/2, n/2] if even
    private List<Integer> divideIntoTwoEqualsRecursive(int number) {
        if (number % 2 != 0) return Collections.singletonList(-1); // indicate not possible
        return Arrays.asList(number / 2, number / 2);
    }

    // 🔸 Pattern 3: Max Unique Summands [1, 2, 3, ...]
    private void maxUniqueSummandsRecursive(int remaining, int current, List<Integer> result) {
        if (remaining == 0) return;

        if (remaining - current > current) {
            result.add(current);
            maxUniqueSummandsRecursive(remaining - current, current + 1, result);
        } else {
            result.add(remaining);
        }
    }

    public static void main(String[] args) {
        FindNumberOfRoomsRecursive obj = new FindNumberOfRoomsRecursive();
        int guests = 6;
        System.out.println(obj.findNumberOfRooms(guests));
    }
}

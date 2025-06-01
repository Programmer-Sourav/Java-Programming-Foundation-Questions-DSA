package FindHotelRoomsCount.greedyalgorithms;

/**
 * ✅ 2. Form the Largest Number from Digits
 * (Greedy Choice + Sorting)
 *
 * 🧠 Intuition: Sort the digits (or numbers) so that concatenation gives the largest number.
 */

import java.util.Arrays;

/**
 * 🧩 Greedy Choice: Choose the pair that creates the lexicographically larger prefix.
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            asStrs[i] = String.valueOf(nums[i]);

        Arrays.sort(asStrs, (a, b) -> (b + a).compareTo(a + b));

        if (asStrs[0].equals("0")) return "0";

        return String.join("", asStrs);
    }
}
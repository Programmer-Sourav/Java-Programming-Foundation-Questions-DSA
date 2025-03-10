package TwoPointers;

import java.util.Arrays;

public class TargetSumSubArray {
    public static void main(String[] args) {
        int[] inputArr = new int[]{3, 5, 2, 8, 11};
        int targetSum = 10;

        // Sort the array if needed for two-pointer approach (optional for unsorted input)
        Arrays.sort(inputArr);

        // Initialize left and right pointers
        int left = 0, right = inputArr.length - 1;

        boolean found = false;

        // While loop to check pairs
        while (left < right) {
            int sum = inputArr[left] + inputArr[right];
            if (sum == targetSum) {
                System.out.println("Pair found: [" + inputArr[left] + ", " + inputArr[right] + "]");
                found = true;
                break; // exit once we find the pair
            } else if (sum < targetSum) {
                left++; // move left pointer to the right to increase sum
            } else {
                right--; // move right pointer to the left to decrease sum
            }
        }

        if (!found) {
            System.out.println("No pair exists with the given target sum.");
        }
    }
}

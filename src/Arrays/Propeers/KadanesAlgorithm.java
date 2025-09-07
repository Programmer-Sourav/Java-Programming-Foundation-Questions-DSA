package Arrays.Propeers;

/**
 * Problem statement
 * You are given an array 'arr' of length 'n', consisting of integers.
 * A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0
 * or more integers from the beginning and 0 or more integers from the end of an array.
 * Find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.
 * The sum of an empty subarray is 0.
 * Example :
 * Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]
 * Output: 11
 * Explanation: The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].
 */

/**
 * This is the Maximum Subarray Sum problem, also known as Kadane’s Algorithm.
 */

public class KadanesAlgorithm {
    public static int maximumSumSubArray(int arr[], int n){
        int curSum = 0;
        int maxSum = 0;

        for(int i = 0; i< arr.length; i++){
            curSum = curSum + arr[i];
            maxSum =  Math.max(curSum, maxSum);
        }
        return maxSum;
    }


    public static void main(String args[]){
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        int n = arr.length;
        System.out.println(maximumSumSubArray(arr, n)); // Output: 11
    }
}

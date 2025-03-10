package basic_string_manipulation;

public class MaxSubArraySum {

    //Max SubArray Sum (Kadane's Algorithm)
    public static void main(String [] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums));
    }

    public static  int maxSubArraySum(int [] nums){
        int maxSum = 0, currentSum = 0;

        for(int currentNum : nums){
            currentSum = Math.max(currentNum,  currentSum + currentNum);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}

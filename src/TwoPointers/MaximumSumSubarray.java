package TwoPointers;

public class MaximumSumSubarray {

    public int[] maximumSumSubArray(int [] input) {
        int maxSum = 0;
        int currentSum = 0;
        int start = 0, end = 0, tempStart = 0;


        for(int i = 0; i<input.length; i++){
            //expand the window by adding the current element
            currentSum = currentSum + input[i];

            // Update maxSum if the current sum is greater
            if(currentSum>maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            // If currentSum becomes negative, reset it and update tempStart
            if(currentSum<0){
                currentSum = 0;
                tempStart = i+ 1;
            }
        }
        int [] subArray = new int[end - start + 1];
        for(int i = start; i<=end ; i++){
            subArray[i - start] = input[i];
        }
        return subArray;
    }

    //Maximum Sum SubArray
    //Kadane's Algorithm: Dynamic programming approach to find the maximum subarray sum in O(n) time.
    //    Pattern:
    //    This problem asks us to find the subarray with the maximum sum.
   //    Approach:
   //    Use Kadane’s Algorithm, which keeps track of the current sum and compares it with the global maximum sum.
    public static int maxSubArray(int [] arr){
      int maxSum = arr[0], curSum = arr[0];

      for(int i =0; i<arr.length; i++){
          curSum = Math.max(maxSum, curSum+arr[i]);
          maxSum = Math.max(maxSum, curSum);
      }
      return maxSum;
    }
    //console.log(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])); // Output: 6

}





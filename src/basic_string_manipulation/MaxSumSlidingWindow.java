package basic_string_manipulation;

public class MaxSumSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum Sum of Subarray of Size K: " + maxSumSlidingWindow(arr, k));
    }

    public static int maxSumSlidingWindow(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;

        // Calculate the sum of the first window
        for(int i =0; i<k; i++){
            windowSum = windowSum + arr[i];
        }
        maxSum = windowSum;

        // Slide the window across the array
        for(int i =k; i<arr.length; i++){
            windowSum = windowSum + arr[i] - arr[i-k];// Slide the window
            maxSum = Math.max( maxSum, windowSum);
        }
   return maxSum;
    }
}

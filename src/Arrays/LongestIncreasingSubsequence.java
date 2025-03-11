package Arrays;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    /**
     * Problem Statement
     * Find the longest increasing subsequence (LIS) in an array.
     * Approach 1: Dynamic Programming (O(n²))
     * Maintain an LIS array where LIS[i] stores the longest subsequence ending at i.
     */
    public static  int longestIncreasingSubsequence(int [] arr){
        int n = arr.length;
        int [] lis = new  int[n];
        Arrays.fill(lis, 1);

        for(int i = 1; i<n ; i++){
            for(int j = 0; j<i ; j++){
                if(arr[i]> arr[j]){
                    lis[i] = Math.max(lis[i], lis[j]+1);
                }
            }
        }

        System.out.print("Lis ");

        int maxLength =0;
        for(int element : lis){
            System.out.print(element +", ");
            maxLength = Math.max(maxLength, element);
        }
   return maxLength;


    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        //longestIncreasingSubsequence(arr);
        System.out.println("Longest Increasing Subsequence: "+ longestIncreasingSubsequence(arr));  // Output: 5
    }


}

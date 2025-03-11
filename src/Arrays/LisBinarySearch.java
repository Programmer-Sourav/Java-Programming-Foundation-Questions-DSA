package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LisBinarySearch {

//    Approach 2: Binary Search + DP (O(n log n))
//    Use a dynamic array to keep track of increasing sequences and use binary search to optimize placement.

    public static int longestIncreasingSubsequence( int [] arr){

        ArrayList<Integer> lis = new ArrayList<>();

       for(int element: arr){
           int pos = Collections.binarySearch(lis, element);

           if(pos<0){
               pos = -(pos+1);
           }
           if(pos == lis.size()){
               lis.add(element);
           }
           else{
               lis.set(pos, element);
           }
       }
   return lis.size();
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println("Longest Increasing Subsequence: " + longestIncreasingSubsequence(arr));  // Output: 5
    }
}

/**
 *
 * ✅ Time Complexity: O(n log n)
 * ✅ Space Complexity: O(n)
 *
 * Summary of Approaches
 * Problem	Approach	Time Complexity
 * Max Sum Subarray	Brute Force	O(n²)
 * Kadane’s Algorithm	O(n)
 * Print Subsequences	Recursion	O(2ⁿ)
 * Longest Increasing Subsequence	DP	O(n²)
 * DP + Binary Search	O(n log n)
 *
 *
 *
 *
 *
 */

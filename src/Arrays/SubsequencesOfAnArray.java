package Arrays;


import java.util.ArrayList;

/**
 * Subarrays and Subsequences in Java
 * 🔹 Difference between Subarrays and Subsequences:
 *
 * Subarray: A contiguous part of an array (continuous elements).
 * Subsequence: A sequence derived from the array by deleting elements without changing the order.
 * Example
 * For the array [1, 2, 3]:
 * ✅ Subarrays: [1], [2], [3], [1,2], [2,3], [1,2,3]
 * ✅ Subsequences: [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]
 */

public class SubsequencesOfAnArray {
    /**
     * Problem Statement
     * Find and print all subsequences of a given array.
     *
     * Approach: Recursive Backtracking (O(2ⁿ))
     * Each element has two choices:
     *
     * Include the element in the subsequence.
     * Exclude the element and move to the next.
     */
    public static void subSequenceOfTheArray(int arr[], int index, ArrayList<Integer> result){

        if(index == arr.length){
            System.out.print(result);
            return;
        }

        // Include the current element
        result.add(arr[index]);
        subSequenceOfTheArray(arr, index+1, result);

        // Exclude the current element
        result.remove(result.size()-1);
        subSequenceOfTheArray(arr, index-1, result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subSequenceOfTheArray(arr, 0, new ArrayList<>());
    }
}

       /***
        [1, 2, 3]
        [1, 2]
        [1, 3]
        [1]
        [2, 3]
        [2]
        [3]
        **/
     /**   []✅ Time Complexity: O(2ⁿ)
✅ Space Complexity: O(n)**/



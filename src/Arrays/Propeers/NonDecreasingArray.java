package Arrays.Propeers;

/**
 *
 * Problem statement
 * You have been given an integer array/list 'ARR' of size 'N'.
 * Write a solution to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array as non-decreasing, if ARR[i] <= ARR[i + 1] holds for every
 * i (0-based) such that (0 <= i <= N - 2).
 */

public class NonDecreasingArray {
    /**
     * 🔹 Problem Restatement
     * Given an array ARR of size N, check if it can become non-decreasing by modifying at most one element.
     * Non-decreasing → arr[i] <= arr[i+1] for all valid i.
     * Allowed: Change one element at most.
     */
    /**
     * Approach
     * Traverse array and look for violations (arr[i] > arr[i+1]).
     * If more than 1 violation → return false.
     * If exactly 1 violation:
     * Fix by reducing arr[i] (if i == 0 or arr[i-1] <= arr[i+1])
     * Else, increase arr[i+1].
     * Return true.
     * This works because only one fix is allowed.
     */
    /**
     * 👉 Greedy / Array Traversal Pattern
     * We detect violations (arr[i] > arr[i+1]) and fix locally with minimal modification.
     */
    /**
     * ✅ Pattern Recap:
     * This follows the Greedy → Local Fix Strategy Pattern: when a violation occurs,
     * fix it in the least disruptive way to keep the array valid.
     */
    /**
     * 🔹 Complexity
     * Time: O(n) (single pass).
     * Space: O(1) (in-place).
     */


    public static boolean checkPossibility(int arr[]){
         int count = 0;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]  > arr[i+1])
                count++;

            if(count> 1) return  false;

            //Fix violation
            if(i==0 || arr[i-1] <= arr[i+1]){
                arr[i] = arr[i+1]; // lower arr[i]
            }
            else{
                arr[i+1] = arr[i]; // raise arr[i+1]
            }

        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 3};
        int[] arr2 = {4, 2, 1};

        System.out.println(checkPossibility(arr1)); // true
        System.out.println(checkPossibility(arr2)); // false
    }
}

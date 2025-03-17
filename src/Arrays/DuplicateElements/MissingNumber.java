package Arrays.DuplicateElements;


/**
 *
 * Problem Statement
 * Given an array of size n-1 containing numbers from 1 to n with one number missing, find the missing number.
 * 🔹 Input: [1, 2, 4, 5]
 * 🔹 Output: 3
 *
 */

public class MissingNumber {
    /***Brute Force – Check All Elements (O(n²))***/
//    Iterate through numbers from 1 to n, checking if each number exists in the array.
//    Time Complexity: O(n²)
//    Space Complexity: O(1)
    /** ** Using Sum Formula (O(n), O(1)) – Optimal Approach ***/
    /** (n*(n+1))/2 **/

    public static int findMissingNumber(int arr[], int n){
        int expectedSumOf_N_naturalNumbers = (n*(n+1)/2);
        int sumOfCurrentArray = 0;
        for(int i = 0; i<arr.length; i++){
            sumOfCurrentArray = sumOfCurrentArray + arr[i];
        }
        int missingNumber = expectedSumOf_N_naturalNumbers - sumOfCurrentArray;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5; // Array should have numbers from 1 to 5
        System.out.println(findMissingNumber(arr, n)); // Output: 3
    }

    }

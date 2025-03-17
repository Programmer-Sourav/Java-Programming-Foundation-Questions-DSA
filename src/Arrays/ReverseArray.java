package Arrays;

import java.util.Arrays;

/**
 * Scenario	Approach
 * Small k (rotation)	Brute Force (O(n*k))
 * Large k, O(n) required	Extra Space (O(n)) or Reverse Method (O(1) space)
 * Need in-place rotation	Reverse Method (O(n))
 * Reversing array	Two-Pointer (O(n))
 */
public class ReverseArray {
    /**
     *  Brute Force – Using Extra Array (O(n), O(n))
     */

    public static  int[] reverseArray(int arr[]){
        int n = arr.length;
        int [] reversed = new int[n];

        for(int i = 0; i<n; i++){
            reversed[i] = arr[n-1-i];
        }
        return reversed;
    }

    /**
     * Better approach
     *  Two Pointer Approach
     */

    public static int[] reverse(int arr[]){
        int start = 0, end = arr.length - 1;
          while(start<end){
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
          }
          return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr))); // Output: [5, 4, 3, 2, 1]
    }


   }



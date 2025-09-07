package Arrays.Propeers;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, you have to move the array elements in a way such that
 * all the zeroes are transferred to the end, and all the non-zero elements are moved to the front.
 * The non-zero elements must be ordered in their order of appearance.
 * For example, if the input array is: [0, 1, -2, 3, 4, 0, 5, -27, 9, 0], then the output array must be:
 * [1, -2, 3, 4, 5, -27, 9, 0, 0, 0].
 * Expected Complexity: Try doing it in O(n) time complexity and O(1) space complexity.
 * Here, ‘n’ is the size of the array.
 * Detailed explanation ( Input/output format, Notes, Im
 */

/**
 * 🔹 Complexity Analysis
 *
 * Time: O(n) → single pass through the array.
 *
 * Space: O(1) → only pointers used.
 *
 * Stable: ✅ Order of non-zero elements preserved.
 *
 */
public class MoveZerosToEnd {


    public static int[] moveZerosToEnd(int arr[]){
        int n = arr.length;
        int pos = 0;

        // Step 1: Move all non-zero elements to the front
        for(int i = 0; i< n ; i++){
            if(arr[i]!=0){
                arr[pos] = arr[i];
                pos++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while(pos < n){
            arr[pos] = 0;
            pos++;
        }
    return arr;
    }

    public static int[] moveZerosToEndSwapBased(int arr[]) {
        int n = arr.length;
        int left = 0;  // pointer to track position for next non-zero element

        for (int right = 0; right < n; right++) {
            if (arr[right] != 0) {
                // swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }
        return arr;
    }

    public static void main(String args[]){
        int[] arr = {0, 1, -2, 3, 4, 0, 5, -27, 9, 0};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

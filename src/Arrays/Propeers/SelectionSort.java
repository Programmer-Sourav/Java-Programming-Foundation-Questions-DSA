package Arrays.Propeers;


/**
 * Problem: Selection Sort
 * Selection Sort is one of the sorting algorithms that works by repeatedly finding
 * the minimum element from the unsorted part of the array and placing it at the beginning.
 * You are given an unsorted array consisting of N non-negative integers.
 * Your task is to sort the array in non-decreasing order using the Selection Sort algorithm.
 */

/**
 * Input:  [64, 25, 12, 22, 11]
 * Output: [11, 12, 22, 25, 64]
 */

/**
 * 🔑 Pattern / Approach
 * Pattern: Sorting (Comparison based)
 * Time Complexity:
 * Worst & Average Case: O(N²) (because of two nested loops)
 * Best Case: O(N²) (still has to go through all comparisons even if sorted)
 * Space Complexity: O(1) (in-place sorting)
 */
public class SelectionSort {

    public static int[] selectionSort(int arr[]){
        int n = arr.length;

        // Traverse through the array
        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j <n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted region
             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
        }
        return  arr;
    }

    public static void main(String args[]){
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

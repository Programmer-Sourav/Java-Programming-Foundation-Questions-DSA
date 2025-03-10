package Sorting;


/**
 * Concept:
 *
 * Picks one element at a time and places it in its correct position relative to previous elements.
 * Time Complexity:
 * Best Case (Already Sorted):
 * 𝑂(𝑛)
 * O(n)
 * Worst & Average Case:
 * 𝑂(𝑛2)
 *O(n2)
 * Space Complexity:
 * 𝑂(1)
 * O(1) (in-place sorting)
 *
 */
public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            // Move elements that are greater than key to one position ahead
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
    }
}

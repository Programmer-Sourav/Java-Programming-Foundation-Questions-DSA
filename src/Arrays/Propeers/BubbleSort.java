package Arrays.Propeers;

/**
 * Bubble Sort is one of the sorting algorithms that works by repeatedly
 * swapping the adjacent elements of the array if they are not in sorted order.
 * You are given an unsorted array consisting of N non-negative integers.
 * Your task is to sort the array in non-decreasing order using the Bubble Sort algorithm.
 */

import java.util.Arrays;

/**
 * Problem: Bubble Sort
 * We are given an unsorted array of N non-negative integers.
 * We need to sort it in non-decreasing order (ascending) using Bubble Sort.
 * 🔑 Key Idea of Bubble Sort
 * Compare adjacent elements.
 * If the current element is greater than the next element → swap them.
 * After each iteration, the largest element moves ("bubbles up") to the end.
 * Repeat this until the array is sorted.
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, array is sorted
            if (!swapped) break;
        }
    }
    public static void main (String args[]){
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

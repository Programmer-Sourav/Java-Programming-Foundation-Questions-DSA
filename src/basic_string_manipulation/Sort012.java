package basic_string_manipulation;

public class Sort012 {

    /*
     * Explanation:
     * This is a classic problem known as the Dutch National Flag Problem, and it can be efficiently solved using a three-pointer approach (or three-way partitioning).
     *
     * Approach:
     * Pointers Used:
     *
     * low: Marks the boundary for placing 0s.
     * mid: Used to traverse the array.
     * high: Marks the boundary for placing 2s.
     * Steps:
     *
     * Start with three pointers: low at the start of the array, high at the end of the array, and mid at the start.
     * Traverse the array using the mid pointer and:
     * If the element at mid is 0, swap it with the element at low, then increment both low and mid.
     * If the element at mid is 1, just move mid forward.
     * If the element at mid is 2, swap it with the element at high, then decrement high.
     * Repeat until mid crosses high.
     */

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};

        // Three-pointer approach
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    // Move mid pointer forward
                    mid++;
                    break;

                case 2:
                    // Swap arr[mid] and arr[high]
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
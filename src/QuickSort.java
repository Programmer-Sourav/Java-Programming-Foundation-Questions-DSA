public class QuickSort {
    /*  **
     * Divide and conquer
     * Comparison based sorting
     * 1. if there is no element or one element in the array to be sorted, return
     * 2. Pick an element in the array as a pivot point
     * 3. Split the array into two parts - one with elements larger than the pivot and other with elements
     * smaller than the pivot
     * 4. Recursively repeat the algorithm for both halves of the original array
     */

    void QuickSort(int arr[], int low, int high){
        int pivot;
        if(high>low){
            pivot = partition(arr, low, high);
            QuickSort(arr, low, pivot - 1);
            QuickSort(arr, pivot+1, high);
        }

        System.out.println("\n\n Quick Sorted Array Now "+arr );
        for (int j : arr) {
            System.out.print(j);
        }
    }


    int partition(int arr[], int low, int high){
        int left, right, pivot_item = arr[0];
        left = low;
        right = high;

        while(left<right){
            /* *Move left while item<pivot */
            while(arr[left]<pivot_item)
                left++;
            /* Move right while item>pivot */
            while(arr[right]>pivot_item)
                right--;
            if(left<right)
                swap(arr, left, right);
        }
        /* * Right is the final position for the pivot**/
        arr[low] = arr[right];
        arr[right] = pivot_item;
        return right;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}

package Sorting;

public class BubbleSort {

    /***
     *  Concept:
     * Compares adjacent elements and swaps them if they are in the wrong order.
     * Repeats the process until the entire array is sorted.
     * Time Complexity:
     * Best Case (Already Sorted):
     * O(n)
     * Worst & Average Case:
     * 𝑂(𝑛*2)
     * O(n*2)
     * Space Complexity:
     * 𝑂(1)
     * O(1) (in-place sorting)
     */
    public static void main(String args[]){

    }

    public static void bubbleSort(int arr[]){
        boolean swapped ;
        int length = arr.length;

        for(int i = 0; i<length; i++){
            swapped = false;
            for(int j = 0; j<length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}

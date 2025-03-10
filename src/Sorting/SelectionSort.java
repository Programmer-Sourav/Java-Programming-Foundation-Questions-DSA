package Sorting;

public class SelectionSort {
    /**
     * 2. Selection Sort
     * Concept:
     * Finds the minimum element and places it at the beginning.
     * Repeats for each position in the array.
     * Time Complexity:
     * Best, Worst & Average Case:
     * 𝑂(𝑛*2)
     * O(n*2)
     * Space Complexity:
     * 𝑂(1)
     * O(1) (in-place sorting)
     * It repeatedly selects the minimum index, so it is known as Selection sort.
     */
    public static void sortElementBySelection(int arr[]){
         int minIndex, temp;
         int length = arr.length;

         for(int i = 0; i<length-1; i++){
             minIndex = i;
             for(int j =0; j<length ; j++){
                 if(arr[j]< arr[minIndex]){
                     minIndex = j;
                 }

                 temp = arr[minIndex];
                 arr[minIndex] = arr[i];
                 arr[i] = temp;

                 System.out.println("\n\n Selection Sort Array Now "+ "min" +arr[minIndex] );
                 for (int k : arr) {
                     System.out.print(k);
                 }
             }
         }
    }

}

public class SelectionSort {
    /* *
     * Sorts based upon KEYS
     * Swaps elements when required
     * Named Selection Sort since it repeatedly selects smallest element
     */
    /* **
     * 1. Find the minimum value in the list
     * 2. Swap it with the value in the current position
     * 3. Repeat the process for each element until the entire array is sorted
     * **/


    void selection(int arr[], int n){
        int min, temp;
        for(int i =0; i<n-1; i++){
            min = i;
            for(int j = i+1; j<n; j++) {
                if (arr[j] < arr[min]) {
                    min = j; //index/key assigned
                }
            }
                temp = arr[min]; //element swapped
                arr[min] = arr[i];
                arr[i] = temp;

            System.out.println("\n\n Selection Sort Array Now "+ "min" +arr[min] );
            for (int j : arr) {
                System.out.print(j);
            }
        }
    }


}

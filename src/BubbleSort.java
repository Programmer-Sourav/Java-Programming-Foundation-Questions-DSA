public class BubbleSort {
    //BubbleSort works by iterating over the array from the first element to the last element, comparing
    //each adjacent pair of elements and swapping them if needed.
    //Bubble sort continues its iteration until no swaps are needed.
    void bubbleSort(int arr[], int n){
        int temp;
        for(int pass = n-1; pass>0; pass--){
            for(int i = 0; i<pass-1; i++){
                if(arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println("Array Now ");
            for (int j : arr) {
                System.out.print(j);
            }
        }
    }


    void bubbleSortImproved(int arr[], int n){
        int temp;
        boolean swapped = true;
        for(int pass = n-1; pass>=0 && swapped; pass--){
            swapped = false;
            for(int i = 0; i<pass-1; i++){
                if(arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            System.out.println("\n\nArray Now Improved ");
            for (int j : arr) {
                System.out.print(j);
            }
        }
    }

}

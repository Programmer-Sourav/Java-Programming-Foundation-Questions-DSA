public class MergeSort {
    /* *
     * Merge sort starts with the small sub array and finishes up with the largest one, as a result it doesn't
     * need stack and is Stable.
     *
     * Divide and Conquer
     *
     * **/


    void mergeSort(int arr[], int temp[], int left, int right){
        int mid;
        System.out.println("LR "+left +", "+right);
        if(right>left){
            mid = (right + left)/2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid+1, right);
            Merge(arr, temp, left, mid, right);
            System.out.println("LR "+left +", "+mid);
        }
    }

   void Merge(int arr[], int temp[], int left, int mid, int right){

        int i, left_end, size, temp_pos;
        left_end = mid - 1;
        temp_pos = left;
        size = right - left + 1;

        while((left<=left_end)&&(mid<=right)){
            if(arr[left]<= arr[mid]){
                temp[temp_pos] = arr[left];
                temp_pos = temp_pos + 1;
                left = left + 1;
            }
            else{
                temp[temp_pos] = arr[mid];
                temp_pos = temp_pos +1;
                mid = mid + 1;
            }
            while(left<=left_end){
                temp[temp_pos] = arr[left];
                temp_pos = temp_pos+ 1;
                left = left + 1;
            }
            while(mid<=right){
                System.out.println("Mid, Right "+mid +", "+right);
                temp[temp_pos] = arr[mid];
                mid = mid + 1;
                temp_pos = temp_pos + 1;
            }

            for(i = 0; i<size; i++){
                arr[right] = temp[right];
                right = right - 1;
            }
        }

       System.out.println("\n\n Array Merged ");
       for (int j : arr) {
           System.out.print(j);
       }
   }
}

public class SortedLinearSearch {

    int sortedLinearSearch(int arr[], int n, int data){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==data)
                return i;
            else if (arr[i]>data)
                return -1;
        }
        return -1;
    }
}

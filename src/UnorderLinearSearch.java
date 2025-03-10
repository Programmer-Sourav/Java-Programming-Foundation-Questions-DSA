public class UnorderLinearSearch {

    int unorderedLinearSearch(int arr[], int n, int data){
        for(int i = 0; i<n ; i++){
            if(arr[i]== data)
                return i;
        }
        return -1;
    }
}

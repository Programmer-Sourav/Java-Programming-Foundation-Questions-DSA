/****
 *
 *
 * b) Binary Search (on Sorted Array)
 * Binary Search works only on sorted arrays.
 * It repeatedly divides the array in half to find the target.
 * Time Complexity:
 * 𝑂
 * (
 * log
 * ⁡
 * 𝑛
 * )
 * O(logn)
 *
 */


public class BinarySearch {

    int binarySearchIterative(int arr[], int n, int data){
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(arr[mid]==data)
                return mid;
            else if(arr[mid]<data)
                low = mid+1;
            else
                high = mid -1;
        }
        return -1;
    }

    int binarySearchRecursive(int arr[], int low, int high, int data){
        int mid = low + (high - low)/2;
        if(arr[mid] == data)
            return mid;
        else if (arr[mid]<data)
            return binarySearchRecursive(arr, mid+1, high, data);
        else
           return  binarySearchRecursive(arr, low, mid -1, data);
    }
}

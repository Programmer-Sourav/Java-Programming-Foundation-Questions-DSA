package Arrays;

import java.util.Arrays;

public class RotateByKElements {
    //Optimized Approach (O(n)) is by temporary array copying
    //best approach
    //reversal method (O(n), O(1) space)

    public static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int arr[], int k){
        int n = arr.length;
        k = k%n; //Handle cases where k>n

        //reverse first k elements
        reverse(arr, 0, k-1);
        //reverse remaining elements
        reverse(arr, k, n-1);
        //reverse entire array
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr, 2);
        System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 1, 2]
    }

}

package Arrays.Propeers;

/**
 * DSA Pattern Used
 * 👉 Array Manipulation / Reversal Algorithm Pattern
 * This is a classic rotation problem often solved with:
 * Naive shifting (O(n*k) time).
 * Extra array (O(n) time, O(n) space).
 * Reversal Algorithm (O(n) time, O(1) space) → Optimal.
 * We’ll use the Reversal Algorithm Pattern:
 * Step 1: Reverse the first k elements.
 * Step 2: Reverse the last n-k elements.
 * Step 3: Reverse the whole array.
 */
public class RotateArrayByKElements {

    public static void reverseArray(int arr[], int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void leftRotate(int [] arr, int k){
      int n = arr.length;
      if(n==0) return;

      k = k % n; // Handle cases where k > n
      if(k == 0) return;

        // Step 1: Reverse first k elements
        reverseArray(arr, 0, k-1);
        // Step 2: Reverse remaining elements
        reverseArray(arr, k, n-1);
        // Step 3: Reverse whole array
        reverseArray(arr, 0, n-1);
    }


    public static void main(String args[]){

        int [] arr= {7, 5, 2, 11, 2, 43, 1, 1};
        int k = 2;

    }
}

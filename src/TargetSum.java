import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TargetSum {


   //Bruteforce
    void findIndicesForTargetSum(int arr[], int targetSum){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]+ arr[j] == targetSum){
                    System.out.println("Indices "+i +", "+j);
                    break;
                }
            }
        }
    }

    //Sorting and two pointers
//    1. The idea is to use the two-pointer technique.
//    2. (VVI )But for using the two-pointer technique, the array must be sorted.
//    3.Once the array is sorted the two pointers can be taken which mark the beginning and end of the array respectively.
//    4. If the sum is greater than the sum of those two elements, shift the right pointer to decrease the value of the required sum
//    5. and if the sum is lesser than the required value, shift the left pointer to increase the value of the required sum.
//Time Complexity: O(NlogN), Time complexity for sorting the array
//Auxiliary Space: O(1)

    boolean twoSumWithTwoPointersSortedArray(int arr[], int targetSum){
        int l = 0, r = arr.length - 1;
        Arrays.sort(arr);
        while(l<r){
            if(arr[l] + arr[r] == targetSum)
                return true;
            else if(arr[l] + arr[r]< targetSum)
                l++;
            else
                r--;
        }
        return false;
    }

    /***
     * Sort the array in non-decreasing order.
     * Traverse from 0 to N-1
     * Initialize searchKey = sum – A[i]
     * If(binarySearch(searchKey, A, i + 1, N) == True
     * Return True
     * Return False
     * **/
    /**
     * Time Complexity: O(NlogN)
     * Auxiliary Space: O(1)
     *
     */
    boolean twoSumWithBinarySearch(int arr[], int targetSum)
    {
       int l, r;
       Arrays.sort(arr);
        // Traversing all element in an array search for
        // searchKey
        for(int i = 0; i<arr.length; i++){
            int searchKey = targetSum - arr[i];

            boolean searchKeyVal = searchKeyWithBinarySearch(arr, i+1, arr.length-1, searchKey) ;
            if(searchKeyVal)
                return true;
        }
        return false;
    }

    private boolean searchKeyWithBinarySearch(int[] arr, int low, int high, int searchKey) {
        while (low<high){
            int m = low + (high - low) / 2;

            // Check if searchKey is present at mid
            if(arr[m]==searchKey)
                return true;
            // If searchKey greater, ignore left half
            if(arr[m] <searchKey)
                low = m+1;
            if(arr[m]>searchKey)
                high = m-1;
        }
        return false;
    }

    void findTargetSumWithHashing(int arr[], int targetSum){
        /***
         * Initialize an empty hash table s.
         * Do the following for each element A[i] in A[]
         * If s[x – A[i]] is set then print the pair (A[i], x – A[i])
         * Insert A[i] into s.
         */
        HashSet<Integer> s = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            int temp = targetSum - arr[i];

            if(s.contains(temp)){
                System.out.println("Yes");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
    }




    //Approach:
//Use a hashmap to store the complement of each number as we iterate through the array.
//For each number, check if its complement exists in the hashmap.
    public static int[] findPair(int [] arr, int target){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num : arr){
            int complement = target - num;
            if(map.containsKey(complement)){
                return new int[]{complement, num};
            }
            map.put(num, true);
        }
        return new int[]{};
    }
}



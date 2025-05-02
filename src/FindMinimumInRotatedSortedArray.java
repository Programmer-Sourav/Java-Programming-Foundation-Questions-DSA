/**
 *
 * Problem Statement:
 * Suppose an array of length n sorted in ascending
 * order is rotated between 1 and n times. Find the minimum element.
 */

public class FindMinimumInRotatedSortedArray {
    /**
     * Pattern:
     * Binary Search: Modified binary search to find the pivot point where the rotation occurs.
     */

    public int findMin(int [] arr){
        int left = arr[0];
        int right = arr[arr.length -1 ];

        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]>arr[right]){
                left = mid + 1; // Min must be to the right
            }
            else{
                right = mid; // Min could be mid or to the left
            }

        }

    return arr[left]; // or nums[right], both are equal here

    }
}

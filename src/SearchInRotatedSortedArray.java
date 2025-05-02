/**
 *
 * Problem Statement:
 * Given a rotated sorted array and a target value,
 * return the index if the target is found. If not, return -1.
 */

public class SearchInRotatedSortedArray {
    /**
     * Modified Binary Search: Determine which side is properly sorted and adjust search
     * boundaries accordingly.
     */
    public int searchInRotatedSortedArray(int [] arr, int target){
        int n = arr.length -1;
        int left = arr[0];
        int right = arr[n];

        while(left< right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target) return mid;

            if(arr[left]<= arr[mid]){
                if(arr[left]<= target && target<=arr[mid]) right = mid -1;
                else left = mid+1;
            }
          else{
              if(arr[right]<= target && target<=arr[mid]) left = mid + 1;
              else right = mid -1;
            }

        }
        return -1;
    }
}

/**
 *
 * Main Loop: Binary Search
 *
 * while (left <= right) {
 *     int mid = left + (right - left) / 2;
 * Use mid = left + (right - left) / 2 to avoid overflow.
 *
 * 1. Found it?
 *
 * if (nums[mid] == target) return mid;
 * If the mid element is the target, return its index.
 *
 * 2. Which half is sorted?

 * if (nums[left] <= nums[mid])
 * If the left to mid part is sorted:
 *
 * Example: [4, 5, 6, 7, 0, 1, 2], left = 0 (nums[0]=4), mid = 2 (nums[2]=6)
 *
 * ➤ If target lies within sorted half:

 * if (nums[left] <= target && target < nums[mid])
 *     right = mid - 1;
 * ➤ Else search the other half:

 * else left = mid + 1;
 * 3. Else right half is sorted:

 * else {
 *     if (nums[mid] < target && target <= nums[right])
 *         left = mid + 1;
 *     else
 *         right = mid - 1;
 * }
 * If nums[mid] < target <= nums[right], search in the sorted right half. Otherwise, search the left.
 *
 * 🧠 Key Insight:
 * You're always identifying which half is sorted,
 * then deciding if the target lies within that half. 
 * If so, you binary search there; if not, go to the other half.
 */

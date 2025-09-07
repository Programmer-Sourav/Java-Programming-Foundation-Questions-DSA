package Arrays.Propeers;

/**
 * Pair Sum: Problem statement
 * You are given an array/list ‘ARR’ consisting of ‘N’ distinct integers arranged in ascending order.
 * You are also given an integer ‘TARGET’. Your task is to count all the distinct pairs in ‘ARR’
 * such that their sum is equal to ‘TARGET’.
 * Note:
 * 1. Pair (x,y) and Pair(y,x) are considered as the same pair.
 * 2. If there exists no such pair with sum equals to 'TARGET', then return -1.
 * Example:
 * Let ‘ARR’ = [1 2 3] and ‘TARGET’ = 4. Then, there exists only one pair in ‘ARR’
 * with a sum of 4 which is (1, 3). (1, 3) and (3, 1) are counted as only one pair.
 */

/***
 *
 * If array is sorted → Two pointers is better:
 * Faster in practice (no hashing overhead).
 * Constant space.
 * If array is unsorted → Hashing is usually better:
 * No need to sort (saves O(n log n)).
 * Straightforward and still linear.
 */

import java.util.HashSet;

/**
 * 1️⃣ Two pointers approach (what you wrote first)
 *
 * Requirement: The array must be sorted.
 * Logic: Move left and right based on sum comparison.
 * Time complexity: O(n)
 * Space complexity: O(1)
 * This is optimal when the array is already sorted (or if you don’t mind sorting it once → O(n log n)).
 * 2️⃣ Hashing approach (your second idea)
 * Logic:
 * For each element x, compute target - x.
 * Check if that value exists in a hash set (or map).
 * Time complexity: O(n)
 * Space complexity: O(n) (extra set/map).
 * This is great when:
 * The array is unsorted.
 * You want constant-time lookup for complements.
 */
public class PairSum {

    //2nd approach for unsorted array
    public static int countPairsHash(int arr[], int target){
        HashSet set = new HashSet();
        int count = 0;
        for(int num : arr){
            int complement = target - num;
            if(set.contains(complement)){
                count++;
                set.remove(complement); //prevent reusing
            }
            else {
                set.add(num);
            }
        }
        return count;
    }

    //Two pointers approach for SORTED array
    public static int countPairs(int arr[], int target){
          int left =0, right = arr.length - 1;
          int count = 0;

         while(left<right){
              int sum = arr[left] + arr[right];

              if(sum == target) {
                  count++;
                  left++;
                  right--;
              }
              else if(sum< target){
                  left++;
              }
              else{
                  right--;
              }
         }
        return (count == 0) ? -1 : count;
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3};
        int target = 4;
        System.out.println(countPairs(arr, target)); // Output: 1
        System.out.print(countPairsHash(arr, target));
    }
}

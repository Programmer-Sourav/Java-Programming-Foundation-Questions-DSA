package basic_string_manipulation;

import java.util.Arrays;

public class TargetSum {
    //Two Pointers Problem
    public static  void findPairs(int [] nums, int target){
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(target == sum){
                System.out.println("(" + nums[left] + ", " + nums[right] + ")");
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }

    }

    public static void main(String [] args){
        int[] nums = {2, 7, 11, 15, 1, 8, 10};
        findPairs(nums, 9);
    }
}

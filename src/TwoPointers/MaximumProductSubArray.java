package TwoPointers;

public class MaximumProductSubArray {
    /*
     * Dynamic Programming: Keep track of both maximum and minimum products due to the effect of negative numbers.
     *
     */

    public int maxProduct(int [] arr){
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for(int i =0 ; i<arr.length; i++){
            int tempMax = Math.max(arr[i], Math.max(maxProduct*arr[i], minProduct*arr[i]));
            minProduct = Math.min(arr[i], Math.min(minProduct*arr[i], minProduct*arr[i]));
            result = Math.max(result, tempMax);
        }
        return result;
    }
}

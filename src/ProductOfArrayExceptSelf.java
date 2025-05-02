public class ProductOfArrayExceptSelf {
    /**
     * [10,2,8,3,4,4,5,3,6]
     * [multiply everything except 10, multiply everything except 2, multiply everything except 8,.... so on]
     */

    public int[] getProductOfTheArray(int [] arr){
        int[] result = new int[arr.length];
        int leftProduct = 1;
        for(int i =0; i<arr.length; i++){
            //multiplication should be from i+1 to arr.length-1
            result[i] = leftProduct;
            leftProduct*= arr[i];
            System.out.print("Result "+leftProduct);
        }

        // Step 2: Build suffix product (right) and multiply
        int rightProduct = 1;
        for(int i = arr.length - 1; i>-0; i--){
            result[i] = rightProduct;
            rightProduct*= arr[i];
        }


       return result;
    }
}

package TwoPointers;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
   int [] intersectionResult = new int[]{};
    public int[] findIntersectionOfTwoSortedArrays(int arr1[], int arr2[]){
        for(int i =0, j=0; i<arr1.length && j<arr2.length; ){
            if(arr1[i]== arr2[j]){
              for(int k = 0; k<j-1+1; k++){
                  intersectionResult[k] = arr1[i];
                  i++;
                  j++;
              }

            }
            else if(arr1[i] < arr2[j]){
                 i++;
            }
            else{
                j++;
            }
        }
        return intersectionResult;
    }


    public static ArrayList<Integer> findIntersectionOfSortedArrays(int[] arr1, int[] arr2){
        int i = 0, j =0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            }
            if(arr1[i]< arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return result;
    }
}

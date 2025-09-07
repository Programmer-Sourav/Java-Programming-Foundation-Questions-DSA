package Arrays.Propeers;

import java.util.HashSet;

/*
You are given an array ‘ARR’ of size ‘N,’ and you have to tell the minimum number
of elements that need to be removed such that the array contains all distinct elements.
More formally, there should not be any ‘I’ and ‘J’ such that ‘I’ != ‘J’ and ‘ARR’[‘I’] = ‘ARR’[‘J’].
For example: Given ‘N’ = 4, 'ARR' = { 1, 2, 1, 2} Then the answer is 2 because 1 and 2 are
repeated once therefore we need to remove 2 elements.
 */

/**
 * ✅ Pattern Recap: This follows the Hashing / Frequency Counting
 * Pattern – we track unique elements to figure out how many duplicates must be deleted.
 */
public class MakeUniqueArray {

    public static int returnCountOfElementsToBeRemoved(int arr[]){


        int [] arr1 = returnSortedArray(arr);
        System.out.print("Sorted ");
        for(int num: arr1){
            System.out.print(num);
        }
        int count = 0;
        for(int i =0 ; i<arr1.length-1; i++){
            if(arr1[i]== arr1[i+1])
                count++;
        }
        return count;
    }

    public static int returnCountOfElements(int arr[]){
        HashSet hs = new HashSet();
        //best way
        for (int num : arr) {
            hs.add(num);
        }
        // Total elements - distinct elements = elements to remove
        return  arr.length - hs.size();
    }
    public static  int[] returnSortedArray(int arr[]){
        int n = arr.length;
        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {  // swap if out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
       int arr [] = { 1, 2, 1, 2};
       //int count = returnCountOfElementsToBeRemoved(arr);
        int count = returnCountOfElements(arr);
       System.out.print("Count "+count);
    }
}

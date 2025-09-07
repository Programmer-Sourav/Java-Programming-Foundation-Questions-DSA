package Arrays.Propeers;


/**
 * Problem statement
 * You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. Both these arrays are sorted in non-decreasing order. You have to find the intersection of these two arrays.
 *
 * Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.
 *
 * Note :
 * 1. The length of each array is greater than zero.
 * 2. Both the arrays are sorted in non-decreasing order.
 * 3. The output should be in the order of elements that occur in the original arrays.
 * 4. If there is no intersection present then return an empty array.
 */

import java.util.ArrayList;

/**
 *
 * 🔹 Approach:
 *
 * Use two pointers i (for A) and j (for B).
 *
 * Compare A[i] and B[j]:
 *
 * If A[i] == B[j] → add to result, move both i++ and j++.
 *
 * If A[i] < B[j] → increment i.
 *
 * Else (A[i] > B[j]) → increment j.
 *
 * Continue until one pointer reaches the end.
 *
 * ⏱️ Time Complexity → O(N + M)
 * 📦 Space Complexity → O(1) (excluding result storage).
 */
public class IntersectionOfArray {


    public static ArrayList<Integer> intersectionOfArray(int arr1[], int arr2[]){
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = 0;

        while(left < arr1.length && right < arr2.length){
            if(arr1[left] == arr2[right]){
                result.add(arr1[left]);
                left++;
                right++;
            }
            else if (arr1[left] < arr2[right]) {
                left++;
            } else {
                right++;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int [] arr1 = {1, 2, 3, 6, 8, 10, 15, 25, 30};
        int [] arr2 = {5, 7, 9, 10, 15, 25, 26, 27, 28, 30};
        System.out.println(intersectionOfArray(arr1, arr2));
    }
}

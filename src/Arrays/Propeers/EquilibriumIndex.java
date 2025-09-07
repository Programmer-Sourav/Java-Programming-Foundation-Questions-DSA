package Arrays.Propeers;

/**
 * Problem statement You are given an array Arr consisting of N integers.
 * You need to find the equilibrium index of the array. An index is considered
 * as an equilibrium index if the sum of elements of the array to the left of
 * that index is equal to the sum of elements to the right of it.
 * ote: 1. The array follows 0-based indexing, so you need to return the 0-based index of the element.
 * 2. Note that the element at the equilibrium index won’t be considered for either left sum or right sum.
 * 3. If there are multiple indices which satisfy the given condition, then return the left-most index
 * i.e if there are indices i,j,k…. which are equilibrium indices, return the minimum among them
 * 4. If no such index is present in the array, return -1.
 */

/**
 * Problem: Equilibrium Index
 * We are given an array Arr of size N.
 * We need to find an index i such that:
 * sum(arr[0..i-1])
 * sum(arr[i+1..N-1])
 * sum(arr[0..i-1])=sum(arr[i+1..N-1])
 * If multiple equilibrium indices exist → return the smallest one.
 * If none exist → return -1.
 */

/**
 * 🔹 DSA Pattern Used
 * 👉 Prefix Sum Pattern
 * Instead of recomputing left/right sums repeatedly (O(n^2)), we can:
 * Compute total sum once.
 * Traverse and maintain leftSum.
 * Derive rightSum efficiently using:
 * rightSum
 * totalSum - leftSum - arr[i]
 * rightSum=totalSum - leftSum - arr[i]
 * 🔹 Approach
 *
 * Compute totalSum of array.
 * Initialize leftSum = 0.
 * Traverse array:
 * At index i, compute rightSum = totalSum - leftSum - arr[i].
 * If leftSum == rightSum, return i.
 * Update leftSum += arr[i].
 * If no equilibrium index → return -1.
 */
public class EquilibriumIndex {

    public static  int getTheEquilibriumIndex(int arr[]){
        int sum = 0, leftSum = 0;
        for (int num : arr){
            sum = sum + num;
        }

        for(int i =0 ; i< arr.length ; i++){
            int rightSum = sum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr1 = {1, 7, 3, 6, 5, 6};
        int[] arr2 = {1, 2, 3};

        System.out.println(getTheEquilibriumIndex(arr1)); // 3
        System.out.println(getTheEquilibriumIndex(arr2)); // -1

    }
}

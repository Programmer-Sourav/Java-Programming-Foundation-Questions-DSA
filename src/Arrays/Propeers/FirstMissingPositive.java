package Arrays.Propeers;

/**
 *
 * Problem statement You are given an array 'ARR' of integers of length N.
 * Your task is to find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can have negative numbers as well. For example, the input [3, 4, -1, 1] should
 * give output 2 because it is the smallest positive number that is missing in the input array.
 */
public class FirstMissingPositive {

    public static int findFirstMissingPositive(int arr[]){
        int n = arr.length;

        // Step 1: Place numbers in their correct index (x should be at index x-1)
        for(int i =0 ; i< n ; i++){
            while(arr[i]>0 && arr[i] <=n && arr[arr[i]-1]!= arr[i]){
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp -1] = temp;
            }
        }
        // Step 2: Find the first index where index+1 != value
        for(int i = 0 ; i<=n ; i++){
            if(arr[i]!= i+1){
                return i+1;
            }
        }
        // Step 3: If all positions are correct, answer is n+1
        return n+1;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findFirstMissingPositive(arr)); // Output: 2

        int[] arr2 = {1, 2, 0};
        System.out.println(findFirstMissingPositive(arr2)); // Output: 3

        int[] arr3 = {7, 8, 9, 11, 12};
        System.out.println(findFirstMissingPositive(arr3)); // Output: 1
    }
}

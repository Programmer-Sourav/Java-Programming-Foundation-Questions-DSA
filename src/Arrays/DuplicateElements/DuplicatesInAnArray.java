package Arrays.DuplicateElements;

import java.util.HashSet;

/**
 *  Problem Statement
 * Given an array containing n numbers where each number is between 1 and n-1, find any duplicate.
 * 🔹 Input: [1, 3, 4, 2, 2]
 * 🔹 Output: 2
 *
 */
public class DuplicatesInAnArray {
/**
 * Brute Force – Nested Loop (O(n²))
 * Compare each element with all other elements.
 * Time Complexity: O(n²)
 */

/**
 * Using HashSet (O(n), O(n)) – Efficient Approach
 * Store numbers in a Set.
 * If a number is already in the set, return it.
 *
 */

public static int  findDuplicate(int arr[]){
    HashSet<Integer> seen = new HashSet<>();
    int duplicate;
    for(int element : arr){
        if(seen.contains(element)) {
            duplicate = element;
            return duplicate;
        }
        seen.add(element);
    }
    return -1; //no duplicates found
}
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr)); // Output: 2
    }
//✅ Time Complexity: O(n)
//✅ Space Complexity: O(n)

    /***
     *
     * Floyd’s Cycle Detection Algorithm (O(n), O(1)) – Best Approach
     * Treat the array as a linked list and find the cycle using slow and fast pointers.
     * Steps:
     * Use slow (tortoise) and fast (hare) pointers.
     * When they meet, find the duplicate.
     */

    /***
     *
     * Phase 1: The tortoise moves one step at a time, while the hare moves two steps at a time.
     * If there's a cycle, they will eventually meet.
     * Phase 2: Once the tortoise and hare meet, we reset the tortoise to the beginning of the array.
     * Then, both the tortoise and hare move one
     * step at a time. The point at which they meet again is the duplicate number.
     *
     */

    public static int findDuplicateWithFirstPointerAndSlowPointer(int arr[]) {
        int tortoise = arr[0]; // Start tortoise at the first element
        int hare = arr[0]; // Start hare at the first element

        // Phase 1: Find intersection point
        do {
            tortoise = arr[tortoise]; // Move tortoise by one step
            hare = arr[arr[hare]]; // Move hare by two steps
        } while (tortoise != hare); // Keep looping until they meet

        // Phase 2: Find the entrance to the cycle
        tortoise = arr[0]; // Start tortoise at the beginning of the array
        while (tortoise != hare) {
            tortoise = arr[tortoise]; // Move tortoise by one step
            hare = arr[hare]; // Move hare by one step
        }

        return tortoise; // Return the duplicate number
    }

}

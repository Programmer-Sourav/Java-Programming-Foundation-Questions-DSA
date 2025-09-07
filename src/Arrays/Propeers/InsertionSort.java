package Arrays.Propeers;


/**
 * Problem statement You are given ‘N’ integers in the form of an array ‘ARR’.
 * Print the sorted array using the insertion sort. Note : No need to return anything.
 * You should sort the array in-place. For example : Let ‘ARR’ be: [1, 4, 2]
 * The sorted array will be: [1, 2, 4].
 */

/**
 * ⚡ Time Complexity:
 * Worst Case: O(N^2) (when array is reverse sorted)
 * Best Case: O(N) (when array is already sorted)
 * In-place and stable sorting.
 */

/**
 * Step-by-step — Insertion Sort
 * Insertion sort builds a sorted portion of the array one element at a time by taking the next element (the key) and inserting it into the correct position among the previously-sorted elements (by shifting larger elements right). It’s intuitive, stable, in-place, and runs very fast on nearly-sorted arrays.
 * Short algorithm
 * For i from 1 to n-1:
 * key = arr[i]
 * Compare key with elements to its left (arr[i-1], arr[i-2], ...)
 * Shift any element > key one position to the right
 * Insert key at the position freed
 */

/**
 * Properties & complexity
 *
 * Time:
 *
 * Worst / Average: O(n²) (many shifts)
 *
 * Best (already sorted): O(n) — only comparisons, no shifts
 *
 * Space: O(1) (in-place)
 *
 * Stable: yes — equal elements keep original order
 *
 * Adaptive: fast when array is nearly sorted
 *
 * Online: can sort as elements arrive (useful for streaming insertion)
 */

/**
 * 🔹 Algorithm (high-level)
 *
 * For each index i from 1 to n-1:
 *
 * Save key = arr[i].
 *
 * Use binary search on arr[0..i-1] to find the correct insertion position.
 *
 * Shift elements right to make room for key.
 *
 * Insert key.
 */

/**
 * Complexity
 *
 * Comparisons: O(log n) per insertion (binary search).
 *
 * Shifts: still O(n) in worst case (shifting large parts of array).
 *
 * Overall: O(n²) but with fewer comparisons than normal Insertion Sort.
 *
 * Space: O(1) (in-place).
 *
 * Stable: Yes (if you place equal elements after duplicates).
 */

/**
 * 🔹 What’s happening?
 *
 * When we find the position (loc) where key should be inserted, all elements **from loc to i-1** must be shifted one step right to make space for key`.
 *
 * That’s where j-- comes in.
 *
 * 🔹 Example
 *
 * Array = [2, 4, 5, 6, 1]
 * We’re at i = 4 → key = 1
 * Binary search says → loc = 0
 *
 * Now:
 *
 * Start with j = i - 1 = 3 (arr[3] = 6)
 *
 * While j >= loc (0):
 *
 * arr[j+1] = arr[j]
 *
 * Then j--
 *
 * Step-by-step:
 *
 * j=3 → arr[4] = arr[3] → [2, 4, 5, 6, 6]
 * j=2 → arr[3] = arr[2] → [2, 4, 5, 5, 6]
 * j=1 → arr[2] = arr[1] → [2, 4, 4, 5, 6]
 * j=0 → arr[1] = arr[0] → [2, 2, 4, 5, 6]
 *
 *
 * Now j = -1 → exit loop.
 * Finally → arr[loc] = key → [1, 2, 4, 5, 6].
 *
 * 🔹 Why j--?
 *
 * Because we are moving leftward:
 *
 * First shift element at index 3 → move it to index 4.
 *
 * Then shift element at index 2 → move it to index 3.
 *
 * Then shift element at index 1 → move it to index 2.
 *
 * Keep going until we reach the insertion spot.
 *
 * If we didn’t do j--, the loop would get stuck at the same index.
 *
 * ✅ So j-- means: keep shifting elements leftward until the correct position is freed for key.
 */
public class InsertionSort {

    // Binary search to find correct index for key
    private static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid + 1; // place after duplicates
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Find index where key should be inserted
            int loc = binarySearch(arr, key, 0, j);

            // Shift elements to right
            while (j >= loc) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[loc] = key;
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for (int i = 0 ; i< n; i++){
            int key = arr[i]; //currentElement
            int j = i-1; //preceding Element

            while (j>=0 && arr[j]>key){
                 arr[j+1] = arr[j]; //shift it to the right
                j--;
            }
            // Place key in its correct position
            arr[j+1] = key;
        }
    }

    public static void main(String args[]){
        int[] arr = {1, 4, 2};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

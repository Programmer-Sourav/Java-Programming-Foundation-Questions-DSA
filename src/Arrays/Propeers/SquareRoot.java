package Arrays.Propeers;


/**
 You are given a positive integer ‘n’. Your task is to find and return its square root.
 If ‘n’ is not a perfect square, then return the floor value of sqrt(n).
 Example: Input: ‘n’ = 7 Output: 2 Explanation: The square root of the
 number 7 lies between 2 and 3, so the floor value is 2
 */

/**
 * 🔑 Approach:
 *
 * We can solve this using Binary Search in the range [1, n].
 * Let low = 1, high = n, and ans = 0.
 * While low <= high:
 * Compute mid = (low + high) / 2.
 * If mid * mid == n, return mid (perfect square).
 * If mid * mid < n, then mid is a possible answer → store ans = mid, and search in the right half (low = mid + 1).
 * If mid * mid > n, search in the left half (high = mid - 1).
 * Finally, return ans (floor of √n).
 * ⏱ Complexity:
 * Time: O(log n) (binary search range)
 * Space: O(1)
 */
public class SquareRoot {

    public static int floorSqrt(int n){
        if(n==0 || n==1) return n;

        int low = 1, high = n, ans = 0;

        while(low<=high){
            int mid = low + (high - low)/2;
            //System.out.print("Mid "+ mid);
            long sq = (long) mid * mid; // use long to avoid overflow

            if(sq == n){
                return mid; // perfect square
            }
            else if (sq < n) {
                ans = mid;  // possible answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return ans; // floor sqrt
    }
    public static void main(String[] args) {
        System.out.println(floorSqrt(7));   // 2
        System.out.println(floorSqrt(16));  // 4
        System.out.println(floorSqrt(27));  // 5
    }
}

package Arrays.Propeers;

/**
 * Problem: Sum of zeros. You are given a binary matrix (it contains only 0s and 1s)
 * with dimensions ‘N * M’. You need to find and return the sum of coverages of all
 * zeros of the given matrix. Coverage for a particular 0 is defined as the total
 * number of ‘1s’ around it (i.e., immediate left, immediate right, immediate up,
 * and immediate bottom positions)
 */

/* *
 * This is a matrix traversal + adjacency check type of problem.
 * */

    /*

    🔹 Problem Restatement

We are given a binary matrix (N x M, only 0s and 1s).
We need to compute the sum of coverages of all zeros.

👉 Coverage of a zero = number of 1s among its four neighbors:

Left (i, j-1)

Right (i, j+1)

Up (i-1, j)

Down (i+1, j)

Return the total sum.

🔹 Example

Matrix:

1 0 1
0 1 0
1 0 1


At (0,1) → neighbors = left=1, right=1, down=1 → coverage = 3

At (1,0) → neighbors = right=1, up=1, down=1 → coverage = 3

At (1,2) → neighbors = left=1, up=1, down=1 → coverage = 3

At (2,1) → neighbors = left=1, right=1, up=1 → coverage = 3

👉 Total = 3+3+3+3 = 12
     */

/**
 ** Got it 👍 Let’s break down this line:
 * if (i > 0 && matrix[i - 1][j] == 1) {
 *     coverage++;
 * }
 * ✅ What’s happening?
 * We are currently at a zero cell matrix[i][j].
 * We want to check its upward neighbor (row just above it).
 * ✅ Step-by-step meaning
 * i > 0
 * This ensures that we are not at the first row (row = 0).
 * If i == 0, then there is no row above, so we must skip to avoid ArrayIndexOutOfBoundsException.
 * matrix[i - 1][j] == 1
 * If the cell directly above (row i-1, same column j) contains 1, then it contributes to the coverage of this zero.
 * coverage++
 * Increase the coverage count by 1 since we found a 1 neighbor above.
 * ✅ Example
 * Matrix:
 * 1 0 1
 * 0 0 1
 * 1 1 0
 * Let’s say we’re at matrix[1][0] (which is 0).
 * i = 1, j = 0
 * Check upward neighbor → matrix[0][0] = 1
 * Since it’s 1, coverage becomes +1.
 * 🔑 In simple words:
 * 👉 "If we are not on the first row, and the cell above this zero is a 1, then count it as coverage."
 **/

/**
 * 🔹 Complexity
 * Time: O(N*M) (visit each cell + 4 checks).
 * Space: O(1) (only counters and direction arrays).
 * ✅ Pattern Recap: This follows the Matrix Traversal with Direction Vectors Pattern,
 * commonly used for adjacency-based grid problems (like BFS/DFS in grids).
 */
public class SumOfZeros {


    public static int sumOfZerosCoverage( int [][] matrix){

        int totalCoverage = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++) {
                if (matrix[i][j] == 0) {
                    int coverage = 0;
                    //Up
                    if (i > 0 && matrix[i - 1][j] == 1) {
                        coverage++;
                    }
                    //Down
                    if (i < n - 1 && matrix[i + 1][j] == 1) {
                        coverage++;
                    }
                    //left
                    if (j > 0 && matrix[i][j - 1] == 1) {
                        coverage++;
                    }
                    //right
                    if (j < m - 1 && matrix[i][j + 1] == 1) {
                        coverage++;
                    }
                    totalCoverage = totalCoverage + coverage;
                }
            }
        }
        return totalCoverage;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1},
                {0, 0, 1},
                {1, 1, 0}
        };

        System.out.println(sumOfZerosCoverage(matrix)); // Output: 8
    }
}

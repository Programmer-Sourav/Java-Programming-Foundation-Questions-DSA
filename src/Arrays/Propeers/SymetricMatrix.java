package Arrays.Propeers;

/**
 * Problem: Matrix is Symmetric- Problem statement You are given a square matrix,
 * return true if the matrix is symmetric otherwise return false. A symmetric
 * matrix is that matrix whose transpose is equal to the matrix itself. Example of symmetric matrix :
 */
public class SymetricMatrix {

    public static boolean isSymmetricMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0 ; i<n ; i++){
            for(int j = i + 1; j < n; j++){
                  if(matrix[i][j]!= matrix[j][i])
                      return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
        System.out.println(isSymmetricMatrix(matrix1)); // true

        int[][] matrix2 = {
                {1, 0, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
        System.out.println(isSymmetricMatrix(matrix2)); // false
    }
}

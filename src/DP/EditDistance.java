package DP;

/**
 * Edit Distance (DP - 2D Table)
 * Pattern:
 * Levenshtein distance using tabulation.
 */

/**
 * Given two strings word1 and word2, return the minimum number
 * of operations required to convert word1 into word2.
 * You have the following operations:
 * Insert a character
 * Delete a character
 * Replace a character
 */
public class EditDistance {
   public int minDistance(String a, String b){
       int m = a.length();
       int n = b.length();

       int [][] dp = new int[m+1][n+1];

       for(int i =0 ; i<=m; i++) dp[i][0] = i;
       for(int j = 0; j<=m; j++) dp[0][j] = j;

       for (int i = 1; i <= m; i++)
           for (int j = 1; j <= n; j++)
               if (a.charAt(i - 1) == b.charAt(j - 1)) {
                   dp[i][j] = dp[i - 1][j - 1]; // no change needed
               } else {
                   dp[i][j] = 1 + Math.min(
                           dp[i - 1][j - 1], // replace
                           Math.min(
                                   dp[i - 1][j],   // delete
                                   dp[i][j - 1]    // insert
                           )
                   );
               }
       return dp[m][n];

   }
}

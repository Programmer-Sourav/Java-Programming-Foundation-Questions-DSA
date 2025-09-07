package DP;

/**
 * Coin Change (DP - Bottom Up)
 *Pattern:
 * Classic unbounded knapsack.
 * We build up a DP array where dp[i] = min coins needed to make i.
 */

/**
 * Given an integer array coins representing coin denominations
 * and an integer amount, return the fewest number of coins needed
 * to make up that amount. If it’s not possible to make up the amount,
 * return -1. You may assume you have an infinite number of each coin.
 */
/**
 * 🔍 Goal of the Problem
 * Given an array of coin denominations (coins[]) and a total amount (amount), return the minimum number of coins needed to make up that amount.
 * If it’s not possible, return -1.
 *
 * 🧠 High-Level Idea:
 * We use Dynamic Programming to build a solution bottom-up.
 * Create a dp[] array where:
 *
 * dp[i] = minimum number of coins needed to make amount i
 *
 * 🔧 Line-by-Line Explanation:
 * int []dp = new int[amount+1];
 * Create an array dp of size amount + 1 (from 0 to amount).
 *
 * Arrays.fill(dp, amount+1);
 * Fill the array with a large value (amount + 1 is like "infinity" here) since we want to find the minimum.
 *
 * Why amount+1? Because it's impossible to need more than amount coins (using only 1s), so anything more than that is "impossible".
 *
 * dp[0] = 0;
 * Base case: It takes 0 coins to make amount 0.
 *
 * for(int coin : coins){
 *     for(int i = coin; i<=amount; i++){
 *         dp[i] = Math.min(dp[i], dp[i-coin]+1);
 *     }
 * }
 * 🧩 Let’s break this down:
 * Outer loop:
 * for(int coin : coins)
 * For each type of coin (e.g., 1, 2, 5...), we try to use it to build up solutions.
 *
 * Inner loop:
 * for(int i = coin; i <= amount; i++)
 * We try to update the minimum number of coins needed for all amounts from coin to amount.
 *
 * 💡 Key Part: dp[i] = Math.min(dp[i], dp[i-coin] + 1);
 * dp[i]: current minimum coins needed to make amount i
 *
 * dp[i - coin] + 1: what if we use this coin?
 *
 * Why this works:
 * If we know how many coins are needed for i - coin, then:
 *
 * We can add 1 coin (of value coin) to make up i.
 *
 * So, the new candidate for dp[i] is dp[i - coin] + 1.
 *
 * Take the minimum of the existing value and this new candidate.
 *
 * 🧾 Return statement:
 * return dp[amount] > amount ? -1 : dp[amount];
 * If the value is still larger than amount, it means we never found a valid way to make the amount → return -1.
 *
 * Otherwise, return dp[amount].
 *
 * 🧪 Example:
 * coins = [1, 2, 5]
 * amount = 11
 * DP array evolves like this (simplified):
 *
 * Start: dp = [0, ∞, ∞, ∞, ∞, ∞, ∞, ∞, ∞, ∞, ∞, ∞]
 *
 * After processing coin 1: dp = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
 *
 * After coin 2: dp = [0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6]
 *
 * After coin 5: dp = [0, 1, 1, 2, 2, 1, 2, 2, 3, 3, 2, 3]
 *
 * → Final answer: dp[11] = 3 (e.g., 5 + 5 + 1)
 *
 * ✅ Summary
 * Dynamic programming approach.
 *
 * dp[i] = minimum coins to make amount i
 *
 * dp[i - coin] + 1 considers using one more coin of value coin.
 *
 * Let me know if you want this rewritten in Python or walked through with a custom example.
 *
 */

import java.util.Arrays;

/**1,2,5,10, amount = 7 **/
public class CoinChange {
   public int coinChange(int[] coins, int amount){
       int []dp = new int[amount+1];
       Arrays.fill(dp, amount+1);
       dp[0] = 0;

       for(int coin : coins){
           for(int i = coin; i<=amount; i++){
               dp[i] = Math.min(dp[i], dp[i-coin]+1);
           }
       }
       return  dp[amount] >amount ? -1 : dp[amount];
   }
}

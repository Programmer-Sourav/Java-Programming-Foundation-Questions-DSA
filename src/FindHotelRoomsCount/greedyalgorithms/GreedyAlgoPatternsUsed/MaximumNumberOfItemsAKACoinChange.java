package FindHotelRoomsCount.greedyalgorithms.GreedyAlgoPatternsUsed;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 4. Maximize Number of Items
 * Problem: Coin Change (Min Coins)
 * Goal: Use minimum number of coins to form a total.
 */

/**
 * ⚠️ Works only when coin denominations are canonical (e.g. US coins).
 * Doesn't always work optimally for arbitrary coins.
 */
public class MaximumNumberOfItemsAKACoinChange {
    public static  void minCoins(int [] coins, int amount){
        Arrays.sort(coins); //1,2,5,10
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = coins.length-1; i>=0 && amount>0; i--){
            while(amount>=coins[i]){
                //currentAmount
                amount = amount - coins[i]; //8 after first iteration
                result.add(coins[i]);  //10 after first iteration
            }
        }
        System.out.println("Coins used: " + result);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10};
        int amount = 18;
        minCoins(coins, amount); // Output: [10, 5, 2, 1]
    }
}

public class BuyOrSellStocks {
    /***
     *
     * Pattern: Sliding Window / Kadane’s Algorithm
     *
     * Approach:
     *
     * Keep track of the minimum price seen so far.
     *
     * Compute max profit at each step.
     *
     * Time Complexity: O(n)
     *
     *
     *
     */

    /**
     * Pattern:
     *
     * Single Pass: Iterate through the array once, keeping track of the minimum price and maximum profit.
     *
     *
     * @param inputStocksPrices
     * @return
     */

    private int getStockPrice(int [] inputStocksPrices){
        int min = 0, maxProfit = 0, currentMinPrice = 0;
        for(int i = 0; i<inputStocksPrices.length; i++){
            currentMinPrice = Math.max(min, inputStocksPrices[i]);
            maxProfit = Math.max(maxProfit, inputStocksPrices[i]-currentMinPrice);
        }
        return maxProfit;
    }
}

package FindHotelRoomsCount.greedyalgorithms;

import java.util.Arrays;

/**
 * ✅ 1. Fractional Knapsack
 * Problem Statement:
 * You are given n items with weights and values. Your task is to put these items in a knapsack
 * of capacity W such that you maximize the total value. You can take fractions of items.
 *
 * 🔍 Greedy Strategy:
 * Compute value/weight for each item.
 *
 * Sort in descending order of this ratio.
 *
 * Take as much as possible from the item with the highest ratio.
 *
 */

class Item{
    int value, weight;

    Item(int value, int weight){
        this.value = value;
        this.weight = weight;
    }
}
public class FractionalKnapSack {

    public double getMaxValue(Item[] items, int maxCapacity){
        Arrays.sort(items, (a,b) -> Double.compare((double) (b.value/b.weight), (double)  (a.value/a.weight)));
        double totalValue = 0.0;

        for(Item item : items){
            if(maxCapacity==0) break;
            if(item.weight<=maxCapacity){
                totalValue = totalValue + item.value;
                maxCapacity = maxCapacity - item.weight;
            }
            else{
                totalValue = totalValue + ((double) item.value /item.weight) * maxCapacity;
                maxCapacity = 0;
            }
        }
        return totalValue;
    }


    public static  void main(String args[]){
        Item [] items = {new Item(4,5), new Item(6,7), new Item(8,9)};
        FractionalKnapSack fractionalKnapSack = new FractionalKnapSack();
        double maxVal = fractionalKnapSack.getMaxValue(items, 13);
        System.out.print("Max Val "+ String.valueOf(maxVal));
    }
}

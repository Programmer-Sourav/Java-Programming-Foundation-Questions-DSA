package FindHotelRoomsCount.greedyalgorithms;

import java.util.PriorityQueue;

/**
 * ✅ 3. Minimum Cost to Connect Ropes
 * (Greedy + Priority Queue)
 *
 * 🧠 Intuition: Always combine two shortest ropes first (like Huffman coding).
 */
public class ConnectRopes {
    public int minCosts(int [] ropes){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int cost : ropes) pq.add(cost);

        int totalCost = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int currentCost = first + second;
            totalCost = totalCost + currentCost;
            pq.add(totalCost);
        }
        return totalCost;
    }
}

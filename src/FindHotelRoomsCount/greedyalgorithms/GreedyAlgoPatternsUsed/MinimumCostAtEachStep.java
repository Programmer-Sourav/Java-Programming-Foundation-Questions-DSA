package FindHotelRoomsCount.greedyalgorithms.GreedyAlgoPatternsUsed;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 3. Minimum Cost at Each Step
 * Problem: Huffman Coding Tree
 *
 * Goal: Build a binary tree with minimal weighted path length.
 */

class Node{

    int frequency;
    Node left;
    Node right;
    Node(int f){
        this.frequency = f;
    }
}

public class MinimumCostAtEachStep {

    public static int buildTree(int[] frequencies){
        PriorityQueue<Node> pq = new PriorityQueue<Node>(Comparator.comparingInt(n->n.frequency));

        for(int freq : frequencies){
            pq.add(new Node(freq));
        }

        int totalCost = 0;

        while(pq.size()>1){
            Node left = pq.poll();
            Node right = pq.poll();
            assert right != null;
            Node parent = new Node(left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            totalCost = totalCost + parent.frequency;
            pq.add(parent);
        }
        return totalCost;
    }

    public static void main(String args[]){
        int[] freqs = {5, 9, 12, 13, 16, 45};
        System.out.println("Total cost: " + buildTree(freqs)); // Output: 224
    }
}

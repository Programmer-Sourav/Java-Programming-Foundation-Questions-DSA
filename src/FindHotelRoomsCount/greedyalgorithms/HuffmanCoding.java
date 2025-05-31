package FindHotelRoomsCount.greedyalgorithms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * ✅ 5. Huffman Coding
 * Problem:
 * Given characters and their frequencies, build the optimal prefix code (shortest total length).
 *
 * 🔍 Greedy Strategy:
 * Use a min-heap.
 *
 * Combine the two lowest frequency nodes repeatedly.
 *
 */

class HuffmanNode{
    int freq;
    char ch;

    HuffmanNode left, right;
    HuffmanNode (char ch, int freq){
        this.freq = freq;
        this.ch = ch;
    }

    HuffmanNode(int freq, HuffmanNode left, HuffmanNode right){
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}
public class HuffmanCoding {

    public void buildCode(HashMap<Character, Integer> frequencyMap){

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(Comparator.comparingInt(a->a.freq));

        for(Map.Entry<Character, Integer> entry: frequencyMap.entrySet()){
            pq.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (pq.size()>1){
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            assert right != null;
            HuffmanNode merged = new HuffmanNode(left.freq + right.freq, left, right);
            pq.offer(merged);
        }

     printCodes(pq.peek(), "");
    }

    private void printCodes(HuffmanNode node, String code) {
        if(node == null) return;
        if(node.left == null && node.right == null){
            System.out.println(node.ch + ": " + code);
        }
        printCodes(node.left, code + "0");
        printCodes(node.right, code + "1");
    }
}

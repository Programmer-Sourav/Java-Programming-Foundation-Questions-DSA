package StackQueuesSlidingWindows;

/**
 *
 * Sliding Window Maximum
 * You are given an array of integers nums and an integer k.
 * There is a sliding window of size k moving from the left to the right across the array.
 * Return an array of the maximum value in each window.
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Sliding Window Maximum — Monotonic Deque
 */
public class MonotonicDeque {

    public int[] maxSlidingWindow(int [] nums, int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length, p = 0;
        int [] res = new int[n-k+1];

        for(int i =0; i<n; i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]< nums[i]) dq.pollLast();
            dq.offerLast(i);
            if(i>= k -1) res[p++] = nums[dq.peekFirst()];
        }
     return res;
    }
}

package StackQueuesSlidingWindows;

/**
 * Trapping Rainwater
 * Given n non-negative integers representing
 * an elevation map where the width of each bar is 1,
 * compute how much water can be trapped after raining.
 */

/**
 *
 *  1. Problem Recap
 * We are given an array h representing heights of bars in a histogram.
 * We want to find how much rainwater can be trapped between the bars after it rains.
 *
 * Example:
 * h = [4,2,0,3,2,5]
 * Water trapped = 9
 * 2. Variables
 * int l = 0, r = h.length - 1; // left and right pointers
 * int lm = 0, rm = 0;          // left max height, right max height so far
 * int ans = 0;                 // total trapped water
 * l → starts from left
 *
 * r → starts from right
 *
 * lm → tallest bar seen so far from the left
 *
 * rm → tallest bar seen so far from the right
 *
 * 3. Main Loop
 * while (l < r) {
 *     if (h[l] < h[r]) {
 *         if (h[l] >= lm) lm = h[l];
 *         else ans += lm - h[l];
 *         l++;
 *     } else {
 *         if (h[r] >= rm) rm = h[r];
 *         else ans += rm - h[r];
 *         r--;
 *     }
 * }
 * Logic:
 * 💡 Key insight:
 * The amount of water above a bar depends on the minimum of the tallest bars to its left and right.
 * If h[l] < h[r], then we know left max (lm) determines the trapped water for the l side
 * — because even if the right side is tall, water can't rise above the shorter side.
 *
 * Case 1: h[l] < h[r]
 * We process the left side:
 *
 * If current bar h[l] ≥ lm, update lm (new tallest on left).
 *
 * Else, trapped water = lm - h[l].
 *
 * Move l one step right.
 *
 * Case 2: h[l] >= h[r]
 * We process the right side:
 *
 * If current bar h[r] ≥ rm, update rm (new tallest on right).
 *
 * Else, trapped water = rm - h[r].
 *
 * Move r one step left.
 *
 * 4. Why It Works
 * By always processing the smaller side, we ensure we already know the limiting
 * height for water trapping at that side. This avoids needing extra arrays for leftMax and rightMax.
 *
 * 5. Example Walkthrough
 * h = [4,2,0,3,2,5]
 *
 * Step	l	r	lm	rm	ans
 * Init	0	5	0	0	0
 * 1	0	5	4	0	0
 * 2	1	5	4	0	2
 * 3	2	5	4	0	6
 * 4	3	5	4	0	7
 * 5	4	5	4	0	9
 * 6	5	5
 *
 * Final Answer: 9 units of water.
 *
 * 6. Complexity
 * Time: O(n) → single pass with two pointers.
 *
 * Space: O(1) → constant extra variables.
 *
 * If you want, I can also rewrite this as the DP prefix-suffix max array version
 * so you see why this two-pointer approach is more space-efficient. That version uses O(n) space.
 */
public class TrappingRainWater {
    public int trap(int [] h ){
        int l = 0, r = h.length - 1, lm = 0, rm = 0, ans = 0;

        while (l < r){
            if(h[l] < h[r]){
                if(h[l] >= lm) {
                    lm = h[l];
                }
                    else ans = ans + lm - h[l];
                    l++;
                }
                else{
                   if(h[r]>= rm)
                       rm  = h[r];
                   else
                       ans = ans + rm - h[r];
                       r--;


                }
            }
        return ans;
        }
    }


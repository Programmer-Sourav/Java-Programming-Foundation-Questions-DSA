package FindHotelRoomsCount.greedyalgorithms;

/**
 ✅ 1. Minimum Number of Arrows to Burst Balloons
 (Greedy + Sorting)

 🧠 Intuition: Sort balloons by end points. Always shoot the arrow at the end of the first balloon; skip overlapping ones.
 */

import java.util.Arrays;
import java.util.Comparator;

/**
🧩 Why Greedy? Choose local optimal (earliest end) to minimize total arrows.
 */
public class BurstBaloons {

    public int findArrowShots(int [][] points){
        if(points.length==0) return 0 ;

        Arrays.sort(points, Comparator.comparingInt(a->a[1]));

        int arrows = 1;
        int end = points[0][1];

        for(int i = 1; i<points.length; i++){
            if(points[i][0]>end) {
                arrows++;
                end = points[i][1];
            }
        }
      return arrows;
    }

}

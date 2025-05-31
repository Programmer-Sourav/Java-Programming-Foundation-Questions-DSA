package FindHotelRoomsCount.greedyalgorithms;

import java.util.Arrays;

/**
 * ✅ 3. Minimum Number of Platforms (Train Problem)
 * Problem:
 * Given arrival and departure times of trains, find the minimum number of platforms required so that no train waits.
 *
 * 🔍 Greedy Strategy:
 * Sort arrival and departure arrays.
 *
 * Use two pointers to simulate trains arriving and leaving.
 */


public class MinimumNumberOfPlatforms {

    public int findPlatforms(int [] arrivals, int [] departures){
        Arrays.sort(arrivals);
        Arrays.sort(departures);
        int platforms = 1, maxPlatforms = 1;
        int i = 1, j =0;

        while(i<arrivals.length && j<departures.length){
            if(arrivals[i] < departures[j]){
                platforms++;
                i++;
            }
            else{
                platforms --;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }
        return maxPlatforms;
    }

}

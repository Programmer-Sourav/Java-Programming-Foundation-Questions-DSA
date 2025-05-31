package FindHotelRoomsCount.greedyalgorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ✅ 2. Activity Selection
 * Problem:
 * You’re given n activities with start and end times. You must select the maximum number
 * of activities that don't overlap.
 *
 * 🔍 Greedy Strategy:
 * Sort activities by ending time.
 *
 * Pick the earliest finishing one that starts after the previous selected one ends.
 *
 *
 */

class Activity{
    int start, end;

    Activity(int s, int e){
        start = s;
        end = e;
    }
}

public class ActivitySelection {


    public int maxActivites(Activity[] activities){
        Arrays.sort(activities, Comparator.comparingInt(a->a.end));

        int count = 1;
        int lastEnd = activities[0].end;

       for(int i =1 ; i<activities.length; i++){
           if(activities[i].start >= lastEnd) {
               count++;
               lastEnd = activities[i].end;
           }
       }
       return count;
    }
}

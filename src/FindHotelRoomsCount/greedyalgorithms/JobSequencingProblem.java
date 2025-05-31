package FindHotelRoomsCount.greedyalgorithms;

import java.util.Arrays;

/**
 * ✅ 4. Job Sequencing Problem
 * Problem:
 * Each job has a deadline and profit. Schedule the jobs to maximize profit, ensuring each job takes 1 unit time and no two jobs overlap.
 *
 * 🔍 Greedy Strategy:
 * Sort jobs by profit (descending).
 * For each job, assign it to the latest available time before deadline.
 *
 */

class Job{
    int id, deadline, profit;

    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class JobSequencingProblem {

    public int maxProfit(Job [] jobs){
        Arrays.sort(jobs, (a, b)-> b.profit - a.profit);
        int maxDeadline = Arrays.stream(jobs).mapToInt(j->j.deadline).max().getAsInt();
        boolean [] slots = new boolean[maxDeadline + 1];
        int totalProfit = 0;

        for(Job job : jobs){
             for(int t= job.deadline ; t>0; t--){
                 if(!slots[t]){
                     slots[t] =  true;
                     totalProfit = totalProfit + job.profit;
                     break;
                 }
             }
        }
        return totalProfit;
    }

}

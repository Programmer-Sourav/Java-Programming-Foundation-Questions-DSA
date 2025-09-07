package FindHotelRoomsCount.greedyalgorithms;

/**
 * ✅ 7. Can Complete Circuit
 * (Greedy + Early Stopping)
 *
 * 🧠 Intuition: Track total gas vs cost, and if at any point balance < 0, reset start.
 *
 * Greedy works here because if the total gas is less than total cost,
 * no start index can complete the circuit. Otherwise, you can track
 * the current balance and reset when it goes negative.
 */

/**
 *  Greedy Reset: Restart from next station when current balance is negative.
 */
public class GasConsumer {

    public int canCompleteCircuit(int [] gas, int [] cost ){
        int total = 0, currTank = 0, start = 0;

        for(int i=0; i< gas.length; i++){
            total = total + gas[i] - cost[i];
            currTank = currTank + gas[i] - cost[i];

            if(currTank<0){
                start = i + 1;
                currTank = 0;
            }
        }
        return total>=0 ? start : -1;
    }
}

package recursion;

public class PowerOfNumber {


    private static int calculatePowerOfANumber(int number, int power){
        //9^3 = 9*9*9;
        if (power == 0) return 1;
        return number * calculatePowerOfANumber(number, power - 1);

    }

    public static void main (String args[]){
        PowerOfNumber.calculatePowerOfANumber(9, 3);
    }
}

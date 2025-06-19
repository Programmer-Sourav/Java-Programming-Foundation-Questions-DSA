package recursion;

public class SumOfFirstNNumbers {

    //n*(n-1)/2

    public  int sumOfNNumbers(int n){

        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        int result = 0;

        if(n==0) return result;
        else
            result = n+sumOfNNumbers(n-1);

        return result;

    }
    public static  void main(String args[]){
        SumOfFirstNNumbers sumOfFirstNNumbers = new SumOfFirstNNumbers();
        int sumOfNNumber = sumOfFirstNNumbers.sumOfNNumbers(9);
        System.out.print("Sum of Nos "+sumOfNNumber);
    }
}

package recursion;

public class Factorial {
    /**
    *  5! = 5*4*3*2*1 = 120
     *  n*(n-1)
    * */
    private int calculateFactorial(int n){

        int result = 1;

        if(n==1){
            return result;
        }
        else{
            result = n* calculateFactorial(n-1);
        }
        return result;
    }

    public static  void main (String args[]){
        Factorial factorial = new Factorial();
        int fact = factorial.calculateFactorial(5);
        System.out.print("Factorial === "+fact);
    }
}

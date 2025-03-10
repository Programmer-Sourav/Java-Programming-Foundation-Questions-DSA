public class Assignment {

    public static  void main(String[] args){
        String input = "Hello";
//        char charAt0th = input.charAt(0);
//        char charAtnth = input.charAt(4);
//        System.out.print("Output " + charAt0th + ", " + charAtnth);
        //
        String string = "";
        for(int i =0; i<input.length()-1; i++){
            string = input.charAt(0) +", "+input.charAt(input.length()-1);
            //System.out.print(string+", "+ input.charAt(i));
        }
        System.out.print("Assignment Op1 "+ string);

        String secondInput = "Banglore";
        StringBuilder secondOp = new StringBuilder();
        for(int i = 0; i<secondInput.length()-1; i=i+2){
            secondOp = secondOp.append(", "+secondInput.charAt(i));
        }
        String trimmedOp = secondOp.substring(1);
        System.out.print("Assignment Op2 "+ trimmedOp);
    }
}

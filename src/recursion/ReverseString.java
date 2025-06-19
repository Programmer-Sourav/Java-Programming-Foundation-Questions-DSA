package recursion;

public class ReverseString {


    private String getReversedString(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        char ch = input.charAt(input.length() - 1);
        //getCurrentChar(ch); // prints character
        return ch + getReversedString(input.substring(0, input.length() - 1));
    }

    private char getCurrentChar(char ch) {
       // System.out.print(ch); // side effect: print each character
        return ch;
    }

        public static void main(String args[]){
        ReverseString reverseString = new ReverseString();
        String reversed = reverseString.getReversedString("Nothing");
        System.out.print("Reversed "+reversed);
    }
}

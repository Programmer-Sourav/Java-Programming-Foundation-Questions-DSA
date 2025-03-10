package basic_string_manipulation;

public class ReverseString {

    public static void main (String args[]){
        String input = "Hello";
        String reversed = "";

//        for(int i = input.length()-1; i>=0; i--){
//            reversed = reversed + input.charAt(i);
//        }
        char[] charArray = input.toCharArray();
        for(int i = charArray.length -1 ; i>=0; i--){
            reversed = reversed + charArray[i];
        }

        System.out.print("Reversed "+ reversed);

    }
}

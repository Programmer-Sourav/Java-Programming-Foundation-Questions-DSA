package basic_string_manipulation;

public class ReverseEachWord {
    public static void main(String [] args){
        String strInp = "Java Is Fun";
        String [] arrayOfString = strInp.split("\\s+");
        String reversed = "";

        for(String word : arrayOfString){
            String result = callReverse(word);
            reversed = reversed +" "+ result;
        }
        System.out.print("Reversed "+reversed);
    }

    private static String callReverse(String word) {
        String reversedWord = "";
        for(int i = word.length()-1; i>=0; i--){
            reversedWord = reversedWord + word.charAt(i);
        }
        return reversedWord;
    }
}

package recursion;

public class Palindrome {


    //Process1
    private static String checkPalindrome(String input) {
        if (input == null || input.length() == 0) {
            return "Not Palindrome"; // or "Palindrome", depending on your definition
        }

        String reversed = reverseString(input);

        if (input.equals(reversed)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    private static String reverseString(String input) {
        if (input.length() == 0) {
            return "";
        }
        char ch = input.charAt(input.length() - 1);
        return ch + reverseString(input.substring(0, input.length() - 1));
    }


    //process2
    public static  boolean isPalindrome(String str, int left, int right){
        if(left>=right) return true;
        if(str.charAt(left)!=str.charAt(right)) return false;
        return isPalindrome(str, left+1, right-1);
    }

    public static void main(String args[]){
        System.out.print("Result "+Palindrome.checkPalindrome("MALAYALAM"));
        System.out.println(isPalindrome("madam", 0, 4)); // true
    }
}

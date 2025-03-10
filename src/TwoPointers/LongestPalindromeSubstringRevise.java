package TwoPointers;

public class LongestPalindromeSubstringRevise {

    public static void main(String [] args){
        /**
         * Input:
         * "babad"
         * Output:
         * "bab"
         */
        String input = "babad";
        String appended= "";
        String reversed = "";
        int left = 0;
        int right = input.length() - 1;

        while (left<right){
            appended = appended + input.charAt(left);
            reversed = reversed + input.charAt(right);
            left++;
            right--;
        }
      

    }
}

package TwoPointers;

public class LongestPalindromSubstring {
   //input: babad
    //output: bab
    public String findLongestSubstring(String inputString) {
           if(inputString.length()==0) return "";
           int  start = 0, end = 0;

           for(int i =0; i<inputString.length(); i++){
               //odd length palindrome
               int len1 = expandAroundCenter(inputString, i, i);
               //even length palindrome
               int len2 = expandAroundCenter(inputString, i, i+1);

               //Get the maximum length of the palindrome found
               int len = Math.max(len1, len2);

               if(len>end-start){
                   //update the start and end pointers
                   start = (int) (i - Math.floor((len-1)/2));
                   end = (int) (i + Math.floor(len/2));
               }

           }
           return inputString.substring(start, end+1);
    }

    public int expandAroundCenter(String inputString, int left, int right){
        while(left>=0 && right<inputString.length() && inputString.charAt(left)==inputString.charAt(right) ){
            left --;
            right++;
        }
        return left -right -1;
    }
}
///b a b a d
/// b ->    <-d
/// a ->    <-a
/// b ->    <-b

///m a d a m
///m ->  <-m
///a ->  <-a
///d ->  <-d
///a ->  <-a
///m ->  <-m
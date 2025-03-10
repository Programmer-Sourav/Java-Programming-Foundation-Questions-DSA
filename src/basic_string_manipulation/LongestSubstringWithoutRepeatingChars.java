package basic_string_manipulation;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    /*
Approach:
Use two pointers: start and end to define the current window.
Use a data structure (e.g., a Set or an int[256] array) to track the characters in the current window.
Expand the window by moving the end pointer:
If the character at end is not in the current window:
Add it to the data structure.
Update the maximum length of the substring.
If the character at end is already in the window:
Shrink the window from the start pointer until the duplicate character is removed.
Repeat until the end pointer has traversed the string.
     */


    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of Longest Substring: " + findLongestSubstring(str));
    }

    public static int findLongestSubstring(String str){
        // Initialize pointers and a set to track characters
        int start = 0, end = 0, maxLength=0;

        Set<Character> characters = new HashSet<>();

        while(end<str.length()){
            char currentChar = str.charAt(end);
            // If current character is not in the set, expand the window

            if(!characters.contains(currentChar)){
                characters.add(currentChar);
                maxLength = Math.max(maxLength, end-start+1);
                end++;
            }
            else{
                characters.remove(str.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}

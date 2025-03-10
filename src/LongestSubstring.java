import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {

    int longestSubstringHS(String input){
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int longest = 0;
        int start = 0;

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // Update the start position if the current character was seen in the current window
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);
            // Update the longest length
            longest = Math.max(longest, end - start + 1);
        }

        return longest;

}
}

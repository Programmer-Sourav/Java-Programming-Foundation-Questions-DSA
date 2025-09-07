package DP;

/**
 *
 * Word Break (DP - String Segmentation)
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Word Break
 * Given a string s and a dictionary of strings wordDict,
 * return true if s can be segmented into a space-separated
 * sequence of one or more dictionary words.
 * The same word in the dictionary may be reused multiple times in the segmentation.
 */
public class WordBreak {
    public boolean segmentStrings(String given, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        boolean [] dp = new boolean[given.length()+1];
        dp[0] = true;

        for(int i =0 ; i<=given.length(); i++){
            for(int j=0; j<i; j++){
                if(dp[j] && set.contains(given.substring(j, i))){
                    dp[i] = true;
                     break;
                }
            }
        }

    return dp[given.length()];
    }
}

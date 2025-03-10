package basic_string_manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String [] args){
        String str = "programming";
       char [] charArray = str.toCharArray();
//        ArrayList<Character> arl = new ArrayList<>();
//
//        Map<Character, Integer> map = new HashMap<>();
//        for(char eachChar : charArray){
//            map.put(eachChar, map.getOrDefault(eachChar, 0)+1);
//            if(map.get(eachChar)>1){
//                arl.add(eachChar);
//            }
//        }
//        //>1, duplicate
//      System.out.print("Duplicates ");
//        for(int i =0; i<arl.size(); i++){
//            System.out.print(arl.get(i)+",");
//        }

        for(int i =0; i<charArray.length; i++){
            boolean isDuplicate = false;
            for(int j =i+1; j<charArray.length ; j++){
                if(charArray[i] == charArray[j]){
                  isDuplicate = true;
                  break;
                }
            }

            if(isDuplicate){
                System.out.print(charArray[i]);
            }
        }
    }
}

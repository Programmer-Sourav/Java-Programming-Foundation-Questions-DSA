package basic_string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

    public static void main (String args[]){
        String text = "This is a test. This test is only a test.";
        text = text.toLowerCase().replace("[^a-z\\s]", "");
        System.out.print("Text "+text);
        String [] words = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + " : " +entry.getValue());
        }
    }
}

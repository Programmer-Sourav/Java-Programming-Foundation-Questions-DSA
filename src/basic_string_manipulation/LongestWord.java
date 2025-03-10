package basic_string_manipulation;


public class LongestWord {

    public static void main(String [] args){
        String str = "Java is a programming language.";

        String[] words = str.split("\\s+");
        String longest = "";

        for(String word : words){
            int wordLength = 0;
            for(char eachChar : word.toCharArray()){
                wordLength++;
            }
            if(wordLength>longest.length()){
                longest = word;
            }
        }
     System.out.print("Longest word :"+longest);

    }
}

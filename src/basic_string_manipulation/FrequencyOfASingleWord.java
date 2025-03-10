package basic_string_manipulation;

public class FrequencyOfASingleWord {

    public static void main(String [] args){
        String text = "Alpha going alpha home studio";
        String targetText = "Alpha";

        String [] words = text.toLowerCase().split("\\s+");
        int count = 0;
        for (String word : words){
            if(word.equalsIgnoreCase(targetText)){
                count++;
            }
        }
        System.out.print(targetText +"contains "+ count + "of occurances");
    }
}

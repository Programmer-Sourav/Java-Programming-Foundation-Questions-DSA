package basic_string_manipulation;

public class StringToLowerCase {

    public static void main(String[] args){
        String word = "Hello";
        char[] charArray = word.toCharArray();
        String result = "";

        for(char eachChar : charArray){
            //65 to 97 is the cap A to Z
            //+32 makes it lower case
            if(eachChar>='A' && eachChar<='Z'){
                result = result + (char) (eachChar+32);
            }
            else{
                result = result + eachChar;
            }
        }
        System.out.print("Lower Case String "+result);
    }
}

package basic_string_manipulation;

public class LengthOfTheString {
    public  static  void main(String[] args){
        String input = "Hello";
        char[] characterInput = input.toCharArray();

        int count = 0;
//        for(int i=0; i<characterInput.length; i++){
//            count++;
//        }
        for(char eachChar : characterInput){
            count++;
        }
        System.out.print("Length of the array "+ count);
    }
}

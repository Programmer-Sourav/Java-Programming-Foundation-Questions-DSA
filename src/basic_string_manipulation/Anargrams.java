package basic_string_manipulation;

public class Anargrams {
    public static void main(String [] args){
        //String [] input = {"listen", "silent"};
        //string length same, same chars
        String str1  = "listen";
        String str2  ="silent";

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        for(int i =0; i<arr1.length-1; i++){
            for(int j = i+1; j< arr1.length; i++){
                if(arr1[i]> arr1[j]){
                  char temp = arr1[i];
                  arr1[i] = arr1[j];
                  arr1[j] = temp;
                }
                if(arr2[i] > arr2[j]){
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        boolean isAnargram = true;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                isAnargram = false;
                break;
            }
        }
        System.out.println("Are anagrams: " + isAnargram);
    }
}

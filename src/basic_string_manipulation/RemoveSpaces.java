package basic_string_manipulation;

public class RemoveSpaces {

    public static void main(String[] args){
        String str = "Java Is Fun";
        char[] charArray = str.toCharArray();

        String withoutSpace = "";
        for(char eachChar : charArray){
            if(eachChar!=' ')
            withoutSpace = withoutSpace + eachChar;
        }
        System.out.print("Without Space "+ withoutSpace);
    }
}

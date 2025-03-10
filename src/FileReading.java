import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FileReading {

    public static void main(String args[])  {
        //ObjectInputStream objectInputStream = new ObjectInputStream("../files/response.txt");
        File inputFile = new File("C:\\Users\\SOURAV\\IdeaProjects\\SomeBasics\\src\\response.txt");
        int ch = 0;
        String readFile = "";
        HashMap<String, Integer> hmp = new HashMap();
        try {
            String name = (inputFile != null ? inputFile.getPath() : null);
            System.out.print("IPF "+inputFile.getPath());
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            while ((ch= fileInputStream.read()) != -1) {
                   // System.out.print((char)ch);
                readFile = readFile + (char) ch;
                }
             System.out.print(readFile);
            String[] words = readFile.split("\\s+"); // Split by spaces or punctuation

            for (String word : words) {
                word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");  // Normalize the word
                if (word.equals("sunt") || word.equals("magnam")) {
                    hmp.put(word, hmp.getOrDefault(word, 0) + 1);
                }
            }


            for (Map.Entry<String, Integer> entry : hmp.entrySet()) {
                String key = entry.getKey();
                int numberOfCount = entry.getValue();
                System.out.print("Key "+key + "Number of Count "+numberOfCount);
            }

        }
       catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

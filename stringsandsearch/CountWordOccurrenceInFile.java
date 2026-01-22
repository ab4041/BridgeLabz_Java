import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrenceInFile {

    /*
     FileReader Problem 2: Count the Occurrence of a Word in a File Using FileReader
     Problem:
     Write a program that uses FileReader and BufferedReader to read a file and count
     how many times a specific word appears in the file.

     Approach:
     Create a FileReader and wrap it in BufferedReader.
     Initialize a counter variable.
     For each line, split it into words and check target word.
     Increment counter when found.
     Print final count.
    */

    public static int countWord(String filePath, String targetWord) {
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {

                // Split using whitespace (spaces, tabs)
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // case-insensitive compare
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return count;
    }

    public static void main(String[] args) {
        String filePath = "sample.txt";
        String targetWord = "java";

        System.out.println("Word '" + targetWord + "' count = " + countWord(filePath, targetWord));
    }
}

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFileUsingInputStreamReader {

    /*
     InputStreamReader Problem 1: Convert Byte Stream to Character Stream Using InputStreamReader
     Problem:
     Write a program that uses InputStreamReader to read binary data from a file
     and print it as characters. The file contains data encoded in a specific charset (e.g., UTF-8).

     Approach:
     Create FileInputStream to read bytes.
     Wrap it in InputStreamReader to convert bytes -> characters.
     Wrap it inside BufferedReader for fast line reading.
     Read line by line and print.
    */

    public static void main(String[] args) {
        String filePath = "sample.txt";

        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

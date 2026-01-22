import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareBuilderBufferAndReaders {

    /*
     Challenge Problem: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
     Problem:
     Write a program that:
     1) Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
     2) Uses FileReader and InputStreamReader to read a large file (e.g., 100MB)
        and print the number of words in the file.

     Approach:
     StringBuilder and StringBuffer:
     - Concatenate "hello" 1,000,000 times using both classes
     - Measure time using System.nanoTime()

     FileReader and InputStreamReader:
     - Read file using:
       (a) FileReader + BufferedReader
       (b) FileInputStream + InputStreamReader + BufferedReader
     - Count words by splitting each line using whitespace
     - Compare time taken
    */

    //  Word Count using FileReader
    public static long countWordsUsingFileReader(String filePath) {
        long wordCount = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();

                // Ignore empty lines
                if (!line.isEmpty()) {
                    // Split by spaces/tabs
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        return wordCount;
    }

    //  Word Count using InputStreamReader
    public static long countWordsUsingInputStreamReader(String filePath) {
        long wordCount = 0;

        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        return wordCount;
    }

    public static void main(String[] args) {

        // ===============================
        //  Part 1: Compare Builder vs Buffer
        // ===============================

        int n = 1_000_000;

        //  StringBuilder (faster, NOT thread-safe)
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long endBuilder = System.nanoTime();

        //  StringBuffer (thread-safe, slower)
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }
        long endBuffer = System.nanoTime();

        System.out.println("===== StringBuilder vs StringBuffer =====");
        System.out.println("StringBuilder Time (ns): " + (endBuilder - startBuilder));
        System.out.println("StringBuffer  Time (ns): " + (endBuffer - startBuffer));

        // ===============================
        //  Part 2: Compare FileReader vs InputStreamReader
        // ===============================

        String filePath = "bigfile.txt"; //  give a large file name here

        long startFR = System.nanoTime();
        long wordsFR = countWordsUsingFileReader(filePath);
        long endFR = System.nanoTime();

        long startISR = System.nanoTime();
        long wordsISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();

        System.out.println("\n===== FileReader vs InputStreamReader =====");
        System.out.println("FileReader Word Count       : " + wordsFR);
        System.out.println("FileReader Time (ns)        : " + (endFR - startFR));

        System.out.println("InputStreamReader Word Count: " + wordsISR);
        System.out.println("InputStreamReader Time (ns) : " + (endISR - startISR));
    }
}

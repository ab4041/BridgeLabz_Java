import java.io.*;

public class ReadConsoleAndWriteToFile {

    /*
     InputStreamReader Problem 2: Read User Input and Write to File Using InputStreamReader
     Problem:
     Write a program that uses InputStreamReader to read user input from the console
     and write the input to a file. Each input should be written as a new line in the file.

     Approach:
     Create InputStreamReader from System.in.
     Wrap it with BufferedReader.
     Create FileWriter to write into file.
     Read lines until user enters "exit".
     Write each line into file.
    */

    public static void main(String[] args) {
        String filePath = "output.txt";

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(filePath, true)) { // true = append mode

            System.out.println("Type text (type 'exit' to stop):");

            String input;

            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Stopped writing!");
                    break;
                }

                fw.write(input + "\n"); // write each line
                fw.flush(); // ensure it saves immediately
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

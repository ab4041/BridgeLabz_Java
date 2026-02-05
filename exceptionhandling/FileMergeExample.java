import java.io.*;

/*
Problem Statement:
Read data from two files and write combined content into a third file.
Ensure all resources are closed using try-with-resources.
*/

public class FileMergeExample {

    public static void main(String[] args) {

        try (
            BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
        ) {

            String line;

            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully");

        } catch (IOException e) {
            System.out.println("File processing error");
        }
    }
}

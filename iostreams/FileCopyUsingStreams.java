import java.io.*;

/*
1. File Handling - Read and Write a Text File

Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file.
If the source file does not exist, display an appropriate message.

Requirements:
- Use FileInputStream and FileOutputStream.
- Handle IOException properly.
- Ensure that the destination file is created if it does not exist.
*/

public class FileCopyUsingStreams {

    public static void main(String[] args) {

        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

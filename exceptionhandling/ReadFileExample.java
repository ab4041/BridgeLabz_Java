import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Problem Statement:
Create a Java program that reads a file named "data.txt".
If the file does not exist, handle the IOException properly.

Expected Behavior:
- If the file exists, print its contents.
- If the file does not exist, print "File not found".
*/

public class ReadFileExample {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close(); // manually closing resource

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

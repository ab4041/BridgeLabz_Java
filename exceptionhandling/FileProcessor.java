import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/*
Problem Statement:
You are tasked with reading data from multiple files and processing them.
Ensure that each file is closed properly after processing, even if an exception occurs.

Requirements:
1. Create a class FileProcessor with a method processFiles(List<String> filePaths)
2. Use BufferedReader to read file contents
3. Handle IOException
4. Use try-with-resources to auto-close resources
*/

public class FileProcessor {

    public void processFiles(List<String> filePaths) {

        for (String path : filePaths) {

            // try-with-resources ensures BufferedReader is closed automatically
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
            }
        }
    }
}

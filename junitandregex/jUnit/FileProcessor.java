import java.io.*;

/*
Problem:
Write and read file content
*/

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(content);
        writer.close();
    }

    public String readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        return reader.readLine();
    }
}

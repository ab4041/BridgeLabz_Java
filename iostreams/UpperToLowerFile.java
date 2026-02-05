import java.io.*;

/*
6. Filter Streams - Convert Uppercase to Lowercase
*/

public class UpperToLowerFile {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase(ch));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

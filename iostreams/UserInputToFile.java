import java.io.*;

/*
3. Read User Input from Console

Problem Statement:
Ask user for name, age, favorite programming language and save it into a file.

Requirements:
- Use BufferedReader
- Use FileWriter
*/

public class UserInputToFile {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user_info.txt")) {

            System.out.print("Enter Name: ");
            String name = br.readLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter Favorite Language: ");
            String lang = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Language: " + lang);

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

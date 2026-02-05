import java.io.*;

/*
5. ByteArray Stream - Convert Image to ByteArray

Problem Statement:
Convert image to byte array and write back to another file.
*/

public class ImageByteArrayCopy {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("image.jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        byte[] imageBytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream("copy.jpg");

        while ((bytesRead = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fis.close();
        fos.close();
        System.out.println("Image copied successfully.");
    }
}

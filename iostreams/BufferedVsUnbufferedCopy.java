import java.io.*;

/*
2. Buffered Streams - Efficient File Copy

Problem Statement:
Copy a large file using buffered and unbuffered streams and compare performance.

Requirements:
- Read/write in chunks of 4096 bytes
- Use System.nanoTime() for timing
*/

public class BufferedVsUnbufferedCopy {

    public static void main(String[] args) throws IOException {

        File source = new File("largefile.dat");

        // Unbuffered copy
        long start = System.nanoTime();
        copyUnbuffered(source, new File("unbuffered.dat"));
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start));

        // Buffered copy
        start = System.nanoTime();
        copyBuffered(source, new File("buffered.dat"));
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));
    }

    static void copyUnbuffered(File src, File dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    static void copyBuffered(File src, File dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
}

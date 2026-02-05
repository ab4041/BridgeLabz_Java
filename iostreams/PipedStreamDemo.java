import java.io.*;

/*
8. Piped Streams - Inter-Thread Communication
*/

public class PipedStreamDemo {

    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello from Writer Thread".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writer.start();
        reader.start();
    }
}

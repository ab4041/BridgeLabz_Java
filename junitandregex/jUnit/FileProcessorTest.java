import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

public class FileProcessorTest {

    FileProcessor processor = new FileProcessor();

    @Test
    void testFileWriteRead() throws IOException {
        processor.writeToFile("test.txt", "JUnit Test");
        assertEquals("JUnit Test", processor.readFromFile("test.txt"));
    }
}

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testListOperations() {
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertEquals(2, manager.getSize(list));

        manager.removeElement(list, 10);
        assertEquals(1, manager.getSize(list));
    }
}

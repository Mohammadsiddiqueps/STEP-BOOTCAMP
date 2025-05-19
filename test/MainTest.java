import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void addTest() {
        assertEquals(10, Main.add(5, 5));
        assertEquals(20, Main.add(5, 15));
    }
}
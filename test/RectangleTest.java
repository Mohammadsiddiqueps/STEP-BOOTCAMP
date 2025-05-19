import org.junit.jupiter.api.Test;
import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void emptyRectangle() {
        assertEquals(0, Rectangle.area(0, 0));
    }

    @Test
    void squareArea() {
        assertEquals(100, Rectangle.area(10, 10));
    }

    @Test
    void area() {
        assertEquals(50, Rectangle.area(10, 5));
    }
}

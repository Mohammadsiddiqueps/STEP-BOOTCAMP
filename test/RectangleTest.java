import org.junit.jupiter.api.Test;
import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void emptyAreaRectangle() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.area());
    }

    @Test
    void squareArea() {
        Rectangle rectangle = new Rectangle(10, 10);
        assertEquals(100, rectangle.area());
    }

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.area());
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(10, 5);
        asse    rtEquals(30,rectangle.perimeter());

    }
}

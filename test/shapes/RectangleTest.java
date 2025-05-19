package shapes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import shapes.Rectangle;

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
    void areaSquare() {
        Rectangle rectangle = new Rectangle(5);
        assertEquals(25, rectangle.area());
    }

    @Test
    void squarePerimeter() {
        Rectangle square = new Rectangle(10);
        assertEquals(40, square.perimeter());
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(30, rectangle.perimeter());

    }
}

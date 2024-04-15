package index;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TriangleClassifierTest {
    @Test
    public void testEquilateralTriangle() {
        String result = TriangleClassifier.classifyTriangle(2, 2, 2);
        assertEquals("Tam giác đều", result);
    }

    @Test
    public void testIsoscelesTriangle() {
        String result = TriangleClassifier.classifyTriangle(2, 2, 3);
        assertEquals("Tam giác cân", result);
    }

    @Test
    public void testScaleneTriangle() {
        String result = TriangleClassifier.classifyTriangle(3, 4, 5);
        assertEquals("Tam giác thường", result);
    }

    @Test
    public void testNotATriangle() {
        String result = TriangleClassifier.classifyTriangle(8, 2, 3);
        assertEquals("Không phải là tam giác", result);
    }

    @Test
    public void testNotATriangleNegativeSide() {
        String result = TriangleClassifier.classifyTriangle(-1, 2, 1);
        assertEquals("Không phải là tam giác", result);
    }

    @Test
    public void testNotATriangleZeroSide() {
        String result = TriangleClassifier.classifyTriangle(0, 1, 1);
        assertEquals("Không phải là tam giác", result);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DistanceCalculatorTest {
    @Test
    public void testCalculateDistance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        double distance = DistanceCalculator.calculateDistance(p1, p2);
        assertEquals(5.0, distance, 0.001);
    }
}

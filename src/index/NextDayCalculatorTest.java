package index;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class NextDayCalculatorTest {
    @Test
    public void testNextDay1() {
        LocalDate result = NextDayCalculator.calculateNextDay(1, 1, 2018);
        assertEquals(LocalDate.of(2018, 1, 2), result);
    }

    @Test
    public void testNextDay2() {
        LocalDate result = NextDayCalculator.calculateNextDay(31, 1, 2018);
        assertEquals(LocalDate.of(2018, 2, 1), result);
    }

    @Test
    public void testNextDay3() {
        LocalDate result = NextDayCalculator.calculateNextDay(30, 4, 2018);
        assertEquals(LocalDate.of(2018, 5, 1), result);
    }

    @Test
    public void testNextDay4() {
        LocalDate result = NextDayCalculator.calculateNextDay(28, 2, 2018);
        assertEquals(LocalDate.of(2018, 3, 1), result);
    }

    @Test
    public void testNextDay5() {
        LocalDate result = NextDayCalculator.calculateNextDay(29, 2, 2020);
        assertEquals(LocalDate.of(2020, 3, 1), result);
    }

    @Test
    public void testNextDay6() {
        LocalDate result = NextDayCalculator.calculateNextDay(31, 12, 2018);
        assertEquals(LocalDate.of(2019, 1, 1), result);
    }
}

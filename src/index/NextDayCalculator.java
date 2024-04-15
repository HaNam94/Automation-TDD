package index;
import java.time.LocalDate;
public class NextDayCalculator {
    public static LocalDate calculateNextDay(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.plusDays(1);
    }
}

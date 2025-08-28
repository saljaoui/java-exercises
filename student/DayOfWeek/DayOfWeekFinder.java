import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.lang.IllegalArgumentException;

public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date;

        try {
        DayOfWeek.valueOf(dayOfWeek.toUpperCase());
        } catch (IllegalArgumentException e) {
            return "Error";
        }

        try {
        date = LocalDate.parse(startDate, format);
        for (int i = 0; i < 7; i++) {
            // System.out.println(date.getDayOfWeek().toString());
        if (date.getDayOfWeek().toString().equals(dayOfWeek.toUpperCase())) {
            break;
        }
        date = date.plusDays(1);
        }

        } catch (DateTimeParseException e) {
            return "Error";
        }
        return date.toString();
    }
}
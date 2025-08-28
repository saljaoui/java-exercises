import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.format.DateTimeParseException;

public class AgeFinder {
    public int calculateAge(String date) {
        LocalDate date1;
        LocalDate timeNow;
        try {
         date1 = LocalDate.parse(date);
         timeNow = LocalDate.parse("2025-08-28");
        } catch (DateTimeParseException e) {
            return -1;
        }

        int age = Period.between(date1, timeNow).getYears();
        if (age < 0) {
            return -1;
        }
        return age;
    }
}
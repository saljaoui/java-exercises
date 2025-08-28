import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MonthlyPeriod {
    public String calculatePeriod(String startDate, String endDate) {
        LocalDate date1;
        LocalDate date2;
        try {
         date1 = LocalDate.parse(startDate);
         date2 = LocalDate.parse(endDate);
        } catch (DateTimeParseException e) {
            return "Error";
        }

        Period time = Period.between(date1, date2);

        int years = Math.abs(time.getYears());
int months = Math.abs(time.getMonths());

if (years > 0 && months > 0) {
    return String.format("%d %s and %d %s",
        years, years == 1 ? "year" : "years",
        months, months == 1 ? "month" : "months");
} else if (years > 0) {
    return String.format("%d %s", years, years == 1 ? "year" : "years");
} else if (months > 0) {
    return String.format("%d %s", months, months == 1 ? "month" : "months");
} else {
    return "";
}

    }
}
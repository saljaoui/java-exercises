import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;

    }

    public void setStartTime(String start) {
        this.startTime = start;
    }

    public void setEndTime(String end) {
        this.endTime = end;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getHoursLogged() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        long n;
        try {
            Date date1 = format.parse(endTime);
            Date date2 = format.parse(startTime);
            n = date1.getTime() - date2.getTime();
            System.out.println(n / (1000 * 60));
        } catch (ParseException e) {
            return "-1";
        }
        long min = n / (1000 * 60);
        if (min < 0) {
            return "-1";
        }
        if (min < 120) {
            return min + " m";
        } else {
            long hours = min / 60;
            if (hours < 120) {
                return hours + " h";
            } else {
                long days = hours / 24;
                if (days < 120) {
                    return days + " d";
                } else {
                    long months = days / 30; // approx
                    return months + " mo";
                }
            }
        }
    }
}
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

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getHoursLogged() {
        if (this.startTime.length() != "yyyy-MM-dd HH:mm".length()) { return "-1";}
        if (this.endTime.length() != "yyyy-MM-dd HH:mm".length()) { return "-1";}

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date startDate = formatter.parse(this.startTime);
            Date endDate = formatter.parse(this.endTime);

            long diffMillis = endDate.getTime() - startDate.getTime();
            if (diffMillis < 0) return "-1";

            long diffMinutes = diffMillis / (60 * 1000);
            long diffHours   = diffMillis / (60 * 60 * 1000);
            long diffDays    = diffMillis / (24 * 60 * 60 * 1000);

            this.hoursLogged = diffHours;

            if (diffMinutes < 120) {
                return String.format("%s m", diffMinutes);
            } else if (diffHours < 120) {
                return String.format("%s h", diffHours);
            } else if (diffDays < 120) {
                return String.format("%s d", diffDays);
            } else {
                long months = diffDays / 30;
                return String.format("%d mo", months);
            }

        } catch (ParseException e) {
            return "-1";
        }
    }
}

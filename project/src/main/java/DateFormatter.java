import   java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    private long date;
    private String formattedDate;
    private String format;

    public String getFormat() { return this.format; }
    public long getDate() { return this.date; }
    public void setFormat(String format) {
        if (!format.contains("yyyy") && !format.contains("YYYY")) {
            return;
        }
        this.format = format; 
    }
    public void setDate(long date) { this.date = date; }

    public DateFormatter() {
    }

    public DateFormatter(long date, String format) {
        this.format = format;
        this.date = date;
    }

    public DateFormatter(long date) {
        this.date = date;
    }

     public String getFormattedDate() {
        if (this.format.contains("/")) {
            this.format = "dd/MM/YYYY";
        } else if (this.format.contains(".")) {
            this.format = "dd.MM.YYYY";
        } else {
            this.format = "dd MMMM YYYY";
        }

        SimpleDateFormat format = new SimpleDateFormat(this.format);
        Date date = new Date(this.date * 1000);
        this.formattedDate = format.format(date);
        return this.formattedDate;
     }
}
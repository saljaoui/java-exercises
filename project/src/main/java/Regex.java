import java.util.*;

public class Regex {
    private StringBuilder pattern;

    public Regex(List<String> component) {
        this.pattern = new StringBuilder();

        for (String c : component) {
            this.pattern.append(c);
        }
    }

    public Regex() {
        this.pattern = new StringBuilder();
    }

    public String getPattern() {
        return pattern.toString();
    }
}
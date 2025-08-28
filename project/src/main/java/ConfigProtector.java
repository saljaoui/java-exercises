import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        // Implementation to hide sensitive data in the configuration file using regex
        List<String> list = new ArrayList<>();
        String key = "";
        boolean hide = false;

        for (int i = 0; i < configFile.length(); i++) {
            if (configFile.charAt(i) != '=') {

                if (configFile.charAt(i) == '\n') {
                    // System.out.println(key);
                    key += configFile.charAt(i);
                    list.add(key);
                    key = "";
                    hide = false;
                }
                
                if (hide) {
                    key += "*";
                } else if (configFile.charAt(i) != '\n') {
                    key += configFile.charAt(i);
                }
                
            } else if (configFile.charAt(i) == '=') {
                if (sensitiveKeys.contains(key)) {
                    hide = true;
                }
                    // System.out.println(key);
                    // System.out.println(hide);
                key += configFile.charAt(i);
            }
        }

        return String.join("", list);
    }
}
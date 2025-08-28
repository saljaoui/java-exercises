import java.util.*;
import java.util.regex.*;

public class BreakdownURL {
    public Map<String, String> parseURL(String url) {
        // Implementation to parse and validate URLs using regex

        // String s = url.matches("");
        Map<String, String> map = new HashMap<String, String>();

        Pattern pattern = Pattern.compile("^(\\w+)://");
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
        String res = matcher.group(1);
        map.put("protocol", res);
        }

        pattern = Pattern.compile("://(.*?)(?:[?:/]|$)");
        matcher = pattern.matcher(url);
        
        if (matcher.find()) {
        String res = matcher.group(1);
        map.put("domain", res);
        // System.out.println(res);
        }

        pattern = Pattern.compile(":(\\d+)");
        matcher = pattern.matcher(url);
        
        if (matcher.find()) {
        String res = matcher.group(1);
        map.put("port", res);
        // System.out.println(res);
        }

        pattern = Pattern.compile("\\w(/[^?]*)");
        matcher = pattern.matcher(url);
        
        if (matcher.find()) {
        String res = matcher.group(1);
        map.put("path", res);
        // System.out.println(res);
        }

        pattern = Pattern.compile("\\?(.+)");
        matcher = pattern.matcher(url);
        
        if (matcher.find()) {
        String res = matcher.group(1);
        map.put("query", res);
        // System.out.println(res);
        }

        return map;
    }
}
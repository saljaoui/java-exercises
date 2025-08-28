import java.util.*;

public class HTMLValidator {
    public boolean validateHTML(String html) {

        ArrayList<String> list = new ArrayList<>();
        boolean fondIt = false;
        String ele = "";

        for (int i = 0; i < html.length(); i++) {
            if (fondIt && html.charAt(i) != '>') {
                ele += html.charAt(i);
            }

            if (html.charAt(i) == '<') {
                fondIt = true;
                ele = "";
            } else if (html.charAt(i) == '>') {
                fondIt = false;
                if (!ele.endsWith("/")) {
                    list.add(ele);
                }
                ele = "";
            } 
        }


        int len = list.size();
        System.out.println(list);

        for (int d = 0; d < len; d++) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i+1).toString().equals("/" + list.get(i).toString())) {
                list.remove(i+1);
                list.remove(i);
            }
        }
        }

    if (list.size()!= 0) {
        return false ;
    }
        return true;
    }
}
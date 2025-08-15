public class CountChar {
    public static int count(String s, char c) {
        // your code 
        int count = 0; 
        for (char r : s.toCharArray()) {
            if (r == c) {
                count += 1;
            }
        }
        return count;
    }
}
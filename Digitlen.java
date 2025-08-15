public class Digitlen {
    public static int digitlen(long number) {
        // your code here
        if (number < 0) {
            return Long.toString(number).length() - 1;
        }
        return Long.toString(number).length() ;
    }
}
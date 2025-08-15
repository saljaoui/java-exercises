
public class MultiplicationTable {
    public static void generate(int num) {
        // your code here
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%s x %s = %s", num, i, num*i));
        }
    }
}
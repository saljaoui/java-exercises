
public class RecursiveFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        // recursive factorial calculation
        if (n <= 1) return 1;
        return n * calculate((n - 1));
    }
}
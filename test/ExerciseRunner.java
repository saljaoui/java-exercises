import java.util.Arrays;

public class ExerciseRunner {
    public static void main(String[] args) {
        StringBuilder results = new StringBuilder();

        // Test 1
        results.append(Arrays.equals(
            RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 1),
            new Integer[]{3, 4, 2, 1}
        ) ? "✅" : "❌");

        // Test 2
        results.append(Arrays.equals(
            RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 5),
            new Integer[]{3, 4, 2, 1}
        ) ? "✅" : "❌");

        // Test 3
        results.append(Arrays.equals(
            RotateArray.rotate(new Integer[]{4, 2, 1, 3}, -1),
            new Integer[]{2, 1, 3, 4}
        ) ? "✅" : "❌");

        // Test 4
        results.append(Arrays.equals(
            RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 0),
            new Integer[]{4, 2, 1, 3}
        ) ? "✅" : "❌");

        // Test 5
        results.append(Arrays.equals(
            RotateArray.rotate(new Integer[]{}, 2),
            new Integer[]{}
        ) ? "✅" : "❌");

        // Test 6
        results.append(Arrays.equals(
            RotateArray.rotate(new Integer[]{1, 2, 3, 4, 5}, -6),
            new Integer[]{2, 3, 4, 5, 1}
        ) ? "✅" : "❌");

        System.out.println(results);
    }
}

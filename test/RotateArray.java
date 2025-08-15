public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        int n = arr.length;
        if (n == 0) return arr; // empty array → return as is

        // Normalize rotationCount so it's within array length
        rotationCount = rotationCount % n;

        // Handle negative rotations by converting to positive equivalent
        if (rotationCount < 0) {
            rotationCount = n + rotationCount;
        }

        // If no rotation needed
        if (rotationCount == 0) return arr;

        Integer[] res = new Integer[n];
        int start = n - rotationCount;
        int count = 0;

        for (int i = start; i < n; i++) {
            res[count++] = arr[i];
        }
        for (int i = 0; i < start; i++) {
            res[count++] = arr[i];
        }

        return res;
    }
}

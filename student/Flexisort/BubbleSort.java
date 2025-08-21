import java.util.*;

public class BubbleSort extends Sorter {
    @Override
    public void sort() {
        int[] arr = getArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int value = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = value;
                }
            }
        }
        setArray(arr);
    }
}
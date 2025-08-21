public class InsertionSort extends Sorter {
    @Override
    public void sort() {
        int[] arr = getArray();
        for (int i = 1; i < arr.length; i++) {
            int kay = arr[i];
            int j = i - 1;
            while (j >= 0 && kay < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = kay; 
        }
        setArray(arr);
    }
}
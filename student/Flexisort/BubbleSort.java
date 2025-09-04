
public class BubbleSort extends Sorter {
    @Override
    public void sort() {
        // bubble sort algorithm implementation
        int[] arr =  this.getArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int kay = arr[j];
                    arr[j] =  arr[j + 1];
                    arr[j + 1] = kay;
                }
            }
        }
        


        this.setArray(arr);
    }
}
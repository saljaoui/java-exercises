public abstract class Sorter {
    private int[] array;

    public int[] getArray() {
        // getter method
    return this.array;
    }

    public void setArray(int[] array) {
        // setter method
        this.array = array;
    }

    public abstract void sort();
}

class BubbleSort extends Sorter {
    @Override
    public void sort() {
        // bubble sort algorithm implementation
        
    }
}

class InsertionSort extends Sorter {
    @Override
    public void sort() {
        // insertion sort algorithm implementation
    }
}
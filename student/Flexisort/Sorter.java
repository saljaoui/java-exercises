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


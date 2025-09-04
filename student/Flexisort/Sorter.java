import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Sorter {
    private int[] array;

    public int[] getArray() {
        // getter method
        
        return array;
    }

    public void setArray(int[] array) {
        // setter method
        this.array = array;
    }

    public abstract void sort();
}
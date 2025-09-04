import java.util.ArrayList;
import java.util.List;

public class DoubleLinkedList implements LinkedList {
     private List<Integer> arr = new ArrayList<>();

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
        if (index < 0 || index >= arr.size()) {
            return -1;
        }

        if (  index < (arr.size() + 1) / 2) {
            for (int i = 0; i < index; i++) {
                next();
            }
        } else {
            for (int i = 0; i < arr.size() - 1 - index; i++) {
                prev();
            }
        }
        return arr.get(index);
    }

    @Override
    public void add(int value) {
        arr.add(value);
    }

    @Override
    public void remove(int index) {
        
        if (index < 0 || index >= arr.size()) {
            return ;
        }
        // Implementation for removing an element by its index
       this.at(index);
       arr.remove(index);
    }

    @Override
    public int size() {
        // Implementation for getting the size of the list
        return arr.size();
    }

    private void  next() {
        // Implementation for going to the next
        System.out.println("Go to next node");

    }

    private void  prev() {
        // Implementation for going to the prev
        System.out.println("Go to previous node");

    }
}
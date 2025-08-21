public class ExerciseRunner {
    public static void main(String[] args) {
        LinkedList list = new SingleLinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);

        System.out.println("Element at index 0: " + list.at(1)); // Expected output: 1
        // System.out.println("Element at index 0: " + list.at(1)); // Expected output: 1

    }
}
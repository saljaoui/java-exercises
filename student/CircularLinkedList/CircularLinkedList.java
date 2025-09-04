public class CircularLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
        if (index == 0) {
            return this.head.value;
        } else {
            Node node = this.head;
            for (int i = 0; i < index; i++) {
                node = next(node);
            }
        return node.value;
        }
    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        if (this.head == null) {
            this.head = new Node(value);
            this.head.next = this.head;
        } else {
            Node node = this.head;
            while (node.next != this.head) {
                node = next(node);
            }
            Node newNode = new Node(value);
            node.next = newNode;
            newNode.next = this.head;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index

        if (index == 0) {
            Node node = this.head;

            while (node.next != this.head) {
                node = node.next;
            }

            this.head = this.head.next;
            node.next = this.head;


        } else {
            Node node = this.head;
            for (int i = 0; i < index - 1; i++) {
                node = next(node);
            }
            node.next = next(node).next;
        }
        size--;
    }

    @Override
    public int size() {
        // Implementation getting the size of the list
        return size;
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
}
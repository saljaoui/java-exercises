

public class SingleLinkedList implements LinkedList {
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

    public SingleLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
        Node curntNode = this.head;
        for (int i = 0; i < index;i++) {
            curntNode = next(curntNode);
        }
        return curntNode.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node curNode = this.head;
            while (curNode.next != null) {
                curNode = next(curNode);
            }
            curNode.next = newNode;
        }
        this.size++;
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if ( index < 0) {
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
            this.size --;
            return;
        }

        Node curntNode = this.head;
    for (int i = 0; i < index - 1; i++) {
        curntNode = next(curntNode);
    }
        if (curntNode.next != null) {
        curntNode.next = next(curntNode.next);
    }
        this.size --;
    }

    @Override
    public int size() {

        return this.size;
    }

    private Node next(Node node) {
        // Print the message "Go to next node"
        System.out.println("Go to next node");
        return node.next;
    }
}
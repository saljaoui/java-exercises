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

    @Override
    public int at(int index) {


        if (index == 0) {
            return this.head.value;
        }

        Node node = this.head;
        for (int i = 0; i < index; i++) {
            node = next(node);
        }

        return node.value;
    }

    @Override
    public void add(int value) {
        if ( head == null ) {
            this.head = new Node(value);
        } else {

            Node node;
            node = this.head;

            while (node.next != null) {
                node = next(node);
            }
            node.next = new Node(value);
        }
        size++;
    }

    @Override
    public void remove(int index) {

    if (index == 0) {
        this.head = this.head.next;
    } else {
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = next(node);
        }
        node.next = next(node).next;
    }

        size--;
    }

    @Override
    public int size() {
        return size;
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
}
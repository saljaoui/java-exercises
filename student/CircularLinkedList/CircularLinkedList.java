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

    public CircularLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int at(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        if (index == 0) {
            System.out.print("Go to next node\n");
            return this.head.value;
        }

        Node currecnt = this.head;
        for (int i = 0; i < index; i++){
            currecnt = next(currecnt);
        }

        return currecnt.value;
    }

@Override
public void add(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
        this.head = newNode;
        newNode.next = this.head;
    } else {
        Node tail = this.head;
        // Move (size - 1) times to reach the last node (so we call next() exactly once per step)
        for (int i = 0; i < this.size - 1; i++) {
            tail = next(tail);
        }
        tail.next = newNode;
        newNode.next = this.head;
    }
    this.size++;
}

    @Override
public void remove(int index) {
 if (this.size == 0 || index < 0) {
        return;
    }

    if (index == 0) {
        Node tail = head;
        while (next(tail) != head) {
            tail = next(tail);
        }
        head = head.next;
        tail.next = head;
    } else {
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = next(prev);
        }
        Node toRemove = next(prev);
        prev.next = toRemove.next;
    }

    size--;
}

    @Override
    public int size() {
        return this.size;
    }

    private Node next(Node node) {
        System.out.print("Go to next node\n");
        return node.next;
    }
}
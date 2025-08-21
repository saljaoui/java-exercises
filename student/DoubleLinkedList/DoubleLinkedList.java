public class DoubleLinkedList implements LinkedList {
    private Node head;
    private Node tail;
    private int size;
    
    private class Node {
        int value;
        Node next;
        Node prev;
        
        Node(int value) {
            this.prev = null;
            this.value = value;
            this.next = null;
        }
    }
    
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    @Override
    public int at(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node current;
        if (index < (size + 1) / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = next(current);
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = prev(current);
            }
        }
        return current.value;
    }
    
    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = tail;
            this.tail = newNode;
        }
        size++;
    }
    
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        
        Node nodeToRemove;

        
            if (index < (size + 1) / 2) {
                nodeToRemove = head;
                for (int i = 0; i < index; i++) {
                    nodeToRemove = next(nodeToRemove);
                }
            } else {
                nodeToRemove = tail;
                for (int i = size - 1; i > index; i--) {
                    nodeToRemove = prev(nodeToRemove);
                }
            }
        
        
        if (nodeToRemove.prev != null) {
            nodeToRemove.prev.next = nodeToRemove.next;
        } else {
            head = nodeToRemove.next;
        }
        
        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = nodeToRemove.prev;
        } else {
            tail = nodeToRemove.prev;
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
    
    private Node prev(Node node) {
        System.out.print("Go to previous node\n");
        return node.prev;
    }
}
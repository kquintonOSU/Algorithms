import java.util.NoSuchElementException;

public class Queue {

    private Node front;
    private Node rear;
    private int length;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if(isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        length--;
        
        return result;
    }

    public void print() {
        if(isEmpty()) {
            return;
        }
        Node current = front;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();

        queue.dequeue();
        queue.print();
    }
}

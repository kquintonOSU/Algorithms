import java.util.EmptyStackException;

public class StackSLL {
    private Node top = null;
    private int length;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackSLL() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;

        return result;
    }

    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public static void main(String[] args) {
        StackSLL stack = new StackSLL();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}

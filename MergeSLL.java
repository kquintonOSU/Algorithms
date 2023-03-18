public class MergeSLL {
    private Node head = null;
    private Node tail = null;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while(a != null && b != null) {
            if(a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSLL listOne = new MergeSLL();
        MergeSLL listTwo = new MergeSLL();
        MergeSLL listThree = new MergeSLL();

        listOne.addNode(1);
        listOne.addNode(3);
        listOne.addNode(5);
        listOne.addNode(7);
        listOne.addNode(9);

        listTwo.addNode(2);
        listTwo.addNode(4);
        listTwo.addNode(6);
        listTwo.addNode(8);
        listTwo.addNode(10);

        listOne.display();
        listTwo.display();

        listThree.head = merge(listOne.head, listTwo.head);
        listThree.display();
    }
}

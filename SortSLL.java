public class SortSLL {

    private ListNode head = null;
    private ListNode tail = null;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortList() {
        ListNode current = head;
        ListNode index = null;
        int temp;

        if(head == null) {
            return;
        } else {
            while(current != null) {
                index = current.next;
                while(index != null) {
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void removeDuplicates() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertInSLL(int data) {
        ListNode newNode = new ListNode(data);

        if(head == null) {
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }

        newNode.next = current;
        temp.next = newNode;

        return head;
    }

    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == key) {
            head = current.next;
            return;
        }

        while(current != null && current.data != key) {
            temp = current;
            current = current.next;
        }

        if(current == null) {
            return;
        }

        temp.next = current.next;

    }

    public void display() {
        ListNode current = head;
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortSLL listOne = new SortSLL();

        listOne.addNode(5);
        listOne.addNode(5);
        listOne.addNode(4);
        listOne.addNode(4);
        listOne.addNode(3);
        listOne.addNode(3);
        listOne.addNode(2);
        listOne.addNode(2);
        listOne.addNode(1);
        listOne.addNode(1);

        listOne.display();

        listOne.sortList();
        listOne.display();

        listOne.removeDuplicates();
        listOne.display();

        listOne.insertInSLL(3);
        listOne.display();

        listOne.deleteNode(5);
        listOne.display();

    }
}

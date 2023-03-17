public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        if(head == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while(null != current.next) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);
        if(position == 1) {
            node.next = head;
            head = node;
        } else {
           ListNode previous = head;
           int count = 1;
           
           while(count < position - 1) {
            previous = previous.next;
            count++;
           }

           ListNode current = previous.next;
           previous.next = node;
           node.next = current;
        }
    }

    public ListNode deleteFirst() {
        if(head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while(current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        
        return current;
    }

    public void delete(int position) {
        if(position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            
            while(count < position) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean find(ListNode head, int searchKey) {
        if(head == null) {
            return false;
        }

        ListNode current = head;
        
        while(current != null) {
            if(current.data == searchKey) {
                return true;
            }
            
            current = current.next;
        }

        return false;
    }

    public void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.head = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(6);

        sll.head.next = second;
        second.next = third;
        

        sll.insertFirst(1);
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertLast(7);
        sll.insertLast(8);
        sll.insertLast(9);
        sll.insert(2, 2);
        sll.insert(3, 3);

        sll.display();
        System.out.println("Length of list is " + sll.length());

        sll.deleteFirst();
        sll.display();
        System.out.println("Length of list is " + sll.length());

        sll.deleteLast();
        sll.display();
        System.out.println("Length of list is " + sll.length());

        sll.delete(1);
        sll.display();
        System.out.println("Length of list is " + sll.length());


        if(sll.find(sll.head, 1)) {
            System.out.println("Search Key found");
        } else {
            System.out.println("Search Key not found");
        }


    }
}

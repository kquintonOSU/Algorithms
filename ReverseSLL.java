public class ReverseSLL {

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverse(ListNode head) {
        if(head == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public void display(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        ReverseSLL reverseSLL = new ReverseSLL();
        reverseSLL.display(head);

        ListNode reverseListHead = reverseSLL.reverse(head);
        reverseSLL.display(reverseListHead);
    }
}

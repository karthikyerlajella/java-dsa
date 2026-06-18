package e_LinkedList.b_DoublyLinkedList.a_BasicOperations;
import e_LinkedList.b_DoublyLinkedList.ListNode;

public class InsertNode {

    // Insert at Head
    public static ListNode insertAtHead(ListNode head, int val){

        if(head == null) return new ListNode(val);

        ListNode temp = new ListNode(val, null, head);
        head.prev = temp;

        return temp;
    }

    // Insert at Tail
    public static ListNode insertAtTail(ListNode head, int val){

        if(head == null) return new ListNode(val);

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        ListNode curr = new ListNode(val);
        temp.next = curr;
        curr.prev = temp;

        return head;
    }

    // Insert at Position
    public static ListNode insertAtPosition(ListNode head, int k, int val){

        if(k<1) return head;

        if(head == null) return new ListNode(val);

        if(k==1){
            return insertAtHead(head,val);
        }

        int count = 1;
        ListNode temp  = head;

        while (temp != null && count < k-1) {
          temp = temp.next;
          count++;
        }

        // k > length + 1
        if(temp == null){
            return head;
        }

        // tail node
        if(temp.next == null){
            return insertAtTail(head,val);
        }

        ListNode curr = new ListNode(val);

        curr.next =  temp.next;
        curr.next.prev = curr;

        temp.next = curr;
        curr.prev = temp;

        return head;
    }

    // Insert before element
    public static ListNode insertBeforeElement(ListNode head, int val, int element){

        if(head == null) return head;

        if(head.data == val){
            return insertAtHead(head,element);
        }

        ListNode temp  = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        // Value not found
        if (temp.next == null) {
            return head;
        }

        ListNode curr = new ListNode(element);

        curr.next =  temp.next;
        curr.next.prev = curr;

        temp.next = curr;
        curr.prev = temp;

        return head;
    }

    public static void main(String[] args) {

        // 1.Create nodes
        ListNode head = new ListNode(50);
        ListNode n1 = new ListNode(40);
        ListNode n2 = new ListNode(30);
        ListNode n3 = new ListNode(20);
        ListNode n4 = new ListNode(10);

        // 2. Link them
        head.next = n1;
        n1.prev = head;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;


//        Node temp = insertAtHead(head, 100);
//        Node temp = insertAtTail(head, 100);
//        Node temp = insertAtPosition(head, 1, 100);
        ListNode temp = insertBeforeElement(head, 10,60);

        // DLL Traversal
        System.out.print("null <- ");
        for(ListNode curr = temp; curr != null; curr = curr.next){
            System.out.print(curr.data + " ");

            if (curr.next != null) {
                System.out.print(" <-> ");
            }
        }
        System.out.print(" -> null");
    }

}



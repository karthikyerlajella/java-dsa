package e_LinkedList.DoublyLinkedList.Easy;
import e_LinkedList.DoublyLinkedList.Node;

public class InsertNode {

    // Insert at Head
    public static Node insertAtHead(Node head, int val){

        if(head == null) return new Node(val);

        Node temp = new Node(val, null, head);
        head.prev = temp;

        return temp;
    }

    // Insert at Tail
    public static Node insertAtTail(Node head, int val){

        if(head == null) return new Node(val);

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        Node curr = new Node(val);
        temp.next = curr;
        curr.prev = temp;

        return head;
    }

    // Insert at Position
    public static Node insertAtPosition(Node head, int k, int val){

        if(k<1) return head;

        if(head == null) return new Node(val);

        if(k==1){
            return insertAtHead(head,val);
        }

        int count = 1;
        Node temp  = head;

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

        Node curr = new Node(val);

        curr.next =  temp.next;
        curr.next.prev = curr;

        temp.next = curr;
        curr.prev = temp;

        return head;
    }

    // Insert before element
    public static Node insertBeforeElement(Node head, int val, int element){

        if(head == null) return head;

        if(head.data == val){
            return insertAtHead(head,element);
        }

        Node temp  = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        if (temp.next == null) {
            return head;
        }

        Node curr = new Node(element);

        curr.next =  temp.next;
        curr.next.prev = curr;

        temp.next = curr;
        curr.prev = temp;

        return head;
    }

    public static void main(String[] args) {

        // 1.Create nodes
        Node head = new Node(50);
        Node n1 = new Node(40);
        Node n2 = new Node(30);
        Node n3 = new Node(20);
        Node n4 = new Node(10);

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
        Node temp = insertBeforeElement(head, 10,60);

        // DLL Traversal
        System.out.print("null <- ");
        for(Node curr = temp; curr != null; curr = curr.next){
            System.out.print(curr.data + " ");

            if (curr.next != null) {
                System.out.print(" <-> ");
            }
        }
        System.out.print(" -> null");
    }

}



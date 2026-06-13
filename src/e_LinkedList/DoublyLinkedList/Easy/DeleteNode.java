package e_LinkedList.DoublyLinkedList.Easy;
import e_LinkedList.DoublyLinkedList.Node;

public class DeleteNode {

    // Delete Head Node
    public static Node deleteAtHead(Node head){

        if(head == null || head.next == null) return null;

        head = head.next;
        head.prev = null;

        return head;
    }

    // Delete Tail Node
    public static Node deleteAtTail(Node head){
        if(head == null || head.next == null) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next =  null;

        return head;
    }

    // Delete Node at Position (Kth Element)
    public static Node deleteAtPosition(Node head, int k){
        if(head == null) return null;
        if(k<1) return head;

        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp =  temp.next;
        }

        // k > length
        if (temp == null) {
            return head;
        }

        Node back = temp.prev;
        Node front = temp.next;

        // For Single Node
        if(back==null && front==null){
            return null;
        }
        // For Head Node
        if(back ==  null){
           return deleteAtHead(head);
        }
        // For Tail Node
        if(front == null){
           return deleteAtTail(head);
        }

        back.next = front;
        front.prev = back;

        temp.next = null;
        temp.prev = null;


        return head;
    }

    // Delete Value Node
    public static Node deleteAtValue(Node head, int val){

        if(head == null) return null;

        Node temp = head;
        while(temp != null && temp.data != val){
            temp =  temp.next;
        }

        // value not found
        if (temp == null) {
            return head;
        }

        Node back = temp.prev;
        Node front = temp.next;

        // For Single Node
        if(back==null && front==null){
            return null;
        }
        // For Head Node
        if(back ==  null){
            return deleteAtHead(head);
        }
        // For Tail Node
        if(front == null){
            return deleteAtTail(head);
        }

        back.next = front;
        front.prev = back;

        temp.next = null;
        temp.prev = null;

        return head;
    }

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        // Link them
        head.next = n1;
        n1.prev = head;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;


//        Node temp = deleteAtHead(head);
//        Node temp = deleteAtTail(head);
//        Node temp = deleteAtPosition(head, 3);
        Node temp = deleteAtValue(head, 500);

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

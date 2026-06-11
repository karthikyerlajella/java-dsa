package p5_linkedlist.Easy;
import p5_linkedlist.Node;

public class InsertNode {

    // Insert at Head
    public static Node insertAtHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }

    // Insert at Tail
    public static Node insertAtTail(Node head, int val){
        Node curr = new Node(val, null);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = curr;
        return head;
    }

    // Insert at Position
    public static Node insertAtPosition(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }


    public static void main(String[] args) {
        Node head = new Node(7, new Node(1, new Node(2, new Node(3, null))));

//        Node temp = insertAtHead(head, 100);
//        Node temp = insertAtTail(head, 4);
        Node temp = insertAtPosition(head, 4);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

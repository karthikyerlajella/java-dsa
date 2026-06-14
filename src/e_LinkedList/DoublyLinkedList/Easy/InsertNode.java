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
    public static Node insertAtPosition(Node head, int pos, int val){

        return null;
    }

    // Insert before element
    public static Node insertBeforeElement(Node head, int val, int element){

        return null;
    }

    public static void main(String[] args) {

        // 1.Create nodes
        Node head = new Node(5);
        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(1);

        // 2.Link them
        head.next = n1;
        n1.prev = head;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;

        // Tail Node
        Node tail = n4;

//        Node temp = insertAtHead(head, 100);
        Node temp = insertAtTail(head, 100);
//        Node temp = insertAtPosition(head, 3, 100);
//        Node temp = insertBeforeElement(head, 5, 20);

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



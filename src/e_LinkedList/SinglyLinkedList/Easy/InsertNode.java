package e_LinkedList.SinglyLinkedList.Easy;

import e_LinkedList.SinglyLinkedList.Node;

public class InsertNode {

    // Insert at Head
    public static Node insertAtHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }

    // Insert at Tail
    public static Node insertAtTail(Node head, int val){

        if(head == null){
            return new Node(val,null);
        }

        Node curr = new Node(val, null);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = curr;
        return head;
    }

    // Insert at Position
    public static Node insertAtPosition(Node head, int pos, int val){

        if(pos < 1){
            System.out.println("Enter Valid Position..");
            return head;
        }

        if(pos == 1){
            return new Node(val,head);
        }

        int count  = 0;
        Node temp = head;

        while(temp != null){
            count++;
            if(count == (pos-1)){
                Node newNode = new Node(val, null);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

       return head;
    }

    // Insert before element
    public static Node insertBeforeElement(Node head, int val, int element){

        if(head == null) return null;

        if(head.data == element){
            return new Node(val,head);
        }

        Node temp = head;

        while(temp.next != null){
            if(temp.next.data == element){
                Node newNode = new Node(val, null);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

       return head;
    }


    public static void main(String[] args) {
        Node head = new Node(7, new Node(1, new Node(2, new Node(3, null))));

//        Node temp = insertAtHead(head, 100);
//        Node temp = insertAtTail(head, 4);
//        Node temp = insertAtPosition(head, 3, 5);
        Node temp = insertBeforeElement(head, 5, 20);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

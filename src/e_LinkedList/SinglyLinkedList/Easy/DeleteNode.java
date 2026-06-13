package e_LinkedList.SinglyLinkedList.Easy;


import e_LinkedList.SinglyLinkedList.Node;

public class DeleteNode {

    // Delete Head of the LL
    public static Node removeHead(Node head) {
        if(head == null) return head;
        Node temp = head;
        head = head.next;
        return head;
    }

    // Delete Tail of the LL
    public static Node removeTail(Node head) {
        if(head == null || head.next == null ) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null; // removes last node
        return head;
    }

    // Delete at Position of the LL
    public static Node removePosition(Node head, int k) {
        if(head == null) return head;

        if(k==1){
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev =  null;

        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    // Delete value of the LL
    public static Node removeValue(Node head, int val) {

        while (head != null && head.data == val) {
            head = head.next;
        }

        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
    
    public static void main(String[] args) {

        Node head = new Node(10, new Node(20, new Node(30, new Node(40, null))));

        // Node temp = removeHead(head);

         int k = 4;
         Node temp = removePosition(head, k);
//
//        int val = 10;
//        Node temp = removeValue(head, val);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

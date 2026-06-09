package p5_linkedlist.Easy;
import p5_linkedlist.Node;


public class RemoveNode {

    // Remove Head of the LL
    public static Node removeHead(Node head) {
        if(head == null) return head;
        Node temp = head;
        head = head.next;
        return head;
    }

    // Remove Tail of the LL
    public static Node removeTail(Node head) {
        if(head == null || head.next == null ) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null; // removes last node
        return head;
    }

    // Remove at Position of the LL
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

    // Remove value of the LL
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

        // int k = 1;
        // Node temp = removePosition(head, k);

        int val = 10;
        Node temp = removeValue(head, val);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

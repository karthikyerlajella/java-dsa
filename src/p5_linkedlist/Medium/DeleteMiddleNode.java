package p5_linkedlist.Medium;
import p5_linkedlist.Node;

//  LeetCode: 2095. Delete the Middle Node of a Linked List
//  TC: O(n) | SC: O(1)

public class DeleteMiddleNode {

    public static Node deleteMiddle(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;

        Node prev = null;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;

    }
    public static void main(String[] args) {

        Node head = new Node(10, new Node(20, new Node(30, new Node(40, null))));

       Node temp = deleteMiddle(head);
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

package e_LinkedList.SinglyLinkedList.Medium;
import e_LinkedList.SinglyLinkedList.ListNode;

//  LeetCode: 2095. Delete the Middle Node of a Linked List
//  TC: O(n) | SC: O(1)

public class DeleteMiddleNode {

    public static ListNode deleteMiddle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;

    }
    public static void main(String[] args) {

        ListNode head = new ListNode(10, new ListNode(20, new ListNode(30, new ListNode(40, null))));

       ListNode temp = deleteMiddle(head);
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

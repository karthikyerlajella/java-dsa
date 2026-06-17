package e_LinkedList.SinglyLinkedList.c_Reversal;
import e_LinkedList.SinglyLinkedList.ListNode;

/*
    LeetCode: 92. Reverse Linked List II
    Difficulty: Medium
    TC: O(N) | SC: O(1)
 */

public class ReverseLinkedList2 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode dummy = new ListNode(0, head);

        ListNode prev = dummy;
        ListNode curr = head;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
            curr = curr.next;
        }

        ListNode temp = curr;

        ListNode back = null;
        for (int i = 0; i <= right - left; i++) {

            ListNode front = curr.next;
            curr.next = back;

            back = curr;
            curr = front;

        }

        prev.next = back;
        temp.next = curr;

        return dummy.next;

    }


    public static void main(String[] args) {
        ListNode head = new ListNode(50, new ListNode(40, new ListNode(30, new ListNode(20, new ListNode(10,null)))));

        System.out.print("Before : ");
        for(ListNode curr=head; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");

        System.out.println();
        ListNode temp = reverseBetween(head, 2,4);

        System.out.print("After : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");
    }
}

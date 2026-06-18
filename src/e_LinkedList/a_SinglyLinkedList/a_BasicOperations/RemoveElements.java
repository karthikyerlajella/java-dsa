package e_LinkedList.a_SinglyLinkedList.a_BasicOperations;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 203. Remove Linked List Elements
    Difficulty: Easy
    TC: O(N) | SC: O(1)
*/

public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.data == val) {
            head = head.next;
        }

        ListNode curr = head;
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

        ListNode head = new ListNode(10, new ListNode(20, new ListNode(10, new ListNode(40, null))));

        ListNode temp = removeElements(head, 10);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

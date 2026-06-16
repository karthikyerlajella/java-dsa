package e_LinkedList.SinglyLinkedList.a_BasicOperations;
import e_LinkedList.SinglyLinkedList.ListNode;

/*
    LeetCode: 83. Remove Duplicates from Sorted List
    Difficulty: Easy
    TC: O(N) | SC: O(1)
 */

public class RemoveDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10, new ListNode(20, new ListNode(10, new ListNode(40, null))));

        ListNode temp = deleteDuplicates(head);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

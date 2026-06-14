package e_LinkedList.SinglyLinkedList.Easy;
import e_LinkedList.SinglyLinkedList.ListNode;

//  LeetCode: 876. Middle of the Linked List
//  TC: O(n) | SC: O(1)


public class FindMiddleNode {

    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode temp = middleNode(head);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


package e_LinkedList.a_SinglyLinkedList.c_Reversal;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 206. Reverse Linked List
    Difficulty: Easy
    TC: O(N) | SC: O(1)
 */

public class ReverseLinkedList1 {
    public static ListNode reverseList(ListNode head) {
        if (head==null) return null;

    // Brute : TC - O(2N) | SC - O(N)
    /*
         Deque<Integer> st = new ArrayDeque<>();

        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            temp.val = st.peek();
            st.pop();
            temp = temp.next;
        }
    */

    // Recursion : TC - O(N) | SC - O(N)
    /*

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;

     */

    // Optimal : TC - O(N) | SC - O(1)
        ListNode temp = head;
        ListNode back = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = back;

            back = temp;
            temp = front;
        }
        head = back;

        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(50, new ListNode(40, new ListNode(30, new ListNode(20, new ListNode(10,null)))));

        System.out.print("Before : ");
        for(ListNode curr=head; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
        System.out.print("null");

        System.out.println();
        ListNode temp = reverseList(head);

        System.out.print("After : ");
        for(ListNode curr=temp; curr != null; curr = curr.next){
            System.out.print(curr.data  + " -> ");
        }
            System.out.print("null");
    }
}

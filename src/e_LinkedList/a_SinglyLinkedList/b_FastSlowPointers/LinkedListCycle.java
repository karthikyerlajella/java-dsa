package e_LinkedList.a_SinglyLinkedList.b_FastSlowPointers;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 141. Linked List Cycle
    Difficulty: Easy
    TC: O(N) | SC: O(1)
 */

public class LinkedListCycle {

    public static  boolean hasCycle(ListNode head) {
        // Brute
        // HashSet<Node> set = new HashSet<>();

        // Node curr =  head;
        // while(curr != null){
        //     if(set.contains(curr)){
        //         return true;
        //     }
        //     else{
        //         set.add(curr);
        //     }

        //     curr = curr.next;
        // }

        // return false;

        // Optimal - Two  Pointers
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;

    }

    public static void main(String[] args) {

        ListNode node5 = new ListNode(5,null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // Create cycle: 5 -> 3
        node5.next = node3;

        System.out.println(hasCycle(node1));
    }
}

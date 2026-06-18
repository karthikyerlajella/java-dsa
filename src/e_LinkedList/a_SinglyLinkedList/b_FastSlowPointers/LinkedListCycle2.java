package e_LinkedList.a_SinglyLinkedList.b_FastSlowPointers;
import e_LinkedList.a_SinglyLinkedList.ListNode;

/*
    LeetCode: 142. Linked List Cycle II
    Difficulty: Medium
    TC: O(N) | SC: O(1)
*/

public class LinkedListCycle2 {

    public static ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        // Brute
        // HashSet<Node> set = new HashSet<>();

        // Node temp = head;
        // while(temp != null){
        //     if(set.contains(temp)){
        //         return temp;
        //     }
        //     else{
        //         set.add(temp);
        //     }
        //     temp = temp.next;
        // }

        // Optimal - Two Pointers

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode temp = head;
                while (temp != slow) {

                    temp = temp.next;
                    slow = slow.next;

                }
                return slow;
            }

        }

        return null;

    }

    public static void main(String[] args) {

        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // Create cycle: 5 -> 3
        node5.next = node3;

        ListNode cycleStart = detectCycle(node1);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node: " + cycleStart.data);
        } else {
            System.out.println("No cycle found");
        }
    }
}
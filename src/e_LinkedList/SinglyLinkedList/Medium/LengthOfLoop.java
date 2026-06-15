package e_LinkedList.SinglyLinkedList.Medium;
import e_LinkedList.SinglyLinkedList.ListNode;

public class LengthOfLoop {

    public static int findLengthOfLoop(ListNode head) {

        if(head == null) return 0;

        ListNode slow = head;
        ListNode fast = head;

        int count = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if(slow == fast){
                return count;
            }
        }

        return 0;

    }

    public static void main(String[] args) {

        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // Create cycle: 5 -> 3
        node5.next = node3;

        System.out.println(findLengthOfLoop(node1));

        }
    }


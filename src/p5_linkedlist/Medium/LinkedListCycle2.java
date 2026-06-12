package p5_linkedlist.Medium;

import p5_linkedlist.Node;

//  LeetCode: 142. Linked List Cycle 2
//  TC: O(n) | SC: O(1)

public class LinkedListCycle2 {

    public static Node detectCycle(Node head) {

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

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node temp = head;
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

        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        // Create cycle: 5 -> 3
        node5.next = node3;

        Node cycleStart = detectCycle(node1);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node: " + cycleStart.data);
        } else {
            System.out.println("No cycle found");
        }
    }
}
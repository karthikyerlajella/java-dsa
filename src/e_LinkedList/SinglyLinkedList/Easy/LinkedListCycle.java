package e_LinkedList.SinglyLinkedList.Easy;

//  LeetCode: 141. Linked List Cycle
//  TC: O(n) | SC: O(1)

import e_LinkedList.SinglyLinkedList.Node;

public class LinkedListCycle {

    public static  boolean hasCycle(Node head) {
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

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Node node5 = new Node(5,null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        // Create cycle: 5 -> 3
        node5.next = node3;

        System.out.println(hasCycle(node1));
    }
}

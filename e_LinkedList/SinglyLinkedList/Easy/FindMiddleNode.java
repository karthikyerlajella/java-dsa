package e_LinkedList.SinglyLinkedList.Easy;
import e_LinkedList.SinglyLinkedList.Node;

//  LeetCode: 876. Middle of the Linked List
//  TC: O(n) | SC: O(1)


public class FindMiddleNode {

    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(1, new Node(1, new Node(3, new Node(4, new Node(5, null)))));

        Node temp = middleNode(head);

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


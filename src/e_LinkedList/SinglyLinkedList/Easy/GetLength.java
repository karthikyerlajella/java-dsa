package e_LinkedList.SinglyLinkedList.Easy;

import e_LinkedList.SinglyLinkedList.ListNode;

public class GetLength {

    public static int getLength(ListNode head) {

        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10, new ListNode(20, new ListNode(30, new ListNode(40, null))));

        int count = getLength(head);
        System.out.println("Length of the LinkedList : " + count);


    }
}

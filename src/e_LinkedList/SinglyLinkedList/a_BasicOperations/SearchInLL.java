package e_LinkedList.SinglyLinkedList.a_BasicOperations;

import e_LinkedList.SinglyLinkedList.ListNode;

public class SearchInLL {

    public static int searchKey(ListNode head, int key) {
        ListNode temp = head;
        while(temp != null){
            if(temp.data == key) return 1;
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10, new ListNode(20, new ListNode(30, new ListNode(40, null))));
        int key = 140;
        int result = searchKey(head,key);
        if(result == 1) System.out.println(key + " is Found");
        else System.out.println(key + " is Not Found");

    }
}

package p5_linkedlist.Easy;

import p5_linkedlist.Node;

public class SearchInLL {

    public static int getLength(Node head, int val) {
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {

        Node head = new Node(10, new Node(20, new Node(30, new Node(40, null))));
        int val = 140;
        int result = getLength(head,val);
        if(result == 1) System.out.println(val + " is Found");


    }
}

package p5_linkedlist.SingleLL;
import p5_linkedlist.Node;

public class GetLength {

    public static int getLength(Node head) {

        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(10, new Node(20, new Node(30, new Node(40, null))));

        int count = getLength(head);
        System.out.println("Length of the LinkedList : " + count);


    }
}

package p5_linkedlist.SingleLL;
import p5_linkedlist.Node;

public class SearchInLL {

    public static int searchKey(Node head, int key) {
        Node temp = head;
        while(temp != null){
            if(temp.data == key) return 1;
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {

        Node head = new Node(10, new Node(20, new Node(30, new Node(40, null))));
        int key = 140;
        int result = searchKey(head,key);
        if(result == 1) System.out.println(key + " is Found");
        else System.out.println(key + " is Not Found");

    }
}

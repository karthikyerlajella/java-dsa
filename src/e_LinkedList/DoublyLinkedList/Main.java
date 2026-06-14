package e_LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        ListNode one =  new ListNode(10);
        ListNode two =  new ListNode(20);
        ListNode three = new ListNode(30);

        one.next = two;
        two.next = three;

        two.prev = one;
        three.prev = two;

        ListNode temp = one;

        System.out.print("null <-> ");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

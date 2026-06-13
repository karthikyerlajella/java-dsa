package e_LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        Node one =  new Node(10);
        Node two =  new Node(20);
        Node three = new Node(30);

        one.next = two;
        two.next = three;

        two.prev = one;
        three.prev = two;

        Node temp = one;

        System.out.print("null <-> ");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

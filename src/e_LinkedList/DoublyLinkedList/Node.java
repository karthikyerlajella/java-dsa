package e_LinkedList.DoublyLinkedList;

public class Node {

    public int data;
    public Node prev;
    public Node next;

    public Node(){

    }
    public Node(int data){
        this.data = data;
    }

    public Node(int data, Node prev, Node next){

        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

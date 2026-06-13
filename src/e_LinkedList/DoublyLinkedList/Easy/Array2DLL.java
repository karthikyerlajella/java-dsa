package e_LinkedList.DoublyLinkedList.Easy;
import e_LinkedList.DoublyLinkedList.Node;

public class Array2DLL {

    public static Node arrToDLL(int[] nums){

        Node head = new Node(nums[0]);
        Node previous = head;

        for(int i=1; i<nums.length; i++){
            Node curr = new Node(nums[i], previous, null);
            previous.next = curr;
            previous = curr;
        }

        return head;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};

        Node temp = arrToDLL(nums);

        System.out.print("null <-> ");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

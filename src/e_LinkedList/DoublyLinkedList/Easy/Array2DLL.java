package e_LinkedList.DoublyLinkedList.Easy;
import e_LinkedList.DoublyLinkedList.ListNode;

public class Array2DLL {

    public static ListNode arrToDLL(int[] nums){

        ListNode head = new ListNode(nums[0]);
        ListNode previous = head;

        for(int i=1; i<nums.length; i++){
            ListNode curr = new ListNode(nums[i], previous, null);
            previous.next = curr;
            previous = curr;
        }

        return head;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};

        ListNode temp = arrToDLL(nums);

        System.out.print("null <-> ");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

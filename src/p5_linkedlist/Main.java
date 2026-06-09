package p5_linkedlist;

//    class Node{
//        int data;
//        Node next;

//        Node(int data){
//            this.data = data;
//        }

//        Node(int data, Node next){
//            this.data = data;
//            this.next = next;
//        }
//    }


public class Main {

    // Array to LinkedList
//    private static Node convertArr2LL(int[] nums){
//        Node head = new Node(nums[0],null);
//        Node  mover = head;
//        for(int i=1; i<nums.length; i++){
//            Node temp = new Node(nums[i],null);
//            mover.next = temp;
//            mover = temp;
//
//        }
//        return head;
//    }

    public static void main(String[] args) {
        int[] nums = {71,92,63,43,23,4,212,21,21,22};

//        Node second = new Node(nums[3],null);
//        Node first = new Node(nums[2],second);
//        System.out.println(first.data);
//        System.out.println(first.next);
//        System.out.println(second.data);
//        System.out.println(second.next);

//         Entire list in one line
        Node head = new Node(10, new Node(20, new Node(30, new Node(40, null))));

        // Array to LinkedList
//        Node head = convertArr2LL(nums);



        // Print Entire List
        int count = 0; // to find length of the LL
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;

//            count++;
        }
        System.out.println("null");

//        System.out.println("Length of the LinkedList : " + count);


    }
}


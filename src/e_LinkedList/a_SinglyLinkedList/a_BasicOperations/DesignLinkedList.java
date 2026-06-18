package e_LinkedList.a_SinglyLinkedList.a_BasicOperations;

/*
    LeetCode: 707. Design Linked List
    Difficulty: Medium
 */

public class DesignLinkedList {

   static class MyLinkedList {

        class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }

        ListNode head;
        ListNode tail;
        int size;

        public MyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public int get(int index) {

            if (index < 0 || index >= size || head == null) {
                return -1;
            }

            ListNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            return temp.val;

        }

        public void addAtHead(int val) {

            ListNode newHead = new ListNode(val);

            if (head == null) {
                head = tail = newHead;
            } else {
                newHead.next = head;
                head = newHead;
            }

            size++;

        }

        public void addAtTail(int val) {

            ListNode newTail = new ListNode(val);

            if (tail == null) {
                head = tail = newTail;
            } else {
                tail.next = newTail;
                tail = newTail;
            }

            size++;

        }

        public void addAtIndex(int index, int val) {

            if (index < 0 || index > size) {
                return;
            }

            if (index == 0) {
                addAtHead(val);
                return;
            }

            if (index == size) {
                addAtTail(val);
                return;
            }

            ListNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            ListNode newNode = new ListNode(val);

            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }

        public void deleteAtIndex(int index) {

            if (index < 0 || index >= size) {
                return;
            }

            else if (head == tail) {
                head = tail = null;
                size--;
            }

            else if (index == 0) {
                head = head.next;
                size--;
            }

            else if (index == size - 1) {

                ListNode temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }

                temp.next = null;
                tail = temp;
                size--;

            }

            else {

                ListNode temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;

            }
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        System.out.println("Adding at head: 1");
        list.addAtHead(1);

        System.out.println("Adding at tail: 3");
        list.addAtTail(3);

        System.out.println("Adding 2 at index 1");
        list.addAtIndex(1, 2);

        System.out.println("get(0) = " + list.get(0)); // 1
        System.out.println("get(1) = " + list.get(1)); // 2
        System.out.println("get(2) = " + list.get(2)); // 3

        System.out.println("Deleting index 1");
        list.deleteAtIndex(1);

        System.out.println("get(0) = " + list.get(0)); // 1
        System.out.println("get(1) = " + list.get(1)); // 3
        System.out.println("get(2) = " + list.get(2)); // -1

        System.out.println("Size = " + list.size);
    }
}

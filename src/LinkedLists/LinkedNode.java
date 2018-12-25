package LinkedLists;

public class LinkedNode {

    public LinkedNode next;

    //this is only used for doubly linked lists
    LinkedNode previous;

    public int value;

    public static void printLinkedList(LinkedNode str) {

        LinkedNode cur = str;

        while(cur != null) {
            System.out.println("LinkedNode: " + cur.value);
            cur = cur.next;
        }
    }

    public LinkedNode(int val) {
        this.value = val;
    }

    public void setNext(LinkedNode nxt) {
        this.next = nxt;
    }

    public static void addToEnd(LinkedNode head, LinkedNode newNode) {

        if(head.next == null) {
            head.next = newNode;
            return;
        } else {
            addToEnd(head.next, newNode);
        }
    }
}

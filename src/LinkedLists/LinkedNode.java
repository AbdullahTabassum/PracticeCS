package LinkedLists;

public class LinkedNode {

    LinkedNode next;

    //this is only used for doubly linked lists
    LinkedNode previous;

    String value;

    public static void printLinkedList(LinkedNode str) {

        LinkedNode cur = str;

        while(cur != null) {
            System.out.println("LinkedNode: " + cur.value);
            cur = cur.next;
        }
    }

    public LinkedNode(String val) {
        this.value = val;
    }

    public void setNext(LinkedNode nxt) {
        this.next = nxt;
    }
}

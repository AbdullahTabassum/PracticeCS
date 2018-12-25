package LinkedLists;

public class ReverseLinkedList {

    static int window = 0;

    public static LinkedNode reverseLL(LinkedNode head, int windowSize) {
        window = windowSize;
        //return reverseLLHelper(head, null, 1);
        return null;
    }

    public static LinkedNode reverseLLHelper(LinkedNode head, LinkedNode newChild, LinkedNode last) {

        if(head.next == null || head == last) {
            head.next = newChild;
            return head;
        }

        LinkedNode newHead = reverseLLHelper(head.next, head, last);

        head.next = newChild;

        return newHead;
    }

}

package LinkedLists;

import java.util.Stack;

public class ReverseEveryInterval {

    public static LinkedNode reverseIntervalHelper(LinkedNode head, int k) {

        if(head == null)
            return null;

        LinkedNode oldHead = head;

        LinkedNode nextHead = getNextHead(head, k);

        LinkedNode newHead = reverseWithInterval(oldHead, k);

        oldHead.next = reverseIntervalHelper(nextHead, k);

        return newHead;
    }

    public static LinkedNode getNextHead(LinkedNode h, int k) {

        //return the node after k nodes, or return null if the list is completed
        LinkedNode ret = h;

        for(int i = 0; i < k && ret != null; i++) {
            ret = ret.next;
        }
        return ret;
    }

    public static LinkedNode reverseWithInterval(LinkedNode h, int k) {

        //add stuff to the stack
        Stack<LinkedNode> s = new Stack<>();
        LinkedNode cur = h;
        while(s.size() < k && cur != null){
            s.push(cur);
            cur = cur.next;
        }

        LinkedNode newHead = null;

        if( !s.isEmpty())
            newHead = s.peek();

        //now pop stuff off and reassign their next pointers
        while(s.size() > 0) {
            LinkedNode ln = s.pop();

            if(!s.isEmpty())
                ln.next = s.peek();
        }

        return newHead;
    }
}

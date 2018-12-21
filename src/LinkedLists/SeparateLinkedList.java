package LinkedLists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list where in there can be nodes of only 3 different values, separate them into their own LinkedList
 */
public class SeparateLinkedList {

    /**
     *  We are returning a list of linked lists where each linked list contains only one type of element (0,1,2)
     * @param head
     * @return
     */
    public static Map<Integer, LinkedNode> seperate(LinkedNode head) {

        Map<Integer, LinkedNode> llMap = new HashMap<>();

        //iterate through the given linked list, for each node, remove it from the list, then add it to its
        //respective list in the Map
        while(head != null) {
            //LinkedNode ln = removeNode(head);
            LinkedNode temp = head;
            head = head.next;

            //add temp to the Map
            addNode(temp, llMap);
        }

        return llMap;
    }

    private static void addNode(LinkedNode ln, Map<Integer, LinkedNode> map) {

        Integer val = ln.value;

        LinkedNode nn = map.get(val);
        ln.next = null;//disconnected from original tree
        if( nn == null ) {
            map.put(val, ln);
        } else {
            LinkedNode.addToEnd(nn, ln);
        }
    }
}

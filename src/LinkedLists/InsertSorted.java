package LinkedLists;

//for a singly linked list, we will have to traverse the list one by one
//we will need to identify the location where the current node is before and the next node is after
public class InsertSorted {

    public static LinkedNode insertInSortedLL(LinkedNode head, LinkedNode nLN) {

        //null case
        if(head == null) {
            System.out.println("The list is empty");
            return nLN;
        }

        //in the case there is only LinkedNode
        if(head.next == null) {
            //insert in front or back
            if(isNewNodeGreater(head, nLN))
                insertBeforeBeg(head, nLN);
            else
                head.next = nLN;

        }

        LinkedNode temp = head;

        while(temp.next != null) {
            //System.out.println("node before: " + temp.value + " and node after: " + temp.next.value);
            if (temp.value < nLN.value && temp.next.value > nLN.value) {
                //System.out.println("FOUND PLACE:: node before: " + temp.value + " and node after: " + temp.next.value);
                insertInBetween(temp, nLN, temp.next);
            }
            temp = temp.next;
        }

        return head;
    }

    private static boolean isNewNodeGreater(LinkedNode ext, LinkedNode nNode) {
        return ext.value > nNode.value;
    }

    private static LinkedNode insertBeforeBeg(LinkedNode ext, LinkedNode nNode) {
        nNode.next = ext;
        return nNode;
    }

    private static void insertInBetween(LinkedNode frst, LinkedNode nNode, LinkedNode aftr) {
        frst.next = nNode;
        nNode.next = aftr;
    }

}

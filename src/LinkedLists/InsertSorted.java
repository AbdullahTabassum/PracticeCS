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
        }

        return true;
    }

    private boolean isNewNodeGreater(LinkedNode ext, LinkedNode nNode) {
        
    }

    private LinkedNode insertBeforeBeg(LinkedNode ext, LinkedNode nNode) {
        nNode.next = ext;
        return nNode;
    }

    private void insertInBetween() {

    }

    private void insertAfterEnd(LinkedNode ext, LinkedNode nNode) {
        ext.next = nNode;
    }
}

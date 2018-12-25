package SearichingAndSorting;

import LinkedLists.LinkedNode;

/**
 * implementation for a linked list and an array
 */
public class MergeSort {

    public static LinkedNode mergeSort(LinkedNode head) {

        if(head.next == null) {
           return head;
        }

        //get right half
        LinkedNode nextHalf = getNextHalf(head);

        //call merge sort on the left half and on the right half
        LinkedNode sortedLeft = mergeSort(head);
        LinkedNode sortedRight = mergeSort(nextHalf);

        //merge the left half and the right half
        //return the combined linked list
        return merge(sortedLeft, sortedRight);

    }

    /**
     * - need to get the head for the right half, and detach the tail of it
     * - also need to detach the tail from the left half
     * @return
     */
    public static LinkedNode getNextHalf(LinkedNode head) {

        //iterate through the linked list to get the next half
        //detach the node before the next half starts
        int listSize = getListSize(head);

        //go upto the node right at the middle of the list
        LinkedNode temp = head;
        for(int i = 0; i < listSize/2; i++) {
            temp = temp.next;
        }

        LinkedNode nextHead = temp.next;
        temp.next = null;

        return nextHead;
    }

    public static int getListSize(LinkedNode node) {
        int counter = 0;

        while(node!=null) {
            counter++;
            node = node.next;
        }

        return counter;
    }

    public static LinkedNode merge(LinkedNode left, LinkedNode right) {

        LinkedNode newHead = null;
        LinkedNode newTail = null;

        //one of them is null, or both of them
        if(left != null || right != null) {
            if(left == null) {
                return right;
            } else {
                return left;
            }
        } else { //both of them are not null
            if(left.value < right.value) {
                newHead = left;
                newTail = left;
                left = left.next;
                newTail.next = null;

            } else {
                newHead = right;
                newTail = right;
                right = right.next;
                newTail.next = null;
            }
        }

        while(left != null && right != null) {
            if(left.value < right.value) {
                newTail.next = left;
                newTail = newTail.next;
                left = left.next;
                newTail.next = null;
            } else {
                newTail.next = right;
                newTail = newTail.next;
                right = right.next;
                newTail.next = null;
            }
        }

        //one of them is null, either left or right
        if(left == null) {
            newTail.next = right;
        } else {
            newTail.next = left;
        }

        return newHead;
    }

    public static LinkedNode getNextNode() {
        return null;
    }
}

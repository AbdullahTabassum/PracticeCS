package LinkedLists;

import SearichingAndSorting.MergeSort;

import java.util.Iterator;
import java.util.Map;

import static LinkedLists.SeparateLinkedList.seperate;

public class LinkedListDriver {

    public static void driveInsertInSorted() {
        //create the new node
        LinkedNode nLN = new LinkedNode(9);

        //create the linked list to test
        //2-5-7-10-15
        LinkedNode n2 = new LinkedNode(2);
        LinkedNode n5 = new LinkedNode(5);
        LinkedNode n7 = new LinkedNode(7);
        LinkedNode n10 = new LinkedNode(10);
        LinkedNode n15 = new LinkedNode(15);

        n2.setNext(n5);
        n5.setNext(n7);
        n7.setNext(n10);
        n10.setNext(n15);

        //now call the insert sorted order method
        LinkedNode.printLinkedList(n2);
        InsertSorted.insertInSortedLL(n2, nLN);
        LinkedNode.printLinkedList(n2);
    }

    public static void reverseLLDriver() {
        //create the new node
        LinkedNode nLN = new LinkedNode(9);

        //create the linked list to test
        //2-5-7-10-15
        LinkedNode n2 = new LinkedNode(2);
        LinkedNode n5 = new LinkedNode(5);
        LinkedNode n7 = new LinkedNode(7);
        LinkedNode n10 = new LinkedNode(10);
        LinkedNode n15 = new LinkedNode(15);

        n2.setNext(n5);
        n5.setNext(n7);
        n7.setNext(n10);
        n10.setNext(n15);

        //now call the insert sorted order method
        //LinkedNode.printLinkedList(n2);
        InsertSorted.insertInSortedLL(n2, nLN);
        LinkedNode.printLinkedList(n2);

        //LinkedNode.printLinkedList(ReverseLinkedList.reverseLL(n2));
        LinkedNode n = ReverseEveryInterval.reverseIntervalHelper(n2, 4);
        System.out.println("This is the list after it has been interval reversed ");
        LinkedNode.printLinkedList(n);
    }

    public static void seperationDriver() {

        //create the new node
        LinkedNode nLN = new LinkedNode(0);

        //create the linked list to test
        //2-5-7-10-15
        LinkedNode n2 = new LinkedNode(1);
        LinkedNode n5 = new LinkedNode(1);
        LinkedNode n7 = new LinkedNode(2);
        LinkedNode n10 = new LinkedNode(0);
        LinkedNode n15 = new LinkedNode(2);

        n2.setNext(n5);
        n5.setNext(n7);
        n7.setNext(n10);
        n10.setNext(n15);

        //now call the insert sorted order method
        //LinkedNode.printLinkedList(n2);
        InsertSorted.insertInSortedLL(n2, nLN);
        LinkedNode.printLinkedList(n2);

        Map<Integer, LinkedNode> nodeMap = SeparateLinkedList.seperate(n2);
        //print out the contents of the map
        Iterator it = nodeMap.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry<Integer, LinkedNode>)it.next();
            System.out.println("This is the output for: " + e.getKey());
            LinkedNode.printLinkedList((LinkedNode)e.getValue());
        }
    }

    public static void mergeSortDriver() {

        LinkedNode n1 = new LinkedNode(1);
        LinkedNode n2 = new LinkedNode(2);
        LinkedNode n3 = new LinkedNode(3);
        LinkedNode n4 = new LinkedNode(4);
        LinkedNode n5 = new LinkedNode(5);
        LinkedNode n6 = new LinkedNode(6);
        LinkedNode n7 = new LinkedNode(7);
        LinkedNode n8 = new LinkedNode(8);

        n8.setNext(n6);
        n6.setNext(n5);
        n5.setNext(n7);
        n7.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n4);
        n4.setNext(n3);

        LinkedNode sorted =MergeSort.mergeSort(n8);
        LinkedNode.printLinkedList(sorted);

    }
}

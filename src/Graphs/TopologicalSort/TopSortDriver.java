package Graphs.TopologicalSort;

import Graphs.Node;

import java.util.Iterator;
import java.util.Stack;

public class TopSortDriver {

    public static void driver() {
        //create a graph
        Node n40 = new Node("40");
        Node n20 = new Node("20");
        Node n50 = new Node("50");
        Node n70 = new Node("70");
        Node n60 = new Node("60");
        Node n30 = new Node("30");
        Node n10 = new Node("10");

        n40.setAdgs(n20, n10);
        n20.setAdgs(n50, n60, n30, n10);
        n10.setAdgs(n30);
        n30.setAdgs(n60);
        n60.setAdgs(n70);
        n50.setAdgs(n70);

        TopologicalSort.sort(n40);
        //System.out.println("here is the sorted stack" + TopologicalSort.stack);
        Iterator it = TopologicalSort.stack.iterator();

//        while(it.hasNext()) {
//            Node cur = (Node)it.next();
//            System.out.println("Node: " + cur.value);
//            it.remove();
//        }

        System.out.println("Try printing by knocking off from the stack");
        Stack<Node> stack = TopologicalSort.stack;

        while(!stack.empty()) {
            Node t = stack.pop();
            System.out.println("Popped Node: " + t.value);
        }

    }
}

package Graphs.TopologicalSort;

import Graphs.Node;

import java.util.*;

/**
 *
 * Topological sort works only for Directed Acyclic graph.
 * You will also need to be given a starting point.
 *
 */
public class TopologicalSort {

    static Stack<Node> stack = new Stack<>();
    static Set<Node> visited = new HashSet<Node>();

    public static void sort(Node node) {



        //start from the starting point node and mark it as visited
        visited.add(node);

        //now recur to all of its adjecent nodes
        for(Node n : node.adj) {
            if(!visited.contains(n))
                sort(n);
        }

        //finally add the current node to the stack
        stack.push(node);
        return;
    }

}

package Graphs.TopologicalSort;

import Graphs.Node;

import java.util.*;

public class TopologicalSort {

    public static void sort(Set<Node> graph) {

        Set<Node> visited = new HashSet<Node>();
        Stack<Node> stack


        //choose a node to start from
        Node cur = getRandomNode(graph);

        //add it to visited set
        visited.add(cur);

        //go through all of its neighbours and if neighbour has not been visited then visit it, i.e. all sort upon it
        for(Node n : cur.adj) {
            if( !visited.contains(n) ) {
                sort(graph);
            }
        }


    }

    private static Node getRandomNode(Set<Node> g) {
        return null;
    }
}

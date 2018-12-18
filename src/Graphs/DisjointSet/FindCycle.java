package Graphs.DisjointSet;

import Graphs.Node;

import java.util.Set;

public class FindCycle {

    public static boolean findCycle(Set<Node> graph) {

        //go through each node?
            // initialize all nodes in the graph as a disjoint set, but with no parent
            // go through each node's edges
            // for each edge, see which DisjointSet it is connected to
            // if there is a node, that belongs to a disjoint set and also has another edge that goes into the same DisjointSet, we have a cycle
        //or got through each edge?
            // go through each edge
            // look at the nodes that the edge is connected to
            // when we see two nodes that are conneced by an edge, those two disjoint sets should get merged
            // if we see an edge, where both of its vertices are in the same disjoint set, then we have a out match
        return false;
    }
}

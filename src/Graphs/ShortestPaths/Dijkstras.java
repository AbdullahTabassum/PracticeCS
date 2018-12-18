package Graphs.ShortestPaths;

import Graphs.Node;

import java.util.*;

/**
 * ##
 * --
 * -- This class return the shortest path cost to the destination from the specified source
 * --
 * ##
 */
public class Dijkstras {

    static Comparator<Edge> edgeComp = new Comparator<Edge>() {
        @Override
        public int compare(Edge e1, Edge e2) {
            return e1.cost - e2.cost;
        }
    };

    static PriorityQueue<Edge> edgeQueue = new PriorityQueue<>(edgeComp);

    /**
     * @input
     *  - @Node src
     *  - @Set<Node> graph
     *
     * @output
     *  - Map<String, Integer>
     */
    public static Map<String, Integer> getShortestPaths(Node src, Set<Node> graph) {

        Map<String, Integer> shortestCosts = new HashMap<>();
        Set<Node> disc = new HashSet<>();

        //start from a node in the set
        //take that out from the set (i.e. the src)
        graph.remove(src);

        //add it to the set of nodes discovered
        disc.add(src);

        //create a priority queue, and add this nodes edges to the queue such that the least cost nodes are at the top - Comparator
        edgeQueue.addAll(src.edges);

        while( !graph.isEmpty() ) {
            //grab top edge (least cost)
            Edge curEdge = edgeQueue.remove();

            //get its dst node
            Node dstN = curEdge.dst;

            //get the src node of the least cost edge
            Node srcN = curEdge.src;

            // add the dst node to the hashmap with the cost to it being the cost to src (of edge) + the cost of the edge
            Integer cost = curEdge.cost + shortestCosts.get(srcN.value);

            //add the edges of this dst node to the priority queue, and remove from graph
            graph.remove(dstN);
            edgeQueue.addAll(dstN.edges);
        }

        return shortestCosts;
    }
}

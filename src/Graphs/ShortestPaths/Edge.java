package Graphs.ShortestPaths;

import Graphs.Node;

public class Edge {

    Node src;
    Node dst;
    Integer cost;

    public Edge(Node src, Node dst, Integer cost) {
        this.src = src;
        this.dst = dst;
        this.cost = cost;
    }
}

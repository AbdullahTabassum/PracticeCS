package Graphs;

import Graphs.ShortestPaths.Edge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

    public String value;
    public List<Node> adj = new ArrayList<>();
    public List<Edge> edges =  new ArrayList<>();

    public Node(String val) {
        this.value = val;
    }

    public void setAdgs(Node... nodes) {

        this.adj.addAll(Arrays.asList(nodes));

    }

    public void setEdges(Edge... edges) {

        this.edges.addAll(Arrays.asList(edges));

    }
}

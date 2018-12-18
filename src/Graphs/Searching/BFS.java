package Graphs.Searching;

import Graphs.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS implements Searchable{


    public boolean findDest(Node src, Node dst) {

        //create a queue that will be used add new adj Nodes
        Queue<Node> nextNodes = new LinkedList<>();

        //a set to determine which nodes have already been visited (to avoid loops)
        Set<Node> disc = new HashSet<>();

        //add the src to the nextNodes to start the algo
        nextNodes.add(src);
        disc.add(src);

        while( !nextNodes.isEmpty() ) {
            //pick the a new node to travel through
            Node curr = nextNodes.remove();

            if (curr == dst) {
                System.out.println("We found the destination node");
                return true;
            }

            //add all of its neighbours to the queue if they haven't already been added to the queue
            for( Node n : curr.adj ) {

                //if the node is not discovered, only then should we add it to the queue
                if( !disc.contains(n) ) {
                    disc.add(n);
                    nextNodes.add(n);
                }
            }

        }

        System.out.println("Could not find the destionation node");
        return false;
    }
}

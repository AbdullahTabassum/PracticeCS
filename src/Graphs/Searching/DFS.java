package Graphs.Searching;

import Graphs.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS implements Searchable {

//    //iterative
//    @Override
//    public boolean findDest(Node src, Node dst) {
//
//        Stack<Node> nodes = new Stack<>();
//        Set<Node> visited = new HashSet<>();
//
//        //add the src to the stack
//        //and the visited nodes
//        nodes.add(src);
//        visited.add(src);
//
//        while( !nodes.isEmpty() ) {
//
//            //take the top
//            Node current = nodes.pop();
//
//            //if the current node is the desired node, then return true
//            if ( current == dst ) {
//                return true;
//            }
//
//            //add all of the curent nodes neighbours, to the stack if they are not visited
//            for( Node n : current.adj) {
//                if (!visited.contains(n)) {
//                    visited.add(n);
//                    nodes.add(n);
//                }
//            }
//        }
//
//        return false;
//    }



    //recursive
    @Override
    public boolean findDest(Node src, Node dst) {

        return findDestHelper(src, dst, new HashSet<>());
    }

    public boolean findDestHelper(Node src, Node dst, Set<Node> visited) {

        if (src == null)
            return false;

        if ( src == dst )
            return true;

        //recursively call findDest for each neighbour
        for( Node n: src.adj ) {

            if( visited.contains(n))
                continue;
            else
                return findDest(n, dst);

        }

        return false;
    }
}

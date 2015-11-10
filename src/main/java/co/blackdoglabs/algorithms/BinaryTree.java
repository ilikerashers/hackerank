package co.blackdoglabs.algorithms;

import org.apache.commons.lang3.tuple.Triple;

import java.util.List;

/**
 * Created by jim on 10/11/15.
 */
public class BinaryTree {

    // Root node pointer. Will be null for an empty tree.
    private Node root;


    /*
     --Node--
     The binary tree is built using this nested node class.
     Each node stores one data element, and has left and right
     sub-tree pointer which may be null.
     The node is a "dumb" nested class -- we just use it for
     storage; it does not have any methods.
    */
    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }


    /**
     Recursive lookup  -- given a node, recur
     down searching for the given data.
     */
    private boolean lookup(Node node, int data) {
        if (node==null) {
            return(false);
        }

        if (data==node.data) {
            return(true);
        }
        else if (data<node.data) {
            return(lookup(node.left, data));
        }
        else {
            return(lookup(node.right, data));
        }
    }

    private int size() {
        return size(root);
    }

    private int size(Node node) {
        if(node == null) return 0;

        return size(node.left) + 1 + size(node.right);
    }

    private int maxDepth() {
        return maxDepth(root);
    }

    private int maxDepth(Node node) {

        if(node == null) return 0;

        int maxL = maxDepth(node.left);
        int maxR = maxDepth(node.right);

        return Math.max(maxL, maxR) + 1;
    }

    public boolean hasPathSum(int sum) {
        return( hasPathSum(root, sum) );
    }

    private boolean hasPathSum(Node node, int sum) {

        if(node == null) {
            return (sum == 0);
        }

        int subSum = sum - node.data;
        return (hasPathSum(node.left, subSum) || hasPathSum(node.right, subSum));

    }


}

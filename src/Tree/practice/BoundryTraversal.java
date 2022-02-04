package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.List;

public class BoundryTraversal {

    public static void main (String args[]) {
        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        boundryTraversal(node);
    }

    /**
     * In boundry traversal : we traverse only the boundry elements
     * @param node
     *
     *
     *  /*
     *        Traversing tree like this will result to : 1235673
     *           1
     *         /  \
     *         2   3
     *        / \  / \
     *        4  5 6  7
     *
     *     eg. 2  result : 1 2 4 9 6 8 7 3 1
     *           1
     *         /  \
     *         2    3
     *        / \  /  \
     *        4  5 6   7
     *           \     /
     *            9    8
     *
     *     */


    private static void boundryTraversal(TreeNode node) {
        //print the left side
        //print the right side
        //Leaf nodes : print all those elements whose left and right are null
        System.out.println(node.getData());
        printLeft(node.getLeft());
        printRight(node.getRight());
        printLeaf(node);
    }

    private static void printLeft(TreeNode node) {
        if (node == null)
            return;
        if (node.getRight() != null || node.getLeft() != null)
            System.out.println(node.getData());
        printLeft(node.getLeft());
    }

    private static void printRight(TreeNode node) {
        if (node == null)
            return;
        if (node.getRight() != null || node.getLeft() != null)
            System.out.println(node.getData());
        printRight(node.getRight());
    }


    private static void printLeaf(TreeNode node) {
        if (node == null)
            return;
        if (node.getRight() == null && node.getLeft() == null)
            System.out.println(node.getData());
        printLeaf(node.getRight());
        printLeaf(node.getLeft());
    }
}

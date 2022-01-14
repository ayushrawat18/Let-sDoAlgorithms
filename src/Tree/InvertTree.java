package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.Queue;

public class InvertTree {

    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateTreeData();
        //Printing the node in preOrder ie. Node - Left - Right
        TreeTraversing.levelOrderTraversing(node);
        invertTree(node);
        System.out.println(" \n After ");
        TreeTraversing.levelOrderTraversing(node);

        TreeNode node2 = new TreePopulateData().populateTreeData();
        invertTreeRecursive(node2);
        System.out.println(" \n After recursive traversing ");
        TreeTraversing.levelOrderTraversing(node);
    }

    private static void invertTree(TreeNode root) {

        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.peek();
            TreeNode left =null, right = null;

            if (node.getLeft() != null) {
                left = node.getLeft();
                nodes.offer(left);
            }

            if (node.getRight() != null) {
                right = node.getRight();
                nodes.offer(right);
            }

            swapNodes(node, left, right);

            nodes.poll();
        }
    }

    private static void invertTreeRecursive(TreeNode node) {

        if (node == null)
            return;

        swapNodes(node, node.getLeft(), node. getRight());
        invertTreeRecursive(node.getLeft());
        invertTreeRecursive(node.getRight());
    }

    private static void swapNodes(TreeNode node, TreeNode left, TreeNode right) {
            TreeNode temp = left;//new TreeNode(left.getData(), left. getLeft(), left.getRight());
            node.setLeft(right);
            node.setRight(temp);
    }
}

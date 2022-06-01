package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.DelayQueue;

public class TreeTraversing {
    public static void main(String args[]) {
        TreePopulateData tp = new TreePopulateData();
        TreeNode node = tp.populateTreeData();
        System.out.println("\nPre order traversing : ");
        // Pre order traversing in tree
        preOrderTraversing(node);

        System.out.println("\nIn order traversing ");
        //In order traversing in tree
        inOrderTraversing(node);


        boolean bitsIsAvailable[] = new boolean[1000];
        System.out.println("\nPost order traversing ");
        //In order traversing in tree
        postOrderTraversing(node);

        System.out.println("\nLevel order traversing ");
        //In order traversing in tree
        levelOrderTraversing(node);

    }

    /**
     * InOrder traversing order of visiting nodes will be :
     * Left - Node - Right
     * @param node
     */
    public static void inOrderTraversing(TreeNode node) {
        if (node != null) {
            inOrderTraversing(node.getLeft());
            System.out.print(" "+node.getData());;
            inOrderTraversing(node.getRight());
        }
    }


    /**
     * In preorder traversing order of visiting will be :
     * Node - Left - Right
     * @param node
     */
    public static void preOrderTraversing(TreeNode node) {
        if(node != null) {
            System.out.print(" "+node.getData());
            preOrderTraversing(node.getLeft());
            preOrderTraversing(node.getRight());
        }
    }

    /**
     * In postOrderTraversing traversing order of visiting will be :
     *  Left - Right - Node
     * @param node
     */
    public static void postOrderTraversing(TreeNode node) {

        if (node != null) {
            postOrderTraversing(node.getLeft());
            postOrderTraversing(node.getRight());
            System.out.print(" "+node.getData());
        }
    }

    /**
     * In Level order traversing order of visiting nodes will be :
     * level wise. eg. 1 - 2 - 3 - 4 - 5 - 6 - 7
     * @param node
     */
    public static void levelOrderTraversing(TreeNode node) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode tn = queue.peek();
            System.out.print(" "+tn.getData());
            if (tn.getLeft() != null)
                queue.add(tn.getLeft());
            if (tn.getRight() != null)
                queue.add(tn.getRight());

            queue.poll();
        }
    }

}

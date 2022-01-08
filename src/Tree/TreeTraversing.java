package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

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


        System.out.println("\nPost order traversing ");
        //In order traversing in tree
        postOrderTraversing(node);

    }

    /**
     * InOrder traversing order of visiting nodes will be :
     * Left - Node - Right
     * @param node
     */
    private static void inOrderTraversing(TreeNode node) {
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

}

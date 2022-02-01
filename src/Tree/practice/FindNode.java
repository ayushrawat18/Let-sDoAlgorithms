package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class FindNode {

    public static void main(String args[]) {

        TreeNode node = new TreePopulateData().populateOneSidedTree();
        System.out.println(findNode(2, node));
    }

    private static boolean findNode(int element, TreeNode node) {

        if (node == null)
            return false;
        if (node.getData() == element)
            return true;

       return findNode(element, node.getLeft()) || findNode(element, node.getRight());

    }
}

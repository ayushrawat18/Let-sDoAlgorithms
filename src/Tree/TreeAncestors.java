package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class TreeAncestors {

    boolean ancestorFound = false;
    TreeNode ancestor = null;

    public static void main(String args[]) {


        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();

        new TreeAncestors().findAncestorsHelper(node, 8);

    }

    private void findAncestorsHelper(TreeNode node, int data) {
        new TreeAncestors().findAncestor(node, data);
        System.out.println(this.ancestor.getData());
    }

    private void findAncestor(TreeNode node, int data) {

        if (ancestorFound)
            return;

        if((node.getLeft() != null && node.getLeft().getData() == data) || (node.getRight()!= null && node.getRight().getData() == data)) {
            this.ancestor = node;
            ancestorFound = true;
            return;
        }

        if (node.getLeft() != null)
            findAncestor(node.getLeft(), data);

        if (node.getRight() != null)
            findAncestor(node.getRight(), data);


    }

}

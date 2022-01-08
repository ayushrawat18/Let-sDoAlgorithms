package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class TreeAddKToLeafNodes {

    public static void main (String args[]) {
        TreePopulateData tp = new TreePopulateData();
        TreeNode head = tp.populateTreeData();
        addNumberToLeafNodes(head, 100);
    }

    public static void addNumberToLeafNodes(TreeNode node, int k) {

        if (node != null) {
            if(node.getLeft() == null || node.getRight() == null) {
                node.setData(node.getData()+k);
            }
            addNumberToLeafNodes(node.getLeft(), k);
            addNumberToLeafNodes(node.getRight(), k);
            System.out.print(" "+node.getData());
        }
    }
}

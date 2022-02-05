package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import javax.swing.*;

public class FindAllAncestors {

    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        findAllAncestors(node, 8);
    }

    private static boolean findAllAncestors(TreeNode node, int element) {

        if (node == null)
            return false;

        if (node.getData() == element)
            return true;

        if (findAllAncestors(node.getLeft(), element) || findAllAncestors(node.getRight(), element)) {
            System.out.println(node.getData());
            return true;
        }

        return false;
    }
}

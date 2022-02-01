package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class HeightBlancedTree {

    static  boolean isHeightBal = false;
    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(isHeightBalanced(root));
        System.out.println(isHeightBal);

    }

    private static int isHeightBalanced(TreeNode root) {

        if (root == null)
            return 0;

        int left = isHeightBalanced(root.getLeft());
        int right = isHeightBalanced(root.getRight());

        if (Math.abs(left - right) <= 1)
            isHeightBal = true;
        else
            isHeightBal = false;

        return Math.max(left, right)+1;

    }
}

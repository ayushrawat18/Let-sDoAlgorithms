package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class DiameterOfTree {

    static int diameter = 0;

    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateOneSidedTree();
        findDiameterOfTree(root);
        System.out.println("diameter "+(diameter+1));
    }

    private static int findDiameterOfTree(TreeNode root) {

        if (root == null)
            return 0;
        int left = findDiameterOfTree(root.getLeft());
        int right = findDiameterOfTree(root.getRight());

        if (left + right > diameter)
            diameter = left + right;

        return Math.max(left, right) +1;
    }
}

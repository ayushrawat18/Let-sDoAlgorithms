package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class DiameterOfTree {

    static int diameter = 0;

    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(findDiameterOfTree(root));
        System.out.println("diameter "+diameter);
    }

    private static int findDiameterOfTree(TreeNode root) {
        int left, right;
        if (root == null)
            return 0;
        left = findDiameterOfTree(root.getLeft());
        right = findDiameterOfTree(root.getRight());

        if (left + right > diameter)
            diameter = left + right;

        return Math.max(left, right) +1;
    }
}

package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class MaxSumLeafToRoot {

    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        int ans = findMaxSumToLeafNode(node);
        System.out.println(ans);
    }

    private static int findMaxSumToLeafNode(TreeNode node) {

        if (node == null)
            return 0;

        int left = findMaxSumToLeafNode(node.getLeft());
        int right = findMaxSumToLeafNode(node.getRight());

        return Math.max(left, right)+node.getData();

    }
}

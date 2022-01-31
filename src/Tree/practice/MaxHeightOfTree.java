package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeightOfTree {
    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(findMaxHeight(node));

        System.out.println(findMaxHeightLevelOrder(node));
    }

    private static int findMaxHeight(TreeNode node) {
        if (node == null)
            return 0;
        int left = findMaxHeight(node.getLeft());
        int right = findMaxHeight(node.getRight());

        return Math.max(left, right)+1;
    }

    private static int findMaxHeightLevelOrder(TreeNode node) {
        int height = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode == null)
                height++;
             if (treeNode != null) {
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            } else if (!queue.isEmpty()) {
                queue.offer(null);
            }
        }

        return height;
    }
}

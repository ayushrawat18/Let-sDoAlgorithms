package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxHeightOfTree {
    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(findMaxHeight(node));
        TreeNode node2 = new TreePopulateData().populateTreeData();
        System.out.println(findMaxHeightLevelOrder(node2));
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
        queue.offer(node);
        queue.offer(null);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
             if (treeNode != null) {
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            } else {
                 if (queue.size() > 1 && queue.peek() == null) {
                     height++;
                     queue.remove();
                     queue.offer(null);
                 }
             }
        }

        return height;
    }
}

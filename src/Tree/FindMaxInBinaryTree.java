package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindMaxInBinaryTree {

    public static void main(String args[]) {
        TreePopulateDat tp = new TreePopulateData();
        TreeNode head = tp.populateTreeData();
        System.out.println("Max Element using post order traversal "+findMaxElementTree(head));

        System.out.println("Max Element using level order traversal "+findMaxElement(head));

    }

    private static int findMaxElementTree(TreeNode node) {
        int max = Integer.MIN_VALUE;
        if (node != null) {
            int leftElement = findMaxElementTree(node.getLeft());
            int rightElement = findMaxElementTree(node.getRight());
            max = Math.max(leftElement, rightElement);
            max = Math.max(max, node.getData());
        }
        return max;
    }

    private static int findMaxElement(TreeNode node) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        int maxElement = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            maxElement = Math.max(temp.getData(), maxElement);
            if (temp.getLeft() != null)
                queue.add(temp.getLeft());
            if(temp.getRight() != null)
                queue.add(temp.getRight());

            queue.remove();
        }
        return maxElement;
    }
}

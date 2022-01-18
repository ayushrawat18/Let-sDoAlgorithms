package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversing {

    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(zigZagTraversing(node));

    }

    /**
     * Time : O(n)
     * Space : O(n)
     * @param node
     * @return
     */
    private static ArrayList<Integer> zigZagTraversing(TreeNode node) {

        ArrayList<Integer> ansList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<TreeNode>  queue = new LinkedList<>();
        queue.offer(node);
        queue.offer(null);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();
            if (temp != null) {
                if (temp.getLeft() != null)
                    queue.offer(temp.getLeft());

                if (temp.getRight() != null)
                    queue.offer(temp.getRight());
            } else {
                while(!stack.isEmpty()){
                    ansList.add(stack.pop());
                }
                leftToRight = !leftToRight;
                if (!queue.isEmpty())
                    queue.offer(null);
            }

            if (temp != null) {
                if (leftToRight) {
                    ansList.add(temp.getData());
                } else {
                    stack.add(temp.getData());
                }
            }
        }

        return ansList;
    }
}

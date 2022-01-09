package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.Queue;


public class FindDepthOfTree {


    public static void main(String args[]) {
        TreeNode head = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(findDepth(head));

        System.out.println(findDepthIter(head));
    }

    private static int findDepthIter(TreeNode head) {

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(head);
        
        return 1;
    }

    private static int findDepth(TreeNode head) {

        if (head == null)
            return 0;
        int leftDepth = findDepth(head.getLeft());
        int rightDepth = findDepth(head.getRight());

        return Math.max(leftDepth, rightDepth)+1;
    }




}

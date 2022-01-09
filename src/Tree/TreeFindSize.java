package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeFindSize {

    public static void main(String args[]) {
        TreeNode head = new TreePopulateData().populateTreeData();
        TreeNode unblancedTreeHead = new TreePopulateData().populateUnBalancedTreeData();
       // System.out.println("The size of the tree is : "+findSize(head));
        //System.out.println("The size of the unbalanced tree is : "+findSize(unblancedTreeHead));


        System.out.println("The size of the unbalanced tree is found recursively : "+findSizeRecursively(unblancedTreeHead));
    }

    public static int findSize(TreeNode node) {

        int size = 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            if (temp.getLeft() != null) {
                queue.offer(temp.getLeft());
                size +=1;
            }
            if (temp.getRight() != null) {
                queue.offer(temp.getRight());
                size +=1;
            }

            queue.poll();
        }
        return size;
    }


    public static int findSizeRecursively(TreeNode head) {

        if (head == null)
            return 0;
        else {
            return 1 + findSizeRecursively(head.getLeft()) + findSizeRecursively(head.getRight());
        }
    }
}

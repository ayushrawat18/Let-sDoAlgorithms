package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.Queue;

public class SearchingElementInBinaryTree {

    public static void main(String args[]) {
        TreePopulateData tp = new TreePopulateData();
        TreeNode head = tp.populateTreeData();

        System.out.println("Level order traversing : Search Element : "+searchElement(head, 9));

        System.out.println("Recursive search : "+searchElementRecurrsion(head, 5));

    }


    /**
     * Finding an element in the tree
     * Time : O(n)
     * Space : O(n) : since making an Queue from tree nodes
     * @param node
     * @param num
     * @return
     */
    public static boolean searchElement(TreeNode node, int num) {
        boolean isElementFound = false;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            if(temp.getData() == num) {
                isElementFound = true;
                break;
            }
            if(temp.getLeft() != null)
                queue.offer(temp.getLeft());
            if (temp.getRight() != null)
                queue.offer(temp.getRight());

            queue.poll();
        }
        return isElementFound;
    }


    public static boolean searchElementRecurrsion(TreeNode node, int num) {

        // Base case
        if(node == null)
            return false;
        else if(node.getData() == num)
            return true;

        //recursive calls
        return searchElementRecurrsion(node.getLeft(), num) || searchElementRecurrsion(node.getRight(), num);

    }


}

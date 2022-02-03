package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Fix me : Returning always false
 */
@Deprecated
public class SubTree {

    public static void main(String args[]) {
        TreeNode parent = new TreePopulateData().populateTreeData();
        TreeNode child = new TreePopulateData().populateKTreeData();


        System.out.println(isSubTree(parent, child));
    }

    private static boolean isSubTree(TreeNode parent, TreeNode child) {

        Queue<TreeNode> node = new LinkedList<>();
        node.offer(parent);
        while (!node.isEmpty()) {
            TreeNode check = node.poll();
            if (isIdentical(check, child))
                return true;
            if (check.getLeft()!= null)
                node.add(check.getLeft());
            if (check.getRight()!=null)
                node.add(check.getRight());
        }

                return false;
    }

    public static boolean isIdentical(TreeNode root1, TreeNode root2)
    {

        if(root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null)
            return false;

        if (root1.getData() != root2.getData())
            return false;
        else
        return  isIdentical(root1.getLeft(), root2.getLeft()) &&
                    isIdentical(root1.getRight(), root2.getRight());
        }

    }


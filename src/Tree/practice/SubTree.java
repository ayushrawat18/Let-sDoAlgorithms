package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

/**
 * Fix me : Returning always false
 */
@Deprecated
public class SubTree {

    public static void main(String args[]) {
        TreeNode child = new TreePopulateData().populateKTreeData();
        TreeNode parent = new TreePopulateData().populateTreeData();

        System.out.println(isSubTree(parent, child));
    }

    private static boolean isSubTree(TreeNode parent, TreeNode child) {
        if (child == null)
            return true;

        if (parent == null)
            return false;

        if (isIdentical(parent, child))
            return true;

        return isSubTree(parent.getLeft(), child) || isSubTree(parent.getRight(), child);
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

        return  isIdentical(root1.getLeft(), root2.getLeft()) &&
                    isIdentical(root1.getRight(), root2.getRight());
        }

    }


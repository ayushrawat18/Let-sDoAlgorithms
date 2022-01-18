package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;


public class FindTreeAncestors {

    public static void main(String[] args) {
        TreeNode node = new TreePopulateData().populateTreeData();
       // findTreeAncestors(node, 7);

        System.out.println(findLCTreeAncestors(node, 3,4).getData());

    }

    private static boolean findTreeAncestors(TreeNode node, int data) {
        if (node == null)
            return false;
        if (node.getData() == data || findTreeAncestors(node.getLeft(), data) || findTreeAncestors(node.getRight(), data)) {
            System.out.println(node.getData());
            return true;
        }
        return false;

    }


    /*
       Tree structure of this kind will be populated
          1
        /  \
        2   3
       / \  / \
       4  5 6  7

     */
    private static TreeNode findLCTreeAncestors(TreeNode root, int data1, int data2) {

        if (root == null)
            return null;

        if (root.getData() == data1 || root.getData() == data2)
            return root;

        TreeNode left = findLCTreeAncestors(root.getLeft(), data1, data2);
        TreeNode right = findLCTreeAncestors(root.getRight(), data1, data2);

        if (left != null && right != null)
            return root;

        TreeNode lca = left !=null ? left : right;

        return lca;

    }

}

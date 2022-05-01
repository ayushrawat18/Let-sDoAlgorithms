package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


public class FindTreeAncestors {

    public static void main(String[] args) {
        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        //findTreeAncestors(node, 7);

        System.out.println(findLCTreeAncestors(node, 7,8).getData());

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
    private static TreeNode findLCTreeAncestors(TreeNode node, int node1, int node2) {

        if (node == null)
            return null;


        LinkedHashMap<Integer, Integer> r = new LinkedHashMap<>();
        if (node.getData() == node1 || node.getData() == node2)
            return node;

        TreeNode left = findLCTreeAncestors(node.getLeft(), node1, node2);
        TreeNode right = findLCTreeAncestors(node.getRight(), node1, node2);

        if (left != null && right !=null)
            return node;

        TreeNode lca = left != null ? left : right;

        return lca;
    }

}

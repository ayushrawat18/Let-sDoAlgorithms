package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class DistanceBetweenTwoNodes {


    /*
      Tree structure of this kind will be populated
         1
       /  \
       2   3
      / \  / \
      4  5 6  7

       Tree structure of this kind will be populated
          1
        /  \
        2    3
       / \  /  \
       4  5 6   7
          \     /
           9    8

    */
    public static void main(String args[]) {

        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        TreeNode lca = findLCA(node, 7, 9);
        int dis1 = findDistance(lca, 7, 0);
        int dis2 = findDistance(lca, 9, 0);
        System.out.println(dis1+dis2);
    }

    private static int findDistance(TreeNode node, int node1, int level) {
        if (node == null)
            return -1;
        if (node.getData() == node1)
            return level;

       int left =  findDistance(node.getLeft(), node1, level+1);
       if (left == -1)
           return findDistance(node.getRight(), node1, level+1);

        return left;
    }

    private static TreeNode findLCA(TreeNode node, int node1, int node2) {

        if (node == null)
            return null;

        if (node.getData() == node1 || node.getData() == node2)
            return node;

        TreeNode left = findLCA(node.getLeft(), node1, node2);
        TreeNode right = findLCA(node.getRight(), node1, node2);

        if (left != null && right !=null)
            return node;

       TreeNode lca = left != null ? left : right;

        return lca;
    }


}

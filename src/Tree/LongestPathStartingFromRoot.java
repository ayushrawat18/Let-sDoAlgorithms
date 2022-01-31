package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.HashSet;
import java.util.Set;

public class LongestPathStartingFromRoot {
    public static void main(String args[]) {

        TreeNode node = new TreePopulateData().populateUnBalancedTreeData();
        Set<Integer> nodes = new HashSet<>();
        int result = findLongestPath(node, nodes);
        System.out.println(result);
    }

    private static int findLongestPath(TreeNode node, Set<Integer> nodes) {
        if (node == null || nodes.contains(node.getData()))
            return nodes.size();

        nodes.add(node.getData());
        int left = findLongestPath(node.getLeft(), nodes);
        int right = findLongestPath(node.getRight(), nodes);
        nodes.remove(node.getData());

        return Math.max(left, right);

    }
}

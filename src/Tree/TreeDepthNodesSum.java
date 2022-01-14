package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class TreeDepthNodesSum {

    public static void main(String args[]) {
        TreeNode root = new TreePopulateData().populateTreeData();
        int sum = findNodesDepthSum(root);
        System.out.println("The sum of the nodes depth is  : "+ sum);


        TreeNode root2 = new TreePopulateData().populateUnBalancedTreeData();
        int sum2 = findNodesDepthSum(root2);
        System.out.println("The sum of the nodes depth is  : "+ sum2);

        int rSum = findNodesDepthSumRecursive(root, 0);
        int rSumUT = findNodesDepthSumRecursive(root2, 0);
        System.out.println("The sum of the nodes depth is  Recursively : "+ rSum);
        System.out.println("The sum of the nodes depth is  Recursively : "+ rSumUT);
    }

    public static int findNodesDepthSum(TreeNode root) {
        Queue<TreeNode> nodes = new ArrayDeque<>();
        Map<TreeNode, Integer> nodesDepthMap = new HashMap<>();
        nodes.add(root);
        int nodeDepth = 0;
        nodesDepthMap.put(root, nodeDepth);

        int nodesDepthSum = 0;

        while (!nodes.isEmpty()) {
            TreeNode temp = nodes.peek();
            nodeDepth = nodesDepthMap.get(temp) + 1;
            if (temp.getLeft() != null) {
                nodesDepthMap.put(temp.getLeft(), nodeDepth);
                nodes.offer(temp.getLeft());
            }

            if (temp.getRight() != null) {
                nodesDepthMap.put(temp.getRight(), nodeDepth);
                nodes.offer(temp.getRight());
            }
            nodesDepthSum = nodesDepthSum + nodesDepthMap.get(temp);
            nodes.poll();
        }

        return nodesDepthSum;
    }

    public static int findNodesDepthSumRecursive(TreeNode node, int depth){

        if (node == null)
            return 0;

        return depth + findNodesDepthSumRecursive(node.getLeft(), depth+1) + findNodesDepthSumRecursive(node.getRight(), depth +1);
    }

}

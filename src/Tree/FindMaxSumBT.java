package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.lang.reflect.Parameter;
import java.util.Map;

class Pair {
    int maxSumBranch;
    int maxSumNode;

    public Pair(int maxSumBranch, int maxSumNode) {
        this.maxSumBranch  = maxSumBranch;
        this.maxSumNode = maxSumNode;
    }
}

public class FindMaxSumBT {


    public static void main(String args[]) {

        TreeNode head = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(findMaxSumTree(head).maxSumNode);
    }

    private static Pair findMaxSumTree(TreeNode head) {

        if (head == null)
            return new Pair(0, 0);

        Pair leftSum = findMaxSumTree(head.getLeft());
        Pair rightSum = findMaxSumTree(head.getRight());

        int maxChildSumBranch = Math.max(leftSum.maxSumBranch, rightSum.maxSumBranch);
        int maxSumAsNode = Math.max(maxChildSumBranch + head.getData(), head.getData());
        int maxSumAsRoot = Math.max(leftSum.maxSumBranch + head.getData() + rightSum.maxSumBranch, maxSumAsNode);
        int maxPathSum = Math.max(leftSum.maxSumNode, Math.max(rightSum.maxSumNode, maxSumAsRoot));

        return new Pair(maxSumAsNode, maxPathSum);
    }
}

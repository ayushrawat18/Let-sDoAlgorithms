package Tree;

import java.util.*;

class FindBranchesSum {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }


    public static List<Integer> branchSums(BinaryTree root) {

        List<Integer> branchSumList = new ArrayList<Integer>();

        calculateSum(root, 0, branchSumList);
        return branchSumList;
    }

    public static void calculateSum(BinaryTree node, int runningSum, List<Integer> branchSumList) {

        if (node == null)
            return ;

        int sum = runningSum + node.value;
        if(node.left == null && node.right == null) {
            branchSumList.add(sum);
            return ;
        }

        calculateSum(node.left, sum,  branchSumList);
        calculateSum(node.right, sum,  branchSumList);


    }
}

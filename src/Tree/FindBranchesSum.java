package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.*;

class FindBranchesSum {

    public static void main(String args[]) {
        TreeNode head = new TreePopulateData().populateUnBalancedTreeData();
        List<Integer> ansSum = branchSums(head);
        System.out.println(" Sum is "+ansSum.toString());
    }



    public static List<Integer> branchSums(TreeNode root) {

        List<Integer> branchSumList = new ArrayList<Integer>();

        calculateSum(root, 0, branchSumList);
        return branchSumList;
    }

    public static void calculateSum(TreeNode node, int runningSum, List<Integer> branchSumList) {

        if (node == null)
            return;

        runningSum = runningSum + node.getData();
        if (node.getLeft() == null && node.getRight() == null) {
            branchSumList.add(runningSum);
            return;
        }

            calculateSum(node.getLeft(), runningSum, branchSumList);
            calculateSum(node.getRight(), runningSum, branchSumList);
        }

    }


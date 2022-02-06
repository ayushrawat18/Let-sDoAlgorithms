package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class SumTreeValidation {

    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateSumChildTreeData();
        System.out.println(isSumTree(root));
        System.out.println(isSumTree);


    }
    static  boolean isSumTree = true;

    private static int isSumTree(TreeNode root) {

        if (root == null)
            return 0;

        int left = isSumTree(root.getLeft());
        int right = isSumTree(root.getRight());

        if (left + right != root.getData() && left !=0 && right!=0)
            isSumTree = false;


        return isSumTree ? left +right +root.getData() : -1;

    }

}

package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

@Deprecated
public class ChildrenSumParent {
    static boolean isParentSumChilds = true;

    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateSumChildTreeData();

        isParentSumChilds(root);
        System.out.println(isParentSumChilds);

    }

    private static int isParentSumChilds(TreeNode root) {
        if (root == null)
            return 0;

        int left = isParentSumChilds(root.getLeft());
        int right = isParentSumChilds(root.getRight());

        if (left + right != root.getData() && left !=0 && right!=0)
            isParentSumChilds = false;

        return isParentSumChilds ? left + right + root.getData() : -1;

    }
}

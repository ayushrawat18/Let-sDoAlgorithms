package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

public class TreeMirror {

    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateMirrorTreeData();
        System.out.println(isIdentical(node.getLeft(), node.getRight()));
    }



    public static boolean isIdentical(TreeNode root1, TreeNode root2)
    {

        if(root1 == null && root2 == null) {
            return true;
        }  else if(root1 != null && root2 !=null && root1.getData() == root2.getData()) {
            return isIdentical(root1.getLeft(), root2.getLeft()) &&
                    isIdentical(root1.getRight(), root2.getRight());
            }
        return false;

    }
}

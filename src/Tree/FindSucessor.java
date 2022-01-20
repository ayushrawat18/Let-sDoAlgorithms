package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayList;
import java.util.List;

public class FindSucessor {

    public static void main(String args[]) {
        TreeNode root = new TreePopulateData().populateUnBalancedTreeData();
        int data = 7;

       TreeNode suc = findSucessorOfNode(root, data);

    }

    private static TreeNode findSucessorOfNode(TreeNode root, int data) {

        List<TreeNode> nodes = new ArrayList<>();
        getInOrderNodes(root, nodes);
        int currentNodeIdx = -1;

        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() != data)
                continue;

            if (i == nodes.size()-1)
                   return null;
            return nodes.get(i+1);
        }

        return null;

    }

    /**
     * Getting the in order
     * L _ N _ R
     * @param root
     * @param nodes
     */

    private static void getInOrderNodes(TreeNode root, List<TreeNode> nodes) {
        if (root == null)
            return;

        getInOrderNodes(root.getLeft(), nodes);
        nodes.add(root);
        getInOrderNodes(root.getRight(), nodes);
    }
}

package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class FindNodesAtKDist {


    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateUnBalancedTreeData();
        findElementsAtKDistance(root, 6, 2);
    }

    private static void findElementsAtKDistance(TreeNode root, int nodeV, int distance) {
        List<Integer> ans = new ArrayList<>();
      TreeNode node =  findNode(root, nodeV);

        findNodesAtDistanceK(node,0, distance, ans);
        System.out.println(ans);
    }

    /**
     * we can also do this using BFS : track the levels add all the elements of the level distance
     * return
     * @param node
     * @param currentDis
     * @param distance
     * @param ans
     */
    private static void findNodesAtDistanceK(TreeNode node, int currentDis, int distance, List<Integer> ans) {

        Map<Integer, Integer> co = new HashMap<>();
        co.values();
        if (node == null)
            return;
        if (currentDis == distance) {
            ans.add(node.getData());
            return;
        }
        findNodesAtDistanceK(node.getLeft(), currentDis+1, distance, ans);
        findNodesAtDistanceK(node.getRight(), currentDis+1, distance, ans);
    }

    private static TreeNode findNode(TreeNode root, int nodeV) {

        if (root == null)
            return null;
        if (root.getData() == nodeV)
            return  root;
        else {
           TreeNode node =  findNode(root.getLeft(), nodeV);
           if (node == null)
               node =  findNode(root.getRight(), nodeV);
           return  node;
        }
    }
}

package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * This class is in progress
 */
@Deprecated
public class FindNodesDistance {

   static class Pair <U, V>{
        U first;
        V second;

        private Pair(U value, V distance) {
            this.first = value;
            this.second = distance;
        }
    }

    public static void main(String args[]) {
        TreeNode root = new TreePopulateData().populateUnBalancedTreeData();
        findNodesAtKDistance(root, 3, 2);
    }

    private static void findNodesAtKDistance(TreeNode root, int nodeValue, int distance) {
        Map<Integer, TreeNode> parents = new HashMap<>();
        findParents(root, parents, null);
        TreeNode nodeObj = locateNode(root, nodeValue, parents);
        List<Integer> result = findElementsAtKDistanceFromNode(nodeObj, parents, distance);
        System.out.println(result);
    }

    private static List<Integer> findElementsAtKDistanceFromNode(TreeNode nodeObj, Map<Integer, TreeNode> parents, int distance) {
        List<Integer> result = new ArrayList<>();
        Pair<TreeNode, Integer> pairObj = new Pair<TreeNode, Integer>(nodeObj, 0);
        Set<Integer> visited = new HashSet<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        queue.offer(pairObj);


        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> data = queue.poll();
            visited.add(data.first.getData());
            if (data.second == distance)
                result.add(data.first.getData());

            if (data.first.getLeft() != null && !visited.contains(data.first.getLeft().getData())) {
                queue.add(new Pair<>(data.first.getLeft(), data.second +1));
            }
            if (data.first.getRight() != null && !visited.contains(data.first.getRight().getData())) {
                queue.add(new Pair<>(data.first.getRight(), data.second+1));
            }

            if (parents.get(data.first.getData()) != null && !visited.contains(parents.get(data.first.getData()).getData()))
                queue.add(new Pair<>(parents.get(data.first.getData()), data.second+1));
        }

        return result;
    }

    private static TreeNode locateNode(TreeNode root, int nodeValue, Map<Integer, TreeNode> parents) {
        if (root.getData() == nodeValue)
            return root;
        if (root.getLeft() != null && root.getLeft().getData() == nodeValue)
            root.getLeft();

        return root.getRight();
    }

    private static void findParents(TreeNode root, Map<Integer, TreeNode> parents, TreeNode parent) {
        if (root != null) {
            parents.put(root.getData(), parent);
            findParents(root.getLeft(), parents, root);
            findParents(root.getRight(), parents, root);
        }
    }

}

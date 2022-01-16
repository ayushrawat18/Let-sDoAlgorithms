package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * not working : Work in progress
 * Idea here is finding all the nodes distance from the root node
 * and calculating the relative distance of all the nodes at ~ height +- distance
 */
public class FindElementsAtKDistance {

    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateTreeData();
        findElementsAtKDistance(root, 3, 1);
    }

    private static List<Integer> findElementsAtKDistance(TreeNode root, int node, int distance) {

        HashMap<Integer, Integer> leftHeightMap = prepareHeightMap(root.getLeft(), 1);
        leftHeightMap.put(root.getData(), 0);
        HashMap<Integer, Integer> rightHeightMap = prepareHeightMap(root.getRight(), 1);
        rightHeightMap.put(root.getData(), 0);

        int nodesAtKDistanceLeftMap = -1;
        int nodesAtDistanceRightMap = -1;
        if (leftHeightMap.containsKey(node)) {
            nodesAtKDistanceLeftMap = leftHeightMap.get(node) + distance;
            nodesAtDistanceRightMap = distance - leftHeightMap.get(node);
        }
        else {
            nodesAtDistanceRightMap = rightHeightMap.get(node) + distance;
            nodesAtKDistanceLeftMap = distance - leftHeightMap.get(node);
        }

        List<Integer> distanceNode = new ArrayList<>();
        distanceNode.addAll(getAllKeysByValues(rightHeightMap, nodesAtDistanceRightMap));
        distanceNode.addAll(getAllKeysByValues(leftHeightMap, nodesAtKDistanceLeftMap));

        return distanceNode;

    }

    private static List<Integer> getAllKeysByValues(Map<Integer, Integer> map, int nodesAtDistanceRightMap) {

        List<Integer> elements = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == nodesAtDistanceRightMap)
                elements.add(key);
        }
        return elements;
    }

    private static HashMap<Integer, Integer> prepareHeightMap(TreeNode left, int height) {

        HashMap<Integer, Integer> heightMap = new HashMap<>();
        if (left == null)
            return heightMap;

        heightMap.put(left.getData(), height);

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(left);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();

            height = height + 1;
            if (temp.getLeft() != null) {
                heightMap.put(temp.getLeft().getData(), height);
                queue.offer(temp.getLeft());
            }

            if (temp.getRight() != null) {
                heightMap.put(temp.getRight().getData(), height);
                queue.offer(temp.getRight());
            }
            queue.poll();
        }

        return heightMap;
    }


}

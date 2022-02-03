package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VerticalTraversal {


    /*
       Tree structure of this kind will be populated
          1
        /  \
        2   3
       / \  / \
       4  5 6  7

     */
    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateTreeData();
        Map<Integer, List<Integer>> verticalTraversal = new LinkedHashMap<>();
        verticalTraversal(node, verticalTraversal, 0);

        System.out.println(verticalTraversal.values());
    }

    private static void verticalTraversal(TreeNode node, Map<Integer, List<Integer>> verticalTraversal, int identifier) {

        if (node == null)
            return;

        if (node != null) {
            verticalTraversal(node.getLeft(), verticalTraversal, identifier-1);

            if (verticalTraversal.containsKey(identifier)) {
                List<Integer> existingNums = verticalTraversal.get(identifier);
                existingNums.add(node.getData());
                verticalTraversal.put(identifier, existingNums);
            } else
                verticalTraversal.put(identifier, new ArrayList<>(Arrays.asList(node.getData())));

            verticalTraversal(node.getRight(), verticalTraversal, identifier+1);
        }
    }
}

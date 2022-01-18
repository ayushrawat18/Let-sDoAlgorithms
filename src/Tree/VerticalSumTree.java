package Tree;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VerticalSumTree {

    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateTreeData();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        findVerticalSum(node, map, 0);

       for (Integer key : map.keySet()) {
           System.out.print ("  "+map.get(key));
       }
        
    }

    private static void findVerticalSum(TreeNode node, Map<Integer, Integer> map, int height) {

        if (node == null)
            return;
        findVerticalSum(node.getLeft(), map, height-1);
        map.put(height, map.getOrDefault(height, 0)+node.getData());
        findVerticalSum(node.getRight(), map, height+1);


    }
}

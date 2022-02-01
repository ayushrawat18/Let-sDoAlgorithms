package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInEachLevel {

    public static void main(String args[]) {

        TreeNode root = new TreePopulateData().populateUnBalancedTreeData();
        System.out.println(findLargestValuesLevels(root));


    }

    private static List<Integer> findLargestValuesLevels(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        int largest = root.getData();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                ans.add(largest);
                largest = 0;
                if (!queue.isEmpty())
                    queue.offer(null);
            } else {
                if (node.getData() > largest)
                    largest = node.getData();

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null)
                    queue.add(node.getRight());
            }

        }

        return ans;

    }
}

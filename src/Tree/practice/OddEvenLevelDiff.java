package Tree.practice;

import Tree.commons.TreeNode;
import Tree.commons.TreePopulateData;

import java.util.LinkedList;
import java.util.Queue;

public class OddEvenLevelDiff {
    public static void main(String args[]) {
        TreeNode node = new TreePopulateData().populateTreeData();
        System.out.println(oddEvenLevelDiff(node));
    }

    private static int oddEvenLevelDiff(TreeNode node) {
        int level = 0;
        int oddLevelsSum = 0;
        int evenLevelsSum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (currNode == null) {
                level += 1;
                if (!queue.isEmpty())
                    queue.offer(null);
                continue;
            }

            if (currNode.getLeft() != null)
                queue.add(currNode.getLeft());
            if (currNode.getRight() != null)
                queue.add(currNode.getRight());

            if (level%2 == 0)
                evenLevelsSum += currNode.getData();
            else
                oddLevelsSum += currNode.getData();
        }

        return oddLevelsSum - evenLevelsSum;
    }
}

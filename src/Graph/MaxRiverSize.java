package Graph;

import sun.tools.jstack.JStack;

import javax.tools.Diagnostic;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Amazing question
 *
 * Input :
 * [
 *   [1, 0, 0, 1, 0],
 *   [1, 0, 1, 0, 0],
 *   [0, 0, 1, 0, 1],
 *   [1, 0, 1, 0, 1],
 *   [1, 0, 1, 1, 0]
 * ]
 *
 * Output : [2, 2, 5, 1, 2] - size of all the rivers
 */
public class MaxRiverSize {

    public static void main(String args[]) {
        int arr[][] = {{1,0,0,1,0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
        };

        List<Integer> res  = findMaxRiverSize(arr);
        System.out.println(res);
    }

    private static List<Integer> findMaxRiverSize(int[][] arr) {

        boolean isVisitedArr [][] = new boolean[arr.length][arr[0].length];
        List<Integer> result = new ArrayList<>();

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == 0 || isVisitedArr[row][col]) {
                    isVisitedArr[row][col] = true;
                    continue;
                }

               traverseNode(row, col, arr, isVisitedArr, result);

            }
        }
        return result;
    }

    private static void traverseNode(int row, int col, int[][] arr, boolean[][] isVisitedArr, List<Integer> result) {
        int currentRiversize = 0;
        Stack<Integer[]> nodesToExplore = new Stack<>();
        nodesToExplore.add(new Integer[]{row, col});
        while (!nodesToExplore.isEmpty()) {
            Integer node[] = nodesToExplore.pop();
            row = node[0];
            col = node[1];
            if (arr[row][col] == 0 || isVisitedArr[row][col]) {
                isVisitedArr[row][col] = true;
                continue;
            }

            currentRiversize ++;
            isVisitedArr[row][col] = true;
            List<Integer[]> unvisitedNode = getNeighboringNodesUnvisited(row, col, arr, isVisitedArr);
            for (Integer[] element : unvisitedNode) {
                nodesToExplore.add(element);
            }
        }

        if (currentRiversize > 0)
            result.add(currentRiversize);
    }

    private static List<Integer[]> getNeighboringNodesUnvisited(int row, int col, int[][] arr, boolean[][] isVisitedArr) {

        List<Integer[]> unvisitedNode = new ArrayList<>();

        if (row > 0 && !isVisitedArr[row-1][col])
            unvisitedNode.add(new Integer[]{row-1, col});
         if (row < arr.length-1 && !isVisitedArr[row+1][col])
            unvisitedNode.add(new Integer[]{row+1, col});
         if (col > 0 && !isVisitedArr[row][col-1])
             unvisitedNode.add(new Integer[]{row, col-1});
         if (col < arr[0].length-1 && !isVisitedArr[row][col+1])
             unvisitedNode.add(new Integer[]{row, col+1});

         return unvisitedNode;
    }
}

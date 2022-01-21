package Graph.Traversing;

import Graph.commons.AdjMatrix.Graph;

import java.util.Stack;

public class GraphTraversingDFS extends Graph {

    public static void main(String args[]) {

       GraphTraversingDFS gr =  new GraphTraversingDFS();
       gr.createGraphUsingAdjMatrix(); // Graph will be ready to consume
        gr.dfs();

    }

    /**
     * DFS : Depth first search
     * Get one adjacent element at a time put it in stack
     * backtrack to find all the nodes
     * once all the elements of stack is empty traversing is completed
     */
    public void dfs() {
        Stack<Integer> stack = new Stack<>();
        vertexList[0].isVisted = true; //starting dfs from the first node
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            /**
             * You will reach out to an single
             * adj vertex + Unvisited
             *if there are multiple any single one is fine
             */
            int adjVertex = getAdjUnvisitedVertex(stack.peek());
            if (adjVertex == -1)
                stack.pop();
            else {
                vertexList[adjVertex].isVisted = true;
                displayVertex(adjVertex);
                stack.push(adjVertex);
            }
        }

        for (int j=0; j<vertexCount; j++) {
            vertexList[j].isVisted = false;
        }



    }

    private int getAdjUnvisitedVertex(int vertex) {
        for (int j = 0; j < vertexCount; j++) {
            if (adjMatrix[vertex][j] == 1 && vertexList[j].isVisted == false)
                return j;

        }
        return -1;
    }
}

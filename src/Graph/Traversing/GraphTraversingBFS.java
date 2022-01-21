package Graph.Traversing;

import Graph.commons.AdjMatrix.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversingBFS extends Graph {

    public static void main(String args[]) {
        GraphTraversingBFS gr = new GraphTraversingBFS();
        gr.createGraphUsingAdjMatrix(); //Preparing graph for traversing
        gr.bfs();
    }

    /**
     * BFS : Breath first search
     * Amazing algorithm traverse all the adj elements first and than move to next adj elements 
     */
    public void bfs() {
        Queue<Integer>  queue = new LinkedList<>();
        queue.offer(0);
        vertexList[0].isVisted = true;
        this.displayVertex(0);

        while (!queue.isEmpty()) {
            int vertex;
            int element = queue.poll();
            while ((vertex = getAdjUnvisitedVertex(element)) != -1) {
                vertexList[vertex].isVisted = true;
                this.displayVertex(vertex);
                queue.offer(vertex);
            }
        }
    }

    private int getAdjUnvisitedVertex(int element) {
        for (int i = 0; i < vertexCount; i++) {
            if (!vertexList[i].isVisted && adjMatrix[element][i] == 1)
                return i;
        }
        return -1;
    }

}

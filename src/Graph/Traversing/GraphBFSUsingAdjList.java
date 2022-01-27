package Graph.Traversing;

import Graph.commons.AdjList.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSUsingAdjList extends Graph {

    public static void main(String args[]) {
        GraphBFSUsingAdjList gr = new GraphBFSUsingAdjList();
        gr.createGraphUsingAdjList(); //Preparing graph for traversing Its using Adj Matrix
        gr.bfs();
    }

    /**
     * In BFS we do the breath first search
     * i.e we first get the first adj node of the node from where we start the BFS
     * We make use of Queue, get all the nodes adj
     */
    private void bfs() {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        vertexList.get(0).isVisted=true;
        this.displayVertex(0);

        while (!queue.isEmpty()) {
            int vertex;
            int element = queue.poll();
            while ((vertex = getAdjElement(element)) != -1) {
                vertexList.get(vertex).isVisted=true;
                this.displayVertex(vertex);
                queue.offer(vertex);
            }
        }

    }

    private int getAdjElement(int element) {
        for (int i = 0; i < edges.get(element).size(); i++) {
            if (vertexList.get(edges.get(element).get(i)).isVisted == false)
                return edges.get(element).get(i);
        }
        return -1;
    }
}

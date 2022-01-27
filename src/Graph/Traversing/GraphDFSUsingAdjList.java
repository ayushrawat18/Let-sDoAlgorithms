package Graph.Traversing;


import Graph.commons.AdjList.Graph;

import java.util.Stack;

public class GraphDFSUsingAdjList extends Graph {

    public static void main(String args[]) {
        GraphDFSUsingAdjList gr = new GraphDFSUsingAdjList();
        gr.createGraphUsingAdjList();
        gr.dfs();
    }

    private void dfs() {
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        vertexList.get(0).isVisted=true;
        this.displayVertex(0);
        while (!stack.isEmpty()) {
            int adjVertex = getAdjVertex(stack.peek());
            if (adjVertex == -1)
                stack.pop();
            else {
                stack.add(adjVertex);
                vertexList.get(adjVertex).isVisted=true;
                this.displayVertex(adjVertex);
            }
        }
    }

    private int getAdjVertex(int element) {
        for (int i = 0; i < edges.get(element).size(); i++) {
            if (vertexList.get(edges.get(element).get(i)).isVisted == false)
                return edges.get(element).get(i);
        }
        return -1;
    }

}

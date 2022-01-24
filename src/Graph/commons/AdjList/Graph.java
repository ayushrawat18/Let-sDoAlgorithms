package Graph.commons.AdjList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    public List<Vertex> vertexList; // nodes info
    public List<List<Integer>> edges;

    public Graph() {
        vertexList = new ArrayList<>();
        edges = new LinkedList<>();
    }

    public void addVertex(char data) {
            vertexList.add(new Vertex(data));
    }

    public void addEdges(Integer edge[]) {
        List<Integer> edgesOfVertex = Arrays.asList(edge);
        edges.add(edgesOfVertex);
    }


    public void displayVertex(int vIdx) {
        System.out.print("->"+vertexList.get(vIdx).label);
    }

    public void createGraphUsingAdjList() {
        addVertex('a');//0  -
        addVertex('b');//1
        addVertex('c');//2
        addVertex('d');//3
        addVertex('e');//4
        addVertex('f');//5

        addEdges(new Integer[]{1,4}); // edges of a
        addEdges(new Integer[]{0,2}); // edges of b
        addEdges(new Integer[]{1,5,3}); //edges of c
        addEdges(new Integer[]{2,4}); //edges of d
        addEdges(new Integer[]{0,5}); //edges of e
        addEdges(new Integer[]{2,4}); //edges of e

    }


}

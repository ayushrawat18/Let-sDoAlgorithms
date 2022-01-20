package Graph.commons;

import java.util.Stack;

public class Graph {

    private final int maxVertices = 20;
    private Vertex vertexList[];
    private int adjMatrix[][];
    private int vertexCount;
    private Stack stack;

    public Graph(){
        vertexCount =0;
        vertexList = new Vertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        for (int i = 0; i < maxVertices; i++) {
            for (int j = 0; j < maxVertices; j++) {
                adjMatrix[i][j] = 0;
            }
        }
        stack = new Stack();
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    /**
     * Edge between two vertices
     * @param start
     * @param end
     */
    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void displayVertex(int vIdx) {
        System.out.println(vertexList[vIdx].label);
    }

    /**
     * Create a graph of this structure using adj matrix
     *
     * a ----- e \
     * |		|  \
     * |		|   \
     * |		f	 d
     * |		|  /
     * |		| /
     * b ----- c/
     *
     * PS : Did my best to represent the graph :)
     */
    public void createGraphUsingAdjMatrix() {
        this.addVertex('a');
        this.addVertex('b');
        this.addVertex('c');
        this.addVertex('d');
        this.addVertex('e');
        this.addVertex('f');

        this.addEdge(0, 1);
        this.addEdge(0, 4);
        this.addEdge(1, 2);
        this.addEdge(2, 3);
        this.addEdge(2, 5);
        this.addEdge(4, 3);
        this.addEdge(4, 5);
    }


}

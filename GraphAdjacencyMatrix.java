public class GraphAdjacencyMatrix {
    private boolean[][] adjacencyMatrix;
    private int numVertices;
    public GraphAdjacencyMatrix(int numVertices)
    {
        this.numVertices = numVertices;
        adjacencyMatrix
            = new boolean[numVertices][numVertices];
    }
    public void addEdge(int i, int j)
    {
        adjacencyMatrix[i][j] = true;
        adjacencyMatrix[j][i] = true;
    }
    public void removeEdge(int i, int j)
    {
        adjacencyMatrix[i][j] = false;
        adjacencyMatrix[j][i] = false;
    }
    public boolean hasEdge(int i, int j)
    {
        return adjacencyMatrix[i][j];
    }
    public void printGraph()
    {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(
                    adjacencyMatrix[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);
        System.out.println(
            "Graph Representation (Adjacency Matrix):");
        graph.printGraph();
        System.out.println(
            "Checking if there's an edge between vertices 0 and 1: "
            + graph.hasEdge(0, 1));
        System.out.println(
            "Checking if there's an edge between vertices 0 and 3: "
            + graph.hasEdge(0, 3));
        graph.removeEdge(1, 2);
        System.out.println(
            "After removing edge between vertices 1 and 2:");
        graph.printGraph();
    }
}
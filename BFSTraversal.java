import java.util.*;
public class BFSTraversal {
    private Map<String, List<String>> graph;
    public BFSTraversal() {
        graph = new HashMap<>();
    }
    public void addVertex(String vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }
    public void addEdge(String source, String destination) {
        graph.get(source).add(destination);
    }
    public void bfs(String startVertex) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>(); 
        visited.add(startVertex);
        queue.add(startVertex);
        System.out.println("BFS Traversal starting from " + startVertex + ":");
        while (!queue.isEmpty()) {
            String currentVertex = queue.poll(); 
            System.out.print(currentVertex + " "); 
            for (String neighbor : graph.getOrDefault(currentVertex, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BFSTraversal bfsGraph = new BFSTraversal();
        bfsGraph.addVertex("A");
        bfsGraph.addVertex("B");
        bfsGraph.addVertex("C");
        bfsGraph.addVertex("D");
        bfsGraph.addVertex("E");
        bfsGraph.addVertex("F");
        bfsGraph.addEdge("A", "B");
        bfsGraph.addEdge("A", "C");
        bfsGraph.addEdge("B", "D");
        bfsGraph.addEdge("B", "E");
        bfsGraph.addEdge("C", "F");
        bfsGraph.bfs("A");
    }
}
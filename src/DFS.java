public class DFS {
    public static void main(String[] args) {
        //A: C B D
        //B: A C E G
        //C: A B D
        //D: C A
        //E: G F B
        //F: G E
        //G: F B
        Graph graph = new Graph(7);
        graph.addEdge(0, 2); // A-C
        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 3); // A-D
        graph.addEdge(1, 2); // B-C
        graph.addEdge(1, 4); // B-E
        graph.addEdge(1, 6); // B-G
        graph.addEdge(2, 3); // C-D
        graph.addEdge(4, 6); // E-G
        graph.addEdge(4, 5); // E-F
        graph.addEdge(5, 6); // F-G
        System.out.println("DFS Traversal:");
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        dfs(graph, 0, new boolean[graph.getVertices()], vertices);
    }

    private static void dfs(Graph graph, int vertex, boolean[] visited, char[] vertices) {
        visited[vertex] = true;
        System.out.print(vertices[vertex] + " ");
        for (Edge edge : graph.getAdjacencyList(vertex)) {
            if (!visited[edge.destination]) {
                dfs(graph, edge.destination, visited, vertices);
            }
        }
    }

}
import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Edge> [] adjacencylist;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination) {
        Edge edge = new Edge(source, destination);
        adjacencylist[source].add(edge);
        edge = new Edge(destination, source);
        adjacencylist[destination].add(edge);
    }
    public void addEdgeWithWeight(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].add(edge);
        edge = new Edge(destination, source, weight);
        adjacencylist[destination].add(edge);
    }

    public LinkedList<Edge> getAdjacencyList(int vertex) {
        return adjacencylist[vertex];
    }

    public int getVertices() {
        return vertices;
    }
}

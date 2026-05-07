public class Dijkstra {
    public static void main(String[] args) {
        //1. Edinburgh
        //2. Stirling
        //3. Perth
        //4. Dundee
        //5. Glasgow
        //
        //Edges:
        //1. Edinburgh–Stirling = 50
        //2. Edinburgh-Glasgow = 70
        //3. Edinburgh–Perth = 100
        //4. Stirling-Glasgow = 50
        //5. Stirling–Perth = 40
        //6. Perth–Dundee = 60
        Graph graph = new Graph(5);
        graph.addEdgeWithWeight(0, 1, 50);// Edinburgh-Stirling
        graph.addEdgeWithWeight(0, 4, 70);// Edinburgh-Glasgow
        graph.addEdgeWithWeight(0, 2, 100);// Edinburgh-Perth
        graph.addEdgeWithWeight(1, 4, 50);// Stirling-Glasgow
        graph.addEdgeWithWeight(1, 2, 40);// Stirling-Perth
        graph.addEdgeWithWeight(2, 3, 60);// Perth-Dundee
        System.out.println("Dijkstra's Shortest Path:");
        String[] vertices = {"Edinburgh", "Stirling", "Perth", "Dundee", "Glasgow"};
        dijkstra(graph, 0, 3, vertices);
    }

    private static void dijkstra(Graph graph, int startVertex, int endVertex, String[] vertices) {
        int[] distances = new int[graph.getVertices()];
        boolean[] visited = new boolean[graph.getVertices()];
        for (int i = 0; i < graph.getVertices(); i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        distances[startVertex] = 0;
        for (int i = 0; i < graph.getVertices() - 1; i++) {
            int minDistanceVertex = getMinDistanceVertex(distances, visited);
            visited[minDistanceVertex] = true;
            for (Edge edge : graph.getAdjacencyList(minDistanceVertex)) {
                if (!visited[edge.destination] && distances[minDistanceVertex] != Integer.MAX_VALUE
                        && distances[minDistanceVertex] + edge.weight < distances[edge.destination]) {
                    distances[edge.destination] = distances[minDistanceVertex] + edge.weight;
                }
            }
        }
        System.out.println("Shortest path from " + vertices[startVertex] + " to " + vertices[endVertex] + " is: " + distances[endVertex]);
    }

    private static int getMinDistanceVertex(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }
}

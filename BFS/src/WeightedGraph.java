import java.util.HashMap;

public class WeightedGraph<V> {
    private map<V, List<E<V>>>, adjacencyList;

    public WeightedGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(V vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(V source, V destination, int weight) {
        validateVertex(source);
        validateVertex(destination);

        E<V> edge = new E<>(source, destination, weight);
        adjacencyList.get(source).add(edge);
    }

    private void validateVertex(V vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            throw new IllegalArgumentException("Vertex " + vertex + " is not in the graph");
        }
    }

    public List<E<V>> getAdjacentEdges(V vertex) {
        validateVertex(vertex);
        return adjacencyList.get(vertex);
    }

    public Set<V> getVertices() {
        return adjacencyList.keySet();
    }
}

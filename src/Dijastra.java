import java.util.Arrays;

 class Dijkstra {

    static final int V = 3; // Number of vertices

    int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

     void dijkstra(int[][] graph, int src) {
         int[] dist = new int[V];
         int[] parent = new int[V];
         parent[src] = -1;
         boolean[] visited = new boolean[V];

         Arrays.fill(dist, Integer.MAX_VALUE);
         dist[src] = 0;

         for (int i = 0; i < V; i++)
             visited[i] = false;

         for (int count = 0; count < V - 1; count++) {
             // Get the vertex with the minimum distance
             int u = minDistance(dist, visited);
             visited[u] = true;

             // Relax the edges
             for (int v = 0; v < V; v++) {
                 // Check if there is an edge and if we can relax it
                 if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE) {
                     int edgeWeight = graph[u][v];
                     // Check if the edge weight is negative and apply relaxation differently
                     if (edgeWeight < 0) {
                         int x = dist[u] + edgeWeight;
                         if (x < dist[v]) {
                             dist[v] = x;
                             parent[v] = u;
                         }
                     } else {
                         int newDist = dist[u] + edgeWeight;
                         if (newDist < dist[v]) {
                             dist[v] = newDist;
                             parent[v] = u;
                         }
                     }
                 }
             }
         }

        // Print the result
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]+" "+parent[i]);
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0,4,4},
                {4,0,-5},
                {2,-5,0}
        };

        Dijkstra d = new Dijkstra();
        d.dijkstra(graph, 0); // Source is vertex 0
    }
}

public class DFSMatrix {

    static void dfs(int[][] graph, boolean[] visited, int node) {
        visited[node] = true;
        System.out.print(node + " ");

        // Traverse all adjacent nodes
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0, 1, 1, 0,0},
                {1, 0, 1, 1,0},
                {1, 1, 0, 0,0},
                {0, 1, 0, 0,0},
                {0, 0, 0, 0,0}
        };

        boolean[] visited = new boolean[graph.length];

        // Start DFS from node 0
        dfs(graph, visited, 0);

        for(int i =0;i< visited.length;i++){

            if(visited[i]==false)
            {
                dfs(graph,visited,i);
            }
        }

    }


}
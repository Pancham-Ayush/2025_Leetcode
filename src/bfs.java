public class bfs {
    void method(int arr[][],int src){
        int n=arr.length;
        int visted[]=new int[n];
        visted[src]=1;
        for(int i=0;i<n;i++){
            if(visted[i]==0){
                bfs(visted,arr,i);
            }
        }

    }
    void bfs(int visited[],int arr[][],int node){
        visited[node]=1;
        for (int i=0;i<arr.length;i++){
            if(visited[i]==0 && arr[node][i]==1){
                bfs(visited,arr,i);
            }
        }
    }
}

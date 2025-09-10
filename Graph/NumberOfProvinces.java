// by adjacency list 
import java.util.ArrayList;
import java.util.Scanner;

// public class NumberOfProvinces {
//     public static class Edge{
//         int src;
//         int dest;
//         Edge(int src , int dest){
//             this.src = src;
//             this.dest = dest;
//         }
//     }
//     public static void createGraph(ArrayList<Edge> graph[],int edges, Scanner sc){
//         for(int i = 0 ;i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         for(int i = 0; i<edges; i++){
//             System.out.print("enter the src: ");
//             int src = sc.nextInt();
//             System.out.print("enter the dest: ");
//             int dest = sc.nextInt();
//             graph[src].add(new Edge(src, dest));
//             graph[dest].add(new Edge(dest, src));
//         }

//     }
//     public static void dfs(ArrayList<Edge> graph[], int curr , boolean visit[]){
//         visit[curr] = true;
//         for(int i = 0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             if(visit[e.dest] == false){
//                 dfs(graph, e.dest, visit);
//             }
//         }
//     }
//     public static int numberOfProvinces(ArrayList<Edge> graph[],int V){
//         int count = 0;
//         boolean visit[] = new boolean[V];
//         for(int i = 0 ; i<V; i++){
//             if(visit[i] == false){
//                 dfs(graph, i, visit);
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of nodes: ");
//         int V = sc.nextInt();
//         System.out.print("enter the number of edges: ");
//         int edges = sc.nextInt();
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph, edges , sc);
//         System.out.println(numberOfProvinces(graph, V));
//         sc.close();
//     }
// }

// by adjacency matrix

public  class NumberOfProvinces{
    public static class Edge{
        int src;
        int dest;
        Edge(int src ,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(int graph[][],Scanner sc){
        int n = graph.length;
        for(int i = 0; i<n; i++ ){
            for(int j = 0; j<n; j++){
                graph[i][j] = sc.nextInt();
            }
        }
    }
    public static void dfs(int graph[][], int curr,  boolean visit[]){
        System.out.print(curr+" ");
        visit[curr] = true;
        for(int i = 0; i<graph.length; i++){
            if(graph[curr][i] == 1 && !visit[i]){
                dfs(graph, i, visit);
            }
        }
    }
    public static int numberOfProvinces(int graph[][]){
        int n = graph.length;
        boolean visit[] = new boolean[n];
        int count = 0;
        for(int i = 0; i<n; i++){
            if(!visit[i]){
                dfs(graph, i, visit);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int graph[][] = new int[V][V];
        createGraph(graph, sc);
        System.out.println(numberOfProvinces(graph));
        boolean visit[] = new boolean[V];
        for(int i = 0; i<V; i++){
            if(!visit[i]){
             dfs(graph, i, visit);
            }
        }
        sc.close();
        
    }
}
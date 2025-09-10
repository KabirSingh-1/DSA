import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphByMetrix {
    public static void createGraph(int[][] graph, int edges){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ;i<edges;i++){
          int src = sc.nextInt();
          int dest = sc.nextInt();
          int weight = sc.nextInt();

          graph[src][dest] = weight;
          graph[dest][src] = weight;
        }
        sc.close();
    }
    public static void print(int[][] graph){
        for(int i = 0 ;i<graph.length; i++){
            for(int j = 0; j<graph[0].length; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void bfs(int[][] graph, int start ,int V){
      Queue<Integer> q = new LinkedList<>();
      boolean[] visit = new boolean[V];
      q.add(start);
      visit[start] = true;
      while (!q.isEmpty()) {
        int curr = q.poll();
        System.out.print(curr+" ");

        for(int i = 0; i<V; i++){
            if(graph[curr][i]!=0 && !visit[i]){
                q.add(i);
                visit[i] = true;
            }
        }
      }
      System.out.println();
    }
    public static void dfs(int[][] graph, int curr, boolean[] visit){
          System.out.print(curr+" ");
          visit[curr] = true;
          for(int i = 0; i<graph.length; i++){
            if(graph[curr][i]!=0 && !visit[i]){
                dfs(graph, i, visit);
            }
          }
          System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of vertex(nodes): ");
        int V = sc.nextInt();
        int[][] graph = new int[V][V];
        System.out.print("enter the number of edges: ");
        int E = sc.nextInt();
        createGraph(graph, E);
        print(graph);

        for(int i = 0; i<graph[2].length;i++){
            if(graph[2][i]!=0){
                System.out.print(graph[2][i]+" ");

            }
        }
        System.out.println();
        bfs(graph, 0, V);
        System.out.println();
        boolean visit[] = new boolean[V];
        for(int i = 0; i<V; i++){
            if(!visit[i]){
             dfs(graph, i, visit);
            }
        }
        sc.close();
    }
}

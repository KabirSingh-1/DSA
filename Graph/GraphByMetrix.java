import java.util.Scanner;

public class GraphByMetrix {
    public static class Edge {
       int src;
       int dest;
       int weight;
       Edge(int src,int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
       }
    }
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
        sc.close();
    }
}

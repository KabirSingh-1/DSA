
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int edges){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i<edges; i++){
            System.out.print("give src and dest: ");
            int src = sc.nextInt();
            int dest = sc.nextInt();

            graph[src].add(new Edge(src, dest));
            graph[dest].add(new Edge(src, dest));
        }
        sc.close();
        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 3));  


        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 4));

        // graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 5));
        // graph[5].add(new Edge(5, 6));


    }

    public static void printNeighbour(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }

        public static void print(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + " ->");
            for (Edge e : graph[i]) {
                System.out.print("(src: " + e.src + ", dest: " + e.dest + ") ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge> graph[], int V, int src){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[V];
        q.add(src);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(visit[curr] == false){
                System.out.print(curr+" ");
                visit[curr] = true;

                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of vertex");
        int V = sc.nextInt();
        System.out.print("enter the number of edges");
        int edges = sc.nextInt();
        System.out.print("enter the source of graph: ");
        int src = sc.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, edges);
        printNeighbour(graph);
        System.out.println();
        bfs(graph, V,src);
        System.out.println();
        print(graph);
        sc.close();
        
    }
}

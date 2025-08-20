import java.util.ArrayList;
import java.util.Scanner;

public class Basic {
    public static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int edges) {
        Scanner sc = new Scanner(System.in);

      
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges; i++) {
            System.out.print("Enter src, dest, weight: ");
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();

            graph[src].add(new Edge(src, dest, weight));
            graph[dest].add(new Edge(dest, src, weight));
        
        }
    }

    public static void print(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + " ->");
            for (Edge e : graph[i]) {
                System.out.print("(dest: " + e.dest + ", weight: " + e.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph, E);

        System.out.println("Graph Adjacency List:");
        print(graph);

        sc.close();
    }
}
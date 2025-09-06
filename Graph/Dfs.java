
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Dfs {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int V) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 5));
        graph[5].add(new Edge(5, 6));

    }

    public static void print(ArrayList<Edge> graph[], int V) {
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visit[]) {
        System.out.print(curr + " ");
        visit[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (visit[e.dest] == false)
                dfs(graph, e.dest, visit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        print(graph, V);
        System.out.println();
        boolean visit[] = new boolean[V];
        // when the graph dis in different distributed graph
        for (int i = 0; i < V; i++) {
            if (visit[i] == false) {
                dfs(graph, i, visit);
            }
        }
        System.out.println();
        // dfs(graph, 0, visit);

        sc.close();

    }
}

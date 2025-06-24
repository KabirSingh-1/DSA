import java.util.ArrayList;

public class AllPathStoT {
    static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest= dest;
        }
    }

public static void createGraph( ArrayList<Edge> graph[], int V){
    for( int i = 0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
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
public static void print(ArrayList<Edge> graph[], int curr){
    for(int i = 0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        System.out.print(e.dest+" ");
    }
}
public static void printAllPath(ArrayList<Edge> graph[],boolean visit[], int curr, String path,int tar){
    if(curr == tar){
        System.out.println(path);
        return;
    }
    for(int i = 0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(!visit[e.dest]){
          visit[curr] = true;
          printAllPath(graph, visit, e.dest, path+e.dest, tar);
          visit[curr] =false;
        }
    }
}
   public static void main(String[] args) {
    int V = 7;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph, V);
    int src = 0;
    int tar = 5;
    printAllPath(graph, new boolean[V] , src, "0", tar);
    
   } 
}
//o(v^v);
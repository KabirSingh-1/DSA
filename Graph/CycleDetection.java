import java.util.ArrayList;

public class CycleDetection {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

public static void createGraph(ArrayList<Edge> graph[]){
    for(int i =0 ; i<graph.length;i++){
        graph[i] = new ArrayList<>();
    }
    graph[1].add(new Edge(1, 0));

    graph[0].add(new Edge(0, 2));

    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 0));
}
public static boolean isCycleDetection(ArrayList<Edge> graph[], int curr, boolean visit[], boolean rec[]){
    visit[curr] = true;
    rec[curr] = true;

    for(int i = 0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(rec[e.dest]){
            return true;
        }
        else if(!visit[e.dest]){
            if(isCycleDetection(graph, e.dest, visit, rec)){
                return true;
            }
        }
    }
    rec[curr] = false;
    return false;
}
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean visit[] =new boolean[V];
        boolean rec[] = new boolean[V];
        for(int i = 0; i<V; i++){
            if(!visit[i]){
            boolean result =   isCycleDetection(graph, 0,new boolean[V], new boolean[V]);
            if(result){
                System.out.println(result);
                break;
            }
            
            }
        }
        // boolean result =   isCycleDetection(graph, 0,new boolean[V], new boolean[V]);
        // System.out.println(result);
    }
}

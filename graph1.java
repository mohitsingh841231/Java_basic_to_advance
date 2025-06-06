import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph1 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 0)); // You added twice: verify if needed
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
        // graph[6].add(new Edge(6, 7)); 

    }

    public static void bcf(ArrayList<Edge>[] graph, int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.println(curr);
                vis[curr] = true;
                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }
        }
    }
    
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
    System.out.print(curr+" ");
    vis[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        if (!vis[e.dest]) {
            dfs(graph, e.dest, vis);
        }
    }
}

    public static void main(String[] args) {
int v = 7;
// @SuppressWarnings("unchecked")
ArrayList<Edge>[] graph = new ArrayList[v];

createGraph(graph);

// Print neighbors of node 2
System.out.print("Neighbors of node 2: ");
for (Edge e : graph[2]) {
    System.out.print(e.dest + " ");
}
System.out.println();

// Run DFS from node 0
boolean[] vis = new boolean[v];
dfs(graph, 0, vis);
    }
}

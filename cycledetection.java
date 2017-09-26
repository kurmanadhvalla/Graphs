class qs {
  private final ArrayList<Integer>[] graph;

  qs(ArrayList<Integer>[] graph) {
    this.graph = graph;
  }

  boolean hasCycle() {
    List<Integer> visited = new ArrayList<>();
    for (int i = 0; i < graph.length; ++i) {
      if (hasCycle(i, visited)) {
        return true;
      }
    }
  }

  private boolean hasCycle(int node, List<Integer> visited) {
    if (visited.contains(node)) {
      return true;
    }
    visited.add(node);
    for (Integer nextNode : graph[node]) {
      if (hasCycle(nextNode, visited)) {
        return true;
      }
    }
    visited.remove(visited.length() - 1);
    return false;
  }
}

//for undirected Graphs
// A Java Program to detect cycle in an undirected graph
import java.io.*;
import java.util.*;
 class Graph
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List Represntation
   Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
   void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
	 Boolean isCyclic()
    {
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
     for (int u = 0; u < V; u++)
            if (!visited[u]) 
                if (isCyclicUtil(u, visited, -1))
                    return true;
 
        return false;
    }
	Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {
        // Mark the current node as visited
        visited[v] = true;
        Integer i;
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
 
            // If an adjacent is not visited, then recur for that
            // adjacent
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }
 
            // If an adjacent is visited and not parent of current
            // vertex, then there is a cycle.
            else if (i != parent)
                return true;
        }
        return false;
    }
}
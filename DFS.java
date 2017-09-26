import java.io.*;
import java.util.*;
class Graph{
	private int V;
	private LinkedList<Integer> adj[];
	Graph(int v)
	{
		V=v;
		adj = new LinkedList[v];
		for (int i=0;i<v;++i)
			adj[i] = new LinkedList();
	}
	void addEdge (int v,int w){
		adj[v].add(w);
	}
	void DFSutil (int v , boolean visited [])
	{
		visited[v] = true ;
		System.out.print(v+ " ");
		Iterator <Integer> i = adj[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
			{
				DFSutil(n,visited);
				
			}
			
	    }
	}
     void DFS ()
	 {
       boolean visited []  = new  boolean[v];
	   for (int i=0;i<v;++i)
	   {
		    if (!visited[i])
				 DFSutil(i,visited);
			 
	   }
	 }
			
			

  	
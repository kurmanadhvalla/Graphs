import java.util.*;
import java.io.*;
class Graph{
	private int V;
	private linkedList<Integer> adj[];
	Graph(int v)
	{
		V =v;
		adj  = new LinkedList[v];
		for (int i=0;i<v;++i)
			 adj[i] = new LinkedList();
	}
	void addEdge(int v,int w)
	{
		adj[v].add[w];
	}
	void BFS (int s)
	{
		booloean visited[] = new boolean[v];
		LinkedList <Integer> queue  = new LinkedList<>();
		queue.add(s);
		visited[s]= true;
		while (queue.size()!=0)
		{
			s = queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (!visited[n])
				{
					queue.add(n);
					visited[n]= true;
					
				}
				
			}
		}
		
	}
}
		
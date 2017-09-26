class Bipartite{
 boolean  isBipartite(int [][] g,int src)
{
	int [] colorarr = new int [V];
	  for (int i=0;i<V;i++)
	  {
		  colorarr[i] =-1
	  }
	  colorarr[src] =0;
	  LinkedList<Integer> queue  = new LinkedList<>();
	  queue.add(src);
	  while (q.size()!=0)
	  {
		  int u = q.poll();
		  if (g[u][u]==1)
			  return false;
		  for(int v=0;v<V;v++)
		  {
			  if (g[u][v]==1&colorarr[v]==-1)
			  {
				  colorArr[v] = 1-colorArr[u];
				  queue.add(v);
			  }
			  else if (g[u][v]==1&colorarr[v]==colorarr[u])
                 return false;
		  }
	  }
          reutrn false;
}
}		  
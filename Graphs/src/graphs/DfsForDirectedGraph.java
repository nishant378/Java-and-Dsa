package graphs;

import java.util.LinkedList;

class DFSForDirectedGraphs
{
	int i=0;
	char a[]=new char[8];
	@SuppressWarnings("unchecked")
	LinkedList<Integer> b[]=new LinkedList[a.length];
	int address1,address2;
	int flag1=0;
	int flag2=0;
	int top=0;
	int flag=0;
	int check=0;
	int ch=1;
	char stack[]=new char[a.length];
	DFSForDirectedGraphs()
	{
		for(int i=0;i<a.length;i++)
		{
			b[i]=new LinkedList<>();
		}
	}
	
	void insertVertex(char vertex)
	{
		if(i<a.length)
		{
			a[i]=vertex;
			i++;
		}
	}
	
	void insertEdge(char vertex1,char vertex2)
	{
		flag1=0;
		flag2=0;
		check=0;
		ch=1;
		if(selfEdge(vertex1,vertex2)==true)
		{
			checkVertex(vertex1,vertex2);		
			if(check==1)
			{
		      multiEdges(vertex1,vertex2);
			if(ch!=0)
			{
		      for(int i=0;i<this.i;i++)
		      {
			       if(vertex1==a[i])
			       {
				        address1=i;
			       }
			       if(vertex2==a[i])
			       {
				        address2=i;
			      }
		      }
		    Connection(address1,address2);
		    }
			}
			else
			{
				System.out.println("there is no vertex");
			}
		}
		else
		{
			System.out.println("self edge");
		}
	}
	
	void Connection(int address1,int address2)
	{
		b[address1].add(address2);
	}
	
	boolean selfEdge(char vertex1,char vertex2)
	{
		if(vertex1==vertex2)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	void checkVertex(char vertex1,char vertex2)//are they exist?
	{
		for(int i=0;i<a.length;i++)
		{
			if(vertex1==a[i])
			{
				flag1=1;
			}
			if(vertex2==a[i])
			{
				flag2=1;
			}
			
			if(i==a.length-1)
			{
				if(flag1==1 && flag2==1)
				{
					check=1;
				}
			}
		}
	}
	
	void multiEdges(char vertex1,char vertex2)
	{
		for(int i=0;i<this.i;i++)
		{
			if(a[i]==vertex1)
			{
				address1=i;
			}
			if(a[i]==vertex2)
			{
				address2=i;
			}
		}
		
		   for(Integer pCrawl : b[address1])
		   {
			   if(pCrawl==address2)
			   {
				   System.out.println("multiedge");
				   ch=0;
			   }
		   }
	}
	
	void dfs(int Vertex)
	{
		    flag=0;
		    Isthere(a[Vertex]);
		    if(flag!=1)
		    {
		      stack[top]=a[Vertex];
		      top++;
		    }
		   for(Integer pCrawl : b[Vertex])
		   {
			     flag=0;
			     Isthere(a[pCrawl]);
			     if(flag!=1)
			     {
			    	 stack[top]=a[pCrawl];
			    	 top++;
			    	 dfs(pCrawl);
			     }
		   }   
	}
	
	void Isthere(char search)
	{
		for(int i=0;i<stack.length;i++)
		{
			if(stack[i]==search)
			{
				flag=1;
			}
		}
	}
	
	void allVisited()
	{
		for(int i=0;i<a.length;i++)
		{
			flag=0;
			for(int j=0;j<stack.length;j++)
			{
				if(a[i]==stack[j])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				dfs(i);
			}
		}
	}
}
public class DfsForDirectedGraph {

	public static void main(String[] args) {
		DFSForDirectedGraphs obj=new DFSForDirectedGraphs();
		    obj.insertVertex('A');
	        obj.insertVertex('B');
			obj.insertVertex('C');
			obj.insertVertex('D');
			obj.insertVertex('E');
			obj.insertVertex('F');
			obj.insertVertex('G');
			obj.insertVertex('H');
			
			        obj.insertEdge('A','B');
				    obj.insertEdge('A','D');
				    obj.insertEdge('B','E');
				    obj.insertEdge('C','A');
				    obj.insertEdge('A','D');
				    obj.insertEdge('F','B');
				    obj.insertEdge('G','C');
				    obj.insertEdge('G','H');
				    obj.insertEdge('H','D');
				    obj.insertEdge('H','E');
				    obj.insertEdge('H','F');
				    
				    
				    System.out.println("Vertex list");
					for(int i=0;i<obj.i;i++)
					{
						System.out.println(obj.a[i]);
					}
				
				   System.out.println("Edge list");
				   
				   for(int i=0;i<obj.b.length;i++)
				   {
					   for(Integer pCrawl : obj.b[i])
					   {
						   System.out.print(" -> " +pCrawl);
					   }
					   System.out.println();
				   }
				   
				   obj.dfs(0);
				   obj.allVisited();
				   System.out.println("DFS");
				   for(int i=0;i<obj.stack.length;i++)
				   {
					   System.out.println(obj.stack[i]);
				   }
				   

	}

}

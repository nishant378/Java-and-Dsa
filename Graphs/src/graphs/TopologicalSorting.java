package graphs;

import java.util.*;

class TopologicalSort
{
	int i=0;
	int flag=0;
	char a[]=new char[8];
	@SuppressWarnings("unchecked")
	LinkedList<Integer> b[]=new LinkedList[a.length];
	int address1,address2;
	int flag1=0;
	int flag2=0;
	int check=0;
	int ch=1;
	int Print[]=new int[a.length];
	int print=0;
	int present=0;
	TopologicalSort()
	{
		for(int i=0;i<a.length;i++)
		{
			b[i]=new LinkedList<>();
		}
		
		for(int i=0;i<a.length;i++)
		{
			Print[i]=100;
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
	
	
	void Topological()
	{
		for(int z=0;z<a.length;z++)
		{
			present=0;
			flag=0;
			for(int k=0;k<a.length;k++)
			{
				if(z==Print[k])
				{
					present=1;
				}
			}
			if(present!=1)
			{
			for(int i=0;i<a.length;i++)
			{
				for(Integer pCrawl : b[i])
				{
					if(z==pCrawl)
					{
						flag=1;
					}
				}
			}
			
			if(flag!=1)
			{
	     		b[z].clear();
				
				Print[print]=z;				
				print++;
				z=-1;
			}
		}
		}
	}
		
	
}
public class TopologicalSorting {

	public static void main(String[] args) {
		TopologicalSort obj=new TopologicalSort();
	    obj.insertVertex('A');
        obj.insertVertex('B');
		obj.insertVertex('C');
		obj.insertVertex('D');
		obj.insertVertex('E');
		obj.insertVertex('F');
		obj.insertVertex('G');
		obj.insertVertex('H');
		     obj.insertEdge('A','B');
		     obj.insertEdge('F','B');
		     obj.insertEdge('H','F');
		     obj.insertEdge('H','E');
		     obj.insertEdge('B','E');
		     obj.insertEdge('A','D');
		     obj.insertEdge('H','D');
		     obj.insertEdge('G','H');
		     obj.insertEdge('G','C');
		     obj.insertEdge('C','A');
		     
		     obj.Topological();
		     for(int i=0;i<obj.a.length;i++)
		     {
		    	 System.out.println(obj.Print[i]);
		     }
		     
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
	}

}

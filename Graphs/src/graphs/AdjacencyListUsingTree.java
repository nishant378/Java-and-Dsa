package graphs;

import java.util.*;



class AdjacencylistUsingTree
{
	int i=0;
	int address1,address2;
	char a[]=new char[8];
	@SuppressWarnings("unchecked")
	TreeSet<Integer> b1[]=new TreeSet[8]; 
	
	
	AdjacencylistUsingTree()
	{
		for(int i=0;i<a.length;i++)
		{
			b1[i]=new TreeSet<>();
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
        
        Connection(address1,address2);
	}
	
	void Connection(int address1,int address2)
	{	
		 b1[address1].add(address2);
		 b1[address2].add(address1);
	}
	
	void deleteVertex(char vertex)
	{
		for(int i=0;i<this.i;i++)
		{
			if(a[i]==vertex)
			{
				address1=i;
				for(int j=i+1;j<this.i;j++)
				{
					a[j-1]=a[j];
				}
			}
		}
		i--;
		deleteEdgeByVertex(address1);
	}
	
	void deleteEdgeByVertex(int address1)
	{
		   for(Integer pCrawl : b1[address1])
		   {
			    b1[pCrawl].remove(address1);
		   }
		   
		   for(int j=address1+1;j<b1.length;j++)
		   {
			     b1[j-1]=b1[j];
		   }
	}
	
	void deleteEdge(char vertex1,char vertex2)
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
		System.out.println("address1:"+address1);
		System.out.println("address2:"+address2);
		
		 deleteEdges(address1,address2);
		 
	}
	
	void deleteEdges(int address1,int address2)
	{
		 for(Integer pCrawl : b1[address1])
		   {
		       if(address2==pCrawl)
		       {
		    	   b1[address1].remove(pCrawl);
		    	   break;
		       }
		   }
		   
		  for(Integer pCrawl : b1[address2])
		   {
		       if(address1==pCrawl)
		       {
		    	   b1[address2].remove(pCrawl);
		    	   break;
		       }
		   }
	}
}
public class AdjacencyListUsingTree {

	public static void main(String[] args) {
		AdjacencylistUsingTree obj=new AdjacencylistUsingTree();
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
			        obj.insertEdge('A','C');
			        obj.insertEdge('C','G');
			        obj.insertEdge('G','H');
			        obj.insertEdge('H','F');
			        obj.insertEdge('B','F');
			        obj.insertEdge('B','E');
			        obj.insertEdge('D','H');
			        obj.insertEdge('E','H');
			        
			        
			             
			        obj.deleteEdge('A','B');
			        
			          obj.deleteVertex('G');
			         
			System.out.println("Vertex list");
			for(int i=0;i<obj.i;i++)
			{
				System.out.println(obj.a[i]);
			}
			
			  System.out.println("Edge list");		   
			   for(int i=0;i<obj.b1.length;i++)
			   {
				   for(Integer pCrawl : obj.b1[i])
				   {
					  System.out.print(" -> " +pCrawl);
				   }
				   System.out.println();
			   }
	}

}

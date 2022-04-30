package graphs;
import java.util.*;

class AdjacencyListUsingLinkedList
{
	int i=0;
	char a[]=new char[8];
	@SuppressWarnings("unchecked")
	LinkedList<Integer> b[]=new LinkedList[a.length];
	int address1,address2;
	int flag1=0;
	int flag2=0;
	int check=0;
	int ch=1;
	AdjacencyListUsingLinkedList()
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
		
		b[address2].add(address1);
	
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
	
	void deleteVertex(char vertex)//vertex should be in the vertex list
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
		   for(Integer pCrawl : b[address1])
		   {
			    for(Integer pRawal : b[pCrawl])
			    {
			    	if(pRawal==address1)
			    	{
			    		int index=b[pCrawl].indexOf(address1);
			    		b[pCrawl].remove(index);
			    		break;
			    	}
			    }
		   }
		   for(int j=address1+1;j<b.length;j++)
		   {
			     b[j-1]=b[j];
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
		   for(Integer pCrawl : b[address1])
		   {
		       if(address2==pCrawl)
		       {
		    	   int index=b[address1].indexOf(pCrawl);
		    		b[address1].remove(index);
		    		break;
		       }
		   }
		   
		   for(Integer pCrawl : b[address2])
		   {
		       if(address1==pCrawl)
		       {
		    	   int index=b[address2].indexOf(pCrawl);
		    		b[address2].remove(index);
		    		break;
		       }
		   }
		
	}
}
public class AdjacencylistUsingLinkedList {

	public static void main(String[] args) {
		AdjacencyListUsingLinkedList obj=new AdjacencyListUsingLinkedList();
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
		              obj.insertEdge('A','B');
	                  obj.insertEdge('B','A');
	                  obj.insertEdge('A','A');
	                  obj.insertEdge('Z','C');
	                  
	                obj.deleteVertex('G');
	                obj.deleteEdge('F','H'); 
			System.out.println("Vertex list");
			for(int i=0;i<obj.i;i++)
			{
				System.out.println(obj.a[i]);
			}
		
		   System.out.println("Edge list");
		   
		   for(int i=0;i<obj.b.length;i++)
		   {
			   System.out.print("head");
			   for(Integer pCrawl : obj.b[i])
			   {
				   System.out.print(" -> " +pCrawl);
			   }
			   System.out.println();
		   }

	}

}

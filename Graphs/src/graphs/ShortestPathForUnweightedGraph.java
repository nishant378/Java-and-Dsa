package graphs;

import java.util.LinkedList;

class ShortestpathforUnweightedGraph
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
	
	int queue[]=new int[a.length];
	int j=0;
	int flag=0;
	
	int c=0;
	int compare[]=new int[a.length];
	
	ShortestpathforUnweightedGraph()
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
	
      void ShortestPath(char src,char dest)
      {
    	  for(int i=0;i<this.i;i++)
	      {
		       if(src==a[i])
		       {
			        address1=i;
		       }
		       if(dest==a[i])
		       {
			        address2=i;
		      }
	      }
    	  
    	  Idon(address1,address2);
    	  
      }
      
      void Idon(int src,int dest)
      {
    	  flag=0;
    	  isthere(src);
    	  if(flag!=1)
    	  {
    	     queue[j]=src;
    	     j++;	
    	  }
    	  for(Integer pCrawl : b[src])
    	  {
    		  if(dest==pCrawl)
    		  {
    			  queue[j]=pCrawl;
    			  j++;
    			  if(c>=j || c==0)
    			  {
    				  c=0;
    				  for(int i=0;i<j;i++)
    				  {
    					  compare[i]=queue[i];
    					  c++;
    				  }
    			  }
    		  }
    		  else
    		  {
    			 queue[j] =pCrawl;
    			 j++;
    			 Idon(pCrawl,dest);
    		  }
    		  j--;
    	  }
      }
      
     void isthere(int src)
     {
    	 for(int i=0;i<j;i++)
    	 {
    		 if(queue[i]==src)
    		 {
    			 flag=1;
    		 }
    	 }
     }
      
   
	
}

public class ShortestPathForUnweightedGraph {

	public static void main(String[] args) {
		ShortestpathforUnweightedGraph obj=new ShortestpathforUnweightedGraph();
		    obj.insertVertex('A');
	        obj.insertVertex('B');
			obj.insertVertex('C');
			obj.insertVertex('D');
			obj.insertVertex('E');
			obj.insertVertex('F');
			obj.insertVertex('G');
			          obj.insertEdge('A','B');
			          obj.insertEdge('B','E');
			          obj.insertEdge('E','G');
			          obj.insertEdge('G','F');
			          obj.insertEdge('C','F');
			          obj.insertEdge('C','A');
			          obj.insertEdge('A','D');
			          obj.insertEdge('B','D');
			          obj.insertEdge('D','F');
			          obj.insertEdge('D','G');
			          
			         obj.ShortestPath('A','G');
			          for(int i=0;i<obj.c;i++)
			          {
			        	  System.out.println(obj.compare[i]);
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

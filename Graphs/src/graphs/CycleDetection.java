package graphs;

import java.util.LinkedList;

class Cycledetection
{
	int aw=0;
	int sys=0;
	int i=0;
	int top=0;
	char a[]=new char[8];
	@SuppressWarnings("unchecked")
	LinkedList<Integer> b[]=new LinkedList[a.length];
	int address1,address2;
	int flag1=0;
	int flag2=0;
	int pg=0;
	int flag=0;
	char stack[]=new char[a.length];
	char visited[]=new char[a.length];
	int check=0;
	int j=0;
	int ch=1;
	Cycledetection()
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
			     if(aw==1)
			     {
			    	sys=Vertex;
			    	aw=0;
			     }
			   for(Integer pCrawl : b[Vertex]) 
			   {
				     if(pCrawl==sys)
				     {
				    	System.out.println("there is a cycle:"+a[pCrawl]);
				     }
				     else if(pg<i)
				     {		  
				    	 pg++;
				         dfs(pCrawl);
				     }

			   } 
			 
		}
		
		

		
	
}
public class CycleDetection {

	public static void main(String[] args) {
		 Cycledetection obj=new  Cycledetection();
		 obj.insertVertex('G');
		 obj.insertVertex('P');
		 obj.insertVertex('Q');
		 obj.insertVertex('S');
		 obj.insertVertex('K');
		      obj.insertEdge('G','S');
		      obj.insertEdge('G','Q');
		      obj.insertEdge('K','G');
		      obj.insertEdge('P','G');
		      obj.insertEdge('Q','P');
		  
		    for(int i=0;i<obj.i;i++)
		    {
		             obj.pg=0;
		        	 obj.aw=1;
		             obj.dfs(i);
		        
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

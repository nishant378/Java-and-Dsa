package graphs;

class Edgelist
{
	int i=0;
	int j=0;
	int flag1=0;
	int flag2=0;
	int check=0;
	int ch=1;
	char a[]=new char[7];
	Node edge[]=new Node[7];
	class Node
	{
		char vertex1;
		char vertex2;
	}
	
	Edgelist()
	{
		for(int i=0;i<edge.length;i++)
		{
		    edge[i]=new Node();
		}
	}
	
   
	void insertEdge(char vertex1,char vertex2)
	{	
		ch=1;
		flag1=0;
		flag2=0;
		check=0;
		if(selfEdge(vertex1,vertex2)==true)
		{
			multiEdge(vertex1,vertex2);
			if(ch!=0)
			{
			checkVertex(vertex1,vertex2);
			if(check==1)
			{
				if(j<edge.length)
				{
					System.out.println("vertex1:"+vertex1);
					System.out.println("vertex2:"+vertex2);						
					edge[j].vertex1=vertex1;
					edge[j].vertex2=vertex2;
					j++;
				}
			}
			else
			{
				System.out.println("there is no vertex");
			}
			}
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
	
	
	void multiEdge(char vertex1,char vertex2)
	{
		for(int i=0;i<edge.length;i++)
		{
			if(edge[i].vertex1==vertex1 && edge[i].vertex2==vertex2)
			{
				ch=0;
			}
			if(edge[i].vertex1==vertex2 && edge[i].vertex2==vertex1)
			{
				ch=0;
			}
		}
	}
	
	
	void deleteEdge(char vertex1,char vertex2)
	{
		System.out.println("delete edge method");
		for(int i=0;i<edge.length;i++)
		{
			if(edge[i].vertex1==vertex1 && edge[i].vertex2==vertex2)
			{
				for(int j=i+1;j<edge.length;j++)
				{
					edge[j-1].vertex1=edge[j].vertex1;
					edge[j-1].vertex2=edge[j].vertex2;
				}
				j--;
			}
			if(edge[i].vertex1==vertex2 && edge[i].vertex2==vertex1)
			{
				for(int j=i+1;j<edge.length;j++)
				{
					edge[j-1].vertex1=edge[j].vertex1;
					edge[j-1].vertex2=edge[j].vertex2;
				}
				j--;		
			}
			
		}
	}
	
	
	void deleteVertex(char vertex)//the vertex should be existed in the list
	{
		for(int i=0;i<a.length;i++)
		{
			if(vertex==a[i])
			{
				for(int j=i+1;j<a.length;j++)
				{
					a[j-1]=a[j];
				}
			}
		}
		i--;
		deleteEdgebyVertex(vertex);
		
	}
	
	
	void deleteEdgebyVertex(char vertex)
	{
		for(int i=0;i<edge.length;i++)
		{
			if(edge[i].vertex1==vertex || edge[i].vertex2==vertex)
			{
				for(int j=i+1;j<edge.length;j++)
				{
					edge[j-1].vertex1=edge[j].vertex1;
					edge[j-1].vertex2=edge[j].vertex2;
				}
				j--;
			}
			if(edge[i].vertex1==vertex || edge[i].vertex2==vertex)
			{
				for(int j=i+1;j<edge.length;j++)
				{
					edge[j-1].vertex1=edge[j].vertex1;
					edge[j-1].vertex2=edge[j].vertex2;
				}
				j--;		
			}
			
		}
	}
	
}
public class EdgeList {

	public static void main(String[] args) {
	        Edgelist obj=new Edgelist();
		       obj.insertVertex('G');
		       obj.insertVertex('H');
		       obj.insertVertex('P');
		       obj.insertVertex('N');
		       obj.insertVertex('C');
		          obj.insertEdge('G','H');	   
		          obj.insertEdge('H','C');
		          obj.insertEdge('P','N');
		          obj.insertEdge('G','N');
		          obj.insertEdge('H','N');
		          obj.insertEdge('P','C');
		               obj.insertEdge('Z','C');//non existed vertex z
		               obj.insertEdge('P','P');//self node
		               obj.insertEdge('P','N');//Multi edge node
		               obj.insertEdge('N','P');//Multi edge node
		               obj.insertEdge('f','d');//non existed vertexes*/
		        obj.insertVertex('K');
		        obj.insertEdge('G','K');
		             	              
		        obj.deleteVertex('P');
		                       obj.deleteEdge('G','N');
		                    
		                       
		                     obj.insertEdge('H','P');
		                       
		                    obj.deleteEdge('H','C');
		                      
		                 obj.insertEdge('H','K');
		        
		               
		      
		             System.out.println("Vertex list");
		             for(int i=0;i<obj.i;i++)
		             {
		            	 System.out.println(obj.a[i]);
		             }
		          System.out.println("Edge list");
		         for(int i=0;i<obj.j;i++)
		         {
		            System.out.println(obj.edge[i].vertex1 + " " + obj.edge[i].vertex2);		           
		         }

	}

}

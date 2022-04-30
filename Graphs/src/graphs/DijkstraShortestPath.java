package graphs;

class ShortestPath
{
	int i=0;
	int flag1=0;
	int flag2=0;
	int check=0;
	int p;
	int address1,address2;
	char a[]=new char[8];
	int mat[][]=new int[a.length][a.length];
	
	int queue[]=new int[a.length];
	int k=0;
	
	int flag=0;
	
	int weight[]=new int[a.length];
	int w=0;
	int sum=0;
	int sp=0;
	
	int compare[]=new int[a.length];
	int c=0;
	ShortestPath()
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				mat[i][j]=0;
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
	
	void insertEdge(char vertex1,char vertex2,int weight)
	{
		flag1=0;
		flag2=0;
		check=0;
		if(selfEdge(vertex1,vertex2)==true)
		{
		checkVertex(vertex1,vertex2);
		if(check==1)
		{
			for(int i=0;i<a.length;i++)
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
			mat[address1][address2]=weight;
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
	
	void Shortestpath(char vertex1,char vertex2)
	{
		for(int i=0;i<a.length;i++)
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
		shortestpath(address1,address2);
	}
	
	void shortestpath(int src,int dest)
	{
		flag=0;
		isthere(src);
		  if(flag!=1)
		  {
		    queue[k]=src;
		    k++;
		  }
			for(int j=0;j<mat.length;j++)
			{
				if(mat[src][j]!=0)
				{
					if(j==dest)
					{
					   	queue[k]=j;
					   	k++;
					   	weight[w]=mat[src][j];
					   	w++;
					   	sum=0;
					   	for(int i=0;i<w;i++)
					   	{
					   		sum=sum+weight[i];
					   	}
					   	if(sp>sum || sp==0)
					   	{
					   		sp=sum;
					   		c=0;
					   		for(int i=0;i<k;i++)
					   		{
					   			compare[i]=queue[i];
					   			c++;
					   		}
					   		
					   		
					   	}
					}
					else
					{
						queue[k]=j;
						k++;
						weight[w]=mat[src][j];
						w++;
						shortestpath(j,dest);
					}
					k--;
					w--;
				}
			}
			
	}
	
	 void isthere(int src)
     {
    	 for(int i=0;i<k;i++)
    	 {
    		 if(queue[i]==src)
    		 {
    			 flag=1;
    		 }
    	 }
     }
}
public class DijkstraShortestPath {

	public static void main(String[] args) {
		ShortestPath obj=new ShortestPath();
		    obj.insertVertex('A');
	        obj.insertVertex('B');
			obj.insertVertex('C');
			obj.insertVertex('D');
			obj.insertVertex('E');
			obj.insertVertex('F');
			obj.insertVertex('G');
			          obj.insertEdge('A','B',4);
			          obj.insertEdge('B','E',1);
			          obj.insertEdge('E','G',1);
			          obj.insertEdge('G','F',8);
			          obj.insertEdge('C','F',6);
			          obj.insertEdge('C','A',5);
			          obj.insertEdge('A','D',2);
			          obj.insertEdge('B','D',1);
			          obj.insertEdge('D','F',3);
			          obj.insertEdge('D','G',5);
			          
			          obj.Shortestpath('A','G');
			         for(int i=0;i<obj.c;i++)
			         {
			        	 System.out.println(obj.compare[i]);
			         }
			  
			          System.out.println("ADJACENCY MATRIX");
			  		for(int i=0;i<obj.mat.length;i++)
			  		{		
			  			for(int j=0;j<obj.mat.length;j++)
			  			{
			  			       System.out.print(obj.mat[i][j] + " ");
			  			}
			  			System.out.println();
			  		}
			  		
			  		System.out.println("VERTEX LIST");
			  		for(int i=0;i<obj.i;i++)
			  		{
			  		   System.out.println(obj.a[i]);
			  		}
			          
			          
	}

}

package graphs;

class BfsAndDfs
{
	int i=0;
	int flag1=0;
	int flag2=0;
	int flag=0;
	int check=0;
	int p;
	int k=0;
	int address1,address2;
	char a[]=new char[8];
	int mat[][]=new int[a.length][a.length];
	 
	char queue[]=new char[a.length];
	char stack[]=new char[a.length];
	int top=0;
	int s=0;
	
	BfsAndDfs()
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
	
	void insertEdge(char vertex1,char vertex2)
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
			
			mat[address1][address2]=1;
			mat[address2][address1]=1;
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
	
	void Bfs()
	{
		queue[0]=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				flag=0;
				if(mat[i][j]==1)
				{
					isthere(a[j]);
					if(flag!=1)
					{
						k++;
						if(k<a.length)
						{
						queue[k]=a[j];
						}
					}
				}
			}
		}
		for(int i=0;i<queue.length;i++)
		{
			System.out.println(queue[i]);
		}
	}
	
	void isthere(char search)
	{
		for(int i=0;i<queue.length;i++)
		{
			if(queue[i]==search)
			{
				flag=1;
			}
		}
	}
	
	void dfs(int s)
	{
		stack[0]=a[0];
		for(int j=0;j<mat.length;j++)
		{
			if(mat[s][j]==1)
			{
				flag=0;
				Isthere(a[j]);
				if(flag!=1)
				{
					top++;
					stack[top]=a[j];
					dfs(j);
				}
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
	
}
public class BFSAndDFS {

	public static void main(String[] args) {
		BfsAndDfs obj=new BfsAndDfs();
		obj.insertVertex('G');
		obj.insertVertex('H');
		obj.insertVertex('P');
		obj.insertVertex('N');
		obj.insertVertex('C');
		obj.insertVertex('K');

		
		
		obj.insertEdge('G','H');
		obj.insertEdge('H','C');
		obj.insertEdge('P','N');
		obj.insertEdge('G','N');
	    obj.insertEdge('H','N');
		obj.insertEdge('P','C');
		obj.insertEdge('G','K');
	  
		
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
		
		
	   System.out.println("Bfs");
		obj.Bfs();
		
		System.out.println("dfs");
		obj.dfs(0);
		for(int i=0;i<obj.stack.length;i++)
		{
			System.out.println(obj.stack[i]);
		}

	}

}

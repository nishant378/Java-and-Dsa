package graphs;

class Adjacencymatrix
{
	int i=0;
	int flag1=0;
	int flag2=0;
	int check=0;
	int p;
	int address1,address2;
	char a[]=new char[8];
	int mat[][]=new int[a.length][a.length];
	
	
	Adjacencymatrix()
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
	
	void deleteEdge(char vertex1,char vertex2)
	{
		System.out.println("deletion method");
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
			mat[address1][address2]=0;
			mat[address2][address1]=0;
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
	
	void deleteVertex(char vertex)//the vertex should be existed in the list
	{
		for(int i=0;i<a.length;i++)
		{
			if(vertex==a[i])
			{
				p=i;
				for(int j=i+1;j<a.length;j++)
				{
					a[j-1]=a[j];
				}
			}
		}
		i--;
		for(int i=0;i<mat.length;i++)
		{
			mat[i][p]=0;
		}
	}
}
public class AdjacencyMatrix {

	public static void main(String[] args) {
		Adjacencymatrix obj=new Adjacencymatrix();
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
		        obj.insertEdge('A','A');
		        obj.insertEdge('A','B');
		        obj.insertEdge('B','A');
		        obj.insertEdge('Z','C');
		        
		        obj.deleteEdge('A','B');
		        obj.deleteEdge('A','D');
		        
		        obj.deleteVertex('B');
		
		
		        
		System.out.println("ADJACENCY MATRIX");
		for(int i=0;i<obj.mat.length;i++)
		{		
			for(int j=0;j<obj.mat.length;j++)
			{
			       System.out.print(obj.mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("i:"+obj.i);
		System.out.println("VERTEX LIST");
		for(int i=0;i<obj.i;i++)
		{
		   System.out.println(obj.a[i]);
		}
		
		

	}

}

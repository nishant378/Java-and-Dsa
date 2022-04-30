package graphs;

class PrismAlgorithm
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
	int s[][]=new int[a.length][a.length];
    int k=0;
	int n=1;
	int min;
	int flag=0;
	int s1=0;
	PrismAlgorithm()
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				mat[i][j]=100;
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				s[i][j]=0;
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
			mat[address2][address1]=weight;
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
	
	
	void Prism(int i)
	{
		if(n<this.i)
		{
			min=101;
			for(int j=0;j<mat.length;j++)
			{
				if(mat[i][j]<min)
				{
					min=mat[i][j];
					k=j;
				}
			}
			if(min!=100)
			{
				flag=0;
				cycledetection(k);
				if(flag!=1)
				{
					s[i][k]=mat[i][k];
					s[k][i]=mat[k][i];
					n++;
					mat[i][k]=100;
					mat[k][i]=100;
					queue[s1]=i;
					s1++;
					Prism(k);
				}
				else
				{
					mat[i][k]=100;
					mat[k][i]=100;
					Prism(i);
				}
			}
			else
			{
				s1--;
		    	Prism(queue[s1]);
			}
		}
	}
	
	void cycledetection(int k)
	{
		for(int i=0;i<s1;i++)
		{
			if(queue[i]==k)
			{
				flag=1;
			}
		}
	}
}
public class Prism {

	public static void main(String[] args) {
		PrismAlgorithm obj=new PrismAlgorithm();
		obj.insertVertex('A');
		obj.insertVertex('B');
		obj.insertVertex('C');
		obj.insertVertex('D');
		obj.insertVertex('E');
		obj.insertVertex('F');
		obj.insertVertex('G');
		obj.insertVertex('H');
		
	           	obj.insertEdge('A','B',5);
	           	obj.insertEdge('A','D',6);
	        	obj.insertEdge('A','C',3);
	        	obj.insertEdge('C','G',4);
	        	obj.insertEdge('G','H',5);
		        obj.insertEdge('H','F',3);
		        obj.insertEdge('B','F',2);
		        obj.insertEdge('B','E',1);
		        obj.insertEdge('D','H',4);
		        obj.insertEdge('E','H',3);
		        
		       obj.Prism(0);
		       
		       for(int i=0;i<obj.s.length;i++)
				{		
					for(int j=0;j<obj.s.length;j++)
					{
					       System.out.print(obj.s[i][j] + " ");
					}
					System.out.println();
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

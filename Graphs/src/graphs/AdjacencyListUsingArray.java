package graphs;

class AdjacencylistUsingArray
{
	int i=0;
	int flag1=0;
	int flag2=0;
	int check=0;
	int p;
	int address1,address2;
	int temp1[];
	int temp2[];
	int ch=1;
	int arr[][]=new int[8][];
	char a[]=new char[8];
	AdjacencylistUsingArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new int[1];
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
	
	void multiedges(char vertex1,char vertex2)
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
		for(int i=0;i<arr[address1].length-1;i++)
		{
		    if(address2==arr[address1][i])
		    {
		    	ch=0;
		    }
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
			multiedges(vertex1,vertex2);
			if(ch!=0)
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
				connection(address1,address2);
			}
			else
			{
				System.out.println("there is no vertex");
			}
			}
		}
		else
		{
			System.out.println("self edge");
		}
	}
	
	void connection(int address1,int address2)
	{
		System.out.println("address1:"+address1);
		System.out.println("address2:"+address2);
		arr[address1][arr[address1].length-1]=address2;
		arr[address2][arr[address2].length-1]=address1;
		
		 temp1=new int[arr[address1].length+1];
		 temp2=new int[arr[address2].length+1];
		    
			for(int j=0;j<arr[address1].length;j++)
			{
				temp1[j]=arr[address1][j];	
			}	
			for(int j=0;j<arr[address2].length;j++)
			{
				temp2[j]=arr[address2][j];
			}
		  arr[address1]=temp1;
		  arr[address2]=temp2;
		 
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
		deleteEdgebyVertex(p);
	}
	
	void deleteEdgebyVertex(int p)
	{
	      for(int i=0;i<arr[p].length-1;i++)
	      {
	    	  int y=arr[p][i];
	    	  for(int k=0;k<arr[y].length-1;k++)
	    	  {   		  
	    		 if(arr[y][k]==p) 
	    		 {
	    			 for(int j=k+1;j<arr[y].length;j++)
	 				{
	 					arr[y][j-1]=arr[y][j];
	 				}
	    			 
	    			 
	    			 int temp[]=new int[arr[y].length-1];
	    			 for(int s=0;s<temp.length;s++)
	    			 {
	    				 temp[s]=arr[y][s];
	    			 }
	    			 arr[y]=temp;
	    		 }	  
	    	  }	  
	      }
	      
	      for(int i=p+1;i<arr.length;i++)
	      {
	    	  arr[i-1]=arr[i];
	      }
	      
	     
	}
	
	
	void deleteEdge(char vertex1,char vertex2)
	{
		check=0;
		checkVertex(vertex1,vertex2);
		if(check==1)
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
		     System.out.println("address11:"+address1);
		     System.out.println("address12:"+address2);
			for(int i=0;i<arr[address1].length-1;i++)//address=5, address=7
			{
				if(arr[address1][i]==address2)
				{
					for(int j=i+1;j<arr[address1].length;j++)
					{
						arr[address1][j-1]=arr[address1][j];
					}
					int temp[]=new int[arr[address1].length-1];
					for(int s=0;s<temp.length;s++)
					{
						temp[s]=arr[address1][s];
					}
					arr[address1]=temp;
				}
			}
			for(int i=0;i<arr[address2].length-1;i++)
			{
				if(arr[address2][i]==address1)
				{
					for(int j=i+1;j<arr[address2].length;j++)
					{
						arr[address2][j-1]=arr[address2][j];
					}
					int temp[]=new int[arr[address2].length-1];
					for(int s=0;s<temp.length;s++)
					{
						temp[s]=arr[address2][s];
					}
					arr[address2]=temp;
				}
			}
		}
	}
}
public class AdjacencyListUsingArray {

	public static void main(String[] args) {
		AdjacencylistUsingArray obj=new AdjacencylistUsingArray();
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
			             
			          obj.deleteVertex('D');  
			           
			          obj.deleteEdge('F','H');
			      
			        System.out.println("Vertex list");
			        for(int i=0;i<obj.i;i++)
			        {
			        	System.out.println(obj.a[i]);
			        }
			        
			        System.out.println("Edge list");
			        for(int i=0;i<obj.arr.length;i++)
			        {
			        	for(int j=0;j<obj.arr[i].length-1;j++)
			        	{
			        		System.out.print(obj.arr[i][j]+" ");
			        	}
			        	System.out.println();
			        }
                   
			        
			        System.out.println("size");
			        for(int i=0;i<obj.arr.length;i++)
			        {
			           System.out.println(obj.arr[i].length);
			        }
            		
            		
	}

}

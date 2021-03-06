package tree;

class ArrayToBst
{
	Node root=new Node();
	Node c=new Node();
	class Node
	{
		Node left;
		int data;
		Node right;
	}
	int middle(int a[])
	{
		return a.length/2;
	}
     void makingRoot(int a[])
     {   	 
          int Root=a[middle(a)];
          root.left=null;
          root.data=Root;
          root.right=null;        
          c=root; 
     }
     
     void UsingLoop(int a[])
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		 Pass(a,i);
    	 }
     }
     
     void Pass(int a[],int i)
     {
    	if(i!=middle(a))
    	 {
    		 insert(root,a[i]); 
    	 }
     }
     
     void  insert(Node c,int data)
 	{
 			if(c==null)
 			{
 				return ;
 			}
 			else  if(c.data>=data)
 			      {
 				       if(c.left!=null)
 				       {
 				    	   insert(c.left,data);
 				       }
 				       else
 				       {
 				    	   Node newnode=new Node();
 				    	   newnode.left=null;
 				    	   newnode.data=data;
 				    	   newnode.right=null;
 				    	   c.left=newnode;
 				       }
 				  }
 			else if(c.data<data)
 				{
 				    if(c.right!=null)
 				    {
 				    	insert(c.right,data);
 				    }
 				    else
 				    {
 				    	Node newnode=new Node();
 				    	newnode.left=null;
 				    	newnode.data=data;
 				    	newnode.right=null;
 				    	c.right=newnode;
 				    }				
 					}			
 	 }
     
     void traverse(Node c)
     {
    	 if(c!=null)
    	 {
    		 traverse(c.left);
    		 traverse(c.right);
    		 System.out.println(c.data);
    	 }
     }
}
public class Problem10 {

	public static void main(String[] args) {
	    ArrayToBst obj=new ArrayToBst();
	    int a[]= {1,5,9,13,15};
	    obj.makingRoot(a);
         obj.UsingLoop(a);
        obj.traverse(obj.root);
	}

}

package tree;

class MaxMinBstree
{
	Node root=new Node();
	Node c=new Node();
	class Node 
	{
		Node left;
		int data;
		Node right;
	}
	void makingRoot(int data)
	{
		root.left=null;
		root.data=data;
		root.right=null;
		c=root;
	}
	void  insert(Node c,int data)
	{
			if(c==null)
			{
				return ;
			}
			else  if(c.data>data)
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
	
	 void Max(Node c)
	 {
		 if(c==null)
		 {
			 return;
		 }
		 else
		 {
			 Max(c.right);
			 if(c!=null)
			 {
			 if(c.right==null)
			 {
				 System.out.println("Max element:"+c.data);
			 }
			 }
		 }
	 }
	 
	 void Min(Node c)
	 {
		 if(c==null)
		 {
			 return;
		 }
		 else
		 {
			 Min(c.left);
			 if(c!=null)
			 {
				 if(c.left==null)
				 {
					 System.out.println("Min element:"+c.data);
				 }
			 }
		 }
	 }
}
public class MaxMinBst {

	public static void main(String[] args) {
		   MaxMinBstree obj=new MaxMinBstree();
		      obj.makingRoot(5);
		      obj.insert(obj.root,3);
		      obj.insert(obj.root,1);
		      obj.insert(obj.root,4);
		      obj.insert(obj.root,9);
		      obj.insert(obj.root,6);
		      obj.insert(obj.root,11);
              obj.Max(obj.root);
              obj.Min(obj.root);
	}

}

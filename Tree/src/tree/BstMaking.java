package tree;

class BST
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
	void Traverse(Node c)
	{
		if(c!=null)
		{
			
			Traverse(c.left);
			System.out.println(c.data);
			Traverse(c.right);
			
		}
	}
	
}
public class BstMaking {

	public static void main(String[] args) {
      BST obj=new BST();
      obj.makingRoot(5);
      obj.insert(obj.root,3);
      obj.insert(obj.root,1);
      obj.insert(obj.root,4);
      obj.insert(obj.root,9);
      obj.insert(obj.root,6);
      obj.insert(obj.root,11);
      obj.Traverse(obj.root);

	}

}

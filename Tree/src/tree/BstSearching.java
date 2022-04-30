package tree;

class SearchingInBst
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
	
	void search(Node c,int search)
	{
		if(c==null)
		{
			return;
		}
		else
		{
			if(c.data==search)
			{
				System.out.println("found");
				return;
			}
			else if(c.data<search)
			{
				search(c.right,search);
			}
			else if(c.data>search)
			{
				search(c.left,search);
			}
		}
	}
	
}
public class BstSearching {

	public static void main(String[] args) {
		 SearchingInBst obj=new SearchingInBst();
	      obj.makingRoot(5);
	      obj.insert(obj.root,3);
	      obj.insert(obj.root,1);
	      obj.insert(obj.root,4);
	      obj.insert(obj.root,9);
	      obj.insert(obj.root,6);
	      obj.insert(obj.root,11);
	      obj.search(obj.root,4);

	}

}

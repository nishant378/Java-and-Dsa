package tree;


class Delete
{
	Node root=new Node();
	Node c=new Node();
    class Node
    {
	    Node left;
	    int data;
	    Node right;
    }
    void makeRoot(int data)
    {
    	root.left=null;
    	root.data=data;
    	root.right=null;
    	c=root;
    }
    
    Node insert(int data)
    {
    	c=root;
    	Node new_node=new Node();
    	new_node.left=null;
    	new_node.data=data;
    	new_node.right=null;
    	return new_node;
    }
    
   void delete(Node c,int data)
   {
	   if(c.left==null && c.right==null)
	   {
		   return;
	   }
	   else
	   {
		   delete(c.left,data);
		   delete(c.right,data);
		   if(c.left.data==data)
		   {
			   c.left=null;
			   System.out.println("element deleted");
		   }
		   else if(c.right.data==data)
		   {
			   c.right=null;
			   System.out.println("element deleted");
		   }
		   else if(c==root)
		   {
			   System.out.println("the element isn't in the binary tree");
		   }
	   }
   }
   void traverse(Node c)
   {
   	if(c!=null)
   	{
   		System.out.println(c.data);
   	     traverse(c.left);
   	     traverse(c.right);
   	}
   }
}
public class Problem3 {

	public static void main(String[] args) {
		Delete obj=new Delete();
		obj.makeRoot(5);
	    obj.root.left=obj.insert(6);
	    obj.root.right=obj.insert(7);
	    obj.root.left.left=obj.insert(11);
	    obj.root.left.right=obj.insert(15);
	    obj.root.right.left=obj.insert(3);
	    obj.root.right.right=obj.insert(2);
        obj.delete(obj.root,15);
        obj.traverse(obj.root);

	}

}

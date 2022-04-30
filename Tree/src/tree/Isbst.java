package tree;

class isBst
{
	int max=0;
	int min=0;
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
    
    boolean IsBstUtil(Node c,int min,int max)
    {
    	if(c==null)
    	{
    		return true;
    	}
    	if(c.data>min && c.data<max && IsBstUtil(c.left,min,c.data) && IsBstUtil(c.right,c.data,max))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
   
}
public class Isbst {



	public static void main(String[] args) {
		isBst obj=new isBst();
		obj.makeRoot(9);
	    obj.root.left=obj.insert(6);
	    obj.root.left.left=obj.insert(5);
	    obj.root.left.right=obj.insert(7);
	    obj.root.right=obj.insert(11);
	    obj.root.right.right=obj.insert(16);
	     obj.root.right.left=obj.insert(4);
	   if(obj.IsBstUtil(obj.root,-1,100)==true)
	   {
		   System.out.println("bst");
	   }
	   else
	   {
		   System.out.println("not bst");
	   }
	}

}

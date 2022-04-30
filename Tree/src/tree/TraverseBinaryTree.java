package tree;

class Traversee
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
public class TraverseBinaryTree {

	public static void main(String[] args) {
		Traversee obj=new Traversee();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	    obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	    obj.root.right.left=obj.insert(6);
	    obj.root.right.right=obj.insert(7);
	   obj.traverse(obj.root);

	}

}

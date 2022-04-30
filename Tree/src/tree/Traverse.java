package tree;


class TraverseBinary
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
      
    void inorder(Node c)
    {
    	if(c!=null)
    	{
    		inorder(c.left);
    		System.out.println("Inorder:"+c.data);
    		inorder(c.right);
    	}
    }
    
    void preorder(Node c)
    {
    	if(c!=null)
    	{
    		System.out.println("Preorder:"+c.data);
    		preorder(c.left);
    		preorder(c.right);
    	}
    }
    
    void postorder(Node c)
    {
    	if(c!=null)
    	{
    		postorder(c.left);
    		postorder(c.right);
    		System.out.println("Postorder:"+c.data);
    	}
    }
   }
public class Traverse {

	public static void main(String[] args) {
		TraverseBinary obj=new TraverseBinary();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	    obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	    obj.root.right.left=obj.insert(6);
	    obj.root.right.right=obj.insert(7);
		obj.inorder(obj.root);
       obj.preorder(obj.root);
       obj.postorder(obj.root);
	}

}

package tree;

class FindAncestor
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
     
    boolean ancestor(Node c,int value)
    {
    	if(c==null)
    	{
    		return false;
    	}
    	if(c.data==value)
    	{
    		return true;
    	}
    	else if(ancestor(c.left,value)|| ancestor(c.right,value))
    	{
    		System.out.println(c.data);
    		return true;   		
    	}
    	return false;
    }
    
}
public class Problem7 {

	public static void main(String[] args) {
		FindAncestor obj=new FindAncestor();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	   obj.root.left.left=obj.insert(4);
	   obj.root.left.right=obj.insert(5);
	    obj.ancestor(obj.root,5);

	}

}

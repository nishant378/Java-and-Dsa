package tree;


class BinarytreeOperation
{
	Node root=new Node();
	
	int size=0;
	int ldepth=-1;
	int rdepth=-1;
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
    	size++;
    }
    
    Node insert(int data)
    {
    	c=root;
    	Node new_node=new Node();
    	new_node.left=null;
    	new_node.data=data;
    	new_node.right=null;
    	size++;
    	return new_node;
    }
    int height(Node c)
    {
    	if(c==null)
    		return -1;
    	else
    	{
    		int lb=height(c.left);
    		int rb=height(c.right);
    		
    		if(lb>rb)
    			return (lb+1);
    		else
    			return (rb+1);
       }
    }
    
    int depth(Node c)
    {
    	if(c==null)
    		return -1;
    	else
    	{
    		int lb=height(c.left);
    		int rb=height(c.right);
    		
    		if(lb>rb)
    			return (lb+1);
    		else
    			return (rb+1);
       }
    }
}
public class Operations {

	public static void main(String[] args) {
		BinarytreeOperation obj=new BinarytreeOperation();
		obj.makeRoot(10);
	    obj.root.left=obj.insert(2);
	  obj.root.right=obj.insert(6);
	     obj.root.left.left=obj.insert(3);
	    obj.root.left.right=obj.insert(4);
	    obj.root.left.right.right=obj.insert(5);
	    
	    
	 	   System.out.println("size:"+obj.size);
	
		System.out.println("height of the tree:"+obj.height(obj.root));
	System.out.println("depth of the tree:"+(obj.depth(obj.root)));
	}

}

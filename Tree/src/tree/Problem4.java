package tree;

class CheckFullNodes
{
	Node root=new Node();
	Node c=new Node();
	int count=0;
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
    
    void fullNodes(Node c)
    {
    	if(c==null)
    	{
    		return;
    	}
    	else
    	{
    		fullNodes(c.left);
    		fullNodes(c.right);
    		if(c.left!=null && c.right!=null)
    		{
    			count++;
    			System.out.println(c.data);
    		}
    	}
    }
}
public class Problem4 {

	public static void main(String[] args) {
		CheckFullNodes obj=new CheckFullNodes();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	    obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	    obj.root.right.left=obj.insert(6);
	    obj.root.right.right=obj.insert(7);
	   obj.fullNodes(obj.root);
	   System.out.println("count:"+obj.count);

	}

}

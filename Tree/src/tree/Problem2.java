package tree;



class Searching
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
    
    void search(Node c,int data)
    {
    	if(c==null)
    	{
    		return;
    	}
    	else
    	{
    		search(c.left,data);
    		search(c.right,data);
    		
    		if(c.data==data)
    		{
    			System.out.println("we found the data:"+data);
    			return;
    		}
    		else
    		{
    			System.out.println("we didn't find the data:"+data);
    			return;
    		}
    	}
    }
}
public class Problem2 {

	public static void main(String[] args) {
		Searching obj=new Searching();
		obj.makeRoot(5);
	    obj.root.left=obj.insert(6);
	    obj.root.right=obj.insert(7);
	    obj.root.left.left=obj.insert(11);
	    obj.root.left.right=obj.insert(15);
	 obj.root.right.left=obj.insert(3);
	    obj.root.right.right=obj.insert(2);
        obj.search(obj.root,7);
	}

}

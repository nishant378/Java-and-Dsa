package tree;

class LevelTraversal
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
    
    void PrintLevel(Node c)
    {
    	int height=height(root);
    	for(int i=0;i<=height;i++)
    	{
    		Traverse(root,i);
    	}
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
    void Traverse(Node c,int level)
    {
    	if(c==null)
    	{
    		return;
    	}
    	else if(level==0)
    	{
    		System.out.println(c.data);
    	}
    	else if(level>0)
    	{
    		Traverse(c.left,level-1);
    		Traverse(c.right,level-1);
    	}
    	
    }
  
}
public class LevelOrderTraversal {

	public static void main(String[] args) {
	 LevelTraversal obj=new LevelTraversal();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	    obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	    obj.root.right.left=obj.insert(6);
	    obj.root.right.right=obj.insert(7);
	  
	    obj.PrintLevel(obj.root);

	}

}

package tree;

class Max
{
	Node root=new Node();
	Node c=new Node();
	int max=0;
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
    
    int max(Node c)
    {
    	if(c!=null)
    	{
    		int mleft=max(c.left);
    		int mright=max(c.right);
            if(mleft>mright)
            {
            	max=mleft;
            }
            else 
            {
            	max= mright;
            }
            if(c.data>max)
            {
            	max=c.data;
            }
          
          
    	}
    	return max;
    }
}

public class Problem1 {

	public static void main(String[] args) {
	Max obj=new Max();
	obj.makeRoot(5);
    obj.root.left=obj.insert(6);
    obj.root.right=obj.insert(7);
    obj.root.left.left=obj.insert(11);
    obj.root.left.right=obj.insert(15);
    obj.root.right.left=obj.insert(3);
    obj.root.right.right=obj.insert(2);
     System.out.println(obj.max(obj.root));
	}

}

package tree;

class Mirror
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
    
    void BinaryMirror(Node c)
    {
    	Node temp;
    	if(c==null)
    	{
    		return;
    	}
    	else
    	{
    			BinaryMirror(c.left);
    			BinaryMirror(c.right);
    			temp=c.left;
    			c.left=c.right;
    			c.right=temp;
    	}
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
public class Problem6 {

	public static void main(String[] args) {                      
	  Mirror obj=new Mirror();                                                                            
		obj.makeRoot(1);                                                                           
	    obj.root.left=obj.insert(2);                                                                 
	    obj.root.right=obj.insert(3);                                                                        
	    obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	   
	    System.out.println("Simple");
	    obj.PrintLevel(obj.root);
	    obj.BinaryMirror(obj.root);
	    System.out.println("*****Mirror*****");
	    obj.PrintLevel(obj.root);
	}

}
                    

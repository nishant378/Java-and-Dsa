package tree;

class ZigZag
{
	Node root=new Node();
	Node c=new Node();
	int flag=0;
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
    
    void zigzag(Node c,int level,int flag)
    {
    	if(c==null) {
    		return;
    	}
    	if(level==1)
    	{
    		System.out.println(c.data);
    	}
    	else if(level>1 && flag==1)
    	{
    		zigzag(c.right,level-1,flag);
    		zigzag(c.left,level-1,flag);
    	}
    	else if(flag==0)
    	{
    		zigzag(c.left,level-1,flag);
    		zigzag(c.right,level-1,flag);
    	}
    }
    
    int height(Node c)
    {
    	if(c==null)
    	{
    		return 0;
    	}
    	else
    	{
    		int lh=height(c.left);
    		int rh=height(c.right);
    		if(lh>rh)
    		{
    			return lh+1;
    		}
    		else
    		{
    			return rh+1;
    		}
    	}
    }
    
    void PrintLevel(Node c)
    {
    	if(c==null)
    	{
    		return;
    	}
    	else
    	{
    		int height=height(root);
    		for(int i=1;i<=height;i++)
    		{
    			if(i%2==0)
    			{
    				flag=1;
    			}
    			else
    			{
    				flag=0;
    			}
    			zigzag(root,i,flag);
    		}
    	}
    }
}
public class Problem9 {

	public static void main(String[] args) {
		ZigZag obj=new ZigZag();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	    obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	    obj.root.right.left=obj.insert(6);
	    obj.root.right.right=obj.insert(7);
	    obj.root.right.right.right=obj.insert(15);
	    obj.root.left.left.left=obj.insert(8);
         obj.PrintLevel(obj.root);
	}

}

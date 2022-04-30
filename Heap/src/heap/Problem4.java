package heap;

//check binary tree that, Is it heap(max) or not
class Checkheap
{
	int flag=0;
	int flag2=0;
	int n=0;
	int p=0;
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
    
    void checkdata(Node c)
    {
    	if(c==null)
    	{
    		return;
    	}
    	else
    	{
    	    checkdata(c.left);
    	    checkdata(c.right);
    	    if(c.left!=null && c.right!=null)
    	    {
    	    	if(c.left.data>c.data)
    	    	{
    	    	  	flag=1;
    	    	}
    	    	if(c.right.data>c.data)
    	    	{
    	    		flag=1;
    	    	}
    	    }
    	    else if(c.left!=null)
    	    {
    	    	if(c.left.data>c.data)
    	    	{
    	    		flag=1;
    	    	}
    	    }
    	    else if(c.right!=null)
    	    {
    	    	if(c.right.data>c.data)
    	    	{
    	    		flag=1;
    	    	}
    	    }
    	}
    	
    	if(c==root && flag==1)
    	{
    		System.out.println("it isn't max heap");
    	}
    	else if(c==root && flag==0)
    	{
    		System.out.println("it's max heap");
    	}
    }
    
    void check(Node c)
    {
    	int height=height(root);
    	for(int i=0;i<=height;i++)
    	{
    		checkcomplete(root,i);
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
    void checkcomplete(Node c,int level)
    {
    	if(c==null)
    	{
    		return;
    	}
    	else if(level==0)
    	{
    		if(c.left==null) 
    		{
    			flag2=1;
    			if(c.right!=null)
    			{
    			    p=1;
    			    System.out.println("c.data:"+c.data);
    			    System.out.println("it isn't a completely binary tree");
    			}
    		}
    		if(c.right==null)
    		{
    			flag2=1;  		
    		}
    		if(n==1)
    		{   			
    			if(c.left!=null)
    			{
    				p=1;
    				 System.out.println("c.data:"+c.data);
     			    System.out.println("it isn't a completely binary tree");
    			}
    			if(c.right!=null)
    			{
    				p=1;
    				 System.out.println("c.data:"+c.data);
     			    System.out.println("it isn't a completely binary tree");
    			}
    		}
    		if(flag2==1)
    		{
    			n=1;
    		}
    	}
    	else if(level>0)
    	{
    		checkcomplete(c.left,level-1);
    		checkcomplete(c.right,level-1);
    	}
    	
    }
}
public class Problem4 {

	public static void main(String[] args) {
		Checkheap obj=new Checkheap();
		         obj.makeRoot(88);
		      obj.root.left=obj.insert(78);
		       obj.root.right=obj.insert(77);
		   obj.root.left.left=obj.insert(61);
		    obj.root.left.right=obj.insert(66);
		
		    obj.check(obj.root);
		    if(obj.p!=1)
		    {
		    obj.checkdata(obj.root);
		    }
		    

	}

}

package tree;


class CheckMirror
{
	Node root=new Node();
	Node root2=new Node();
	Node c=new Node();
	Node c2=new Node();
	int flag=0;
    class Node
    {
	    Node left;
	    int data;
	    Node right;
    }
    void makeRoot1(int data)
    {
    	root.left=null;
    	root.data=data;
    	root.right=null;
    	c=root;
    }    
    Node insert1(int data)
    {
    	c=root;
    	Node new_node=new Node();
    	new_node.left=null;
    	new_node.data=data;
    	new_node.right=null;
    	return new_node;
    }
    void makeRoot2(int data)
    {
    	root2.left=null;
    	root2.data=data;
    	root2.right=null;
    	c2=root2;
    }  
    Node insert2(int data)
    {
    	c2=root2;
    	Node new_node=new Node();
    	new_node.left=null;
    	new_node.data=data;
    	new_node.right=null;
    	return new_node;
    }
    void checkMirror(Node c1,Node c2)
    {
    	if(c1==null && c2==null)
    	{
    		return;
    	}
    	if(c1==null || c2==null)
    	{
    	    flag=1;
    		return;
    	}
    	else
    	{
    		checkMirror(c1.left,c2.right);
    		checkMirror(c1.right,c2.left);
    		if( c1==root && c2==root2 && flag==0)
    		{
    			System.out.println("true");
    		}
    		else if(c1==root && c2==root2)
    		{
    			System.out.println("false");
    		}
    	}
    }
    
}
public class Problem8 {

	public static void main(String[] args) {
		CheckMirror obj=new CheckMirror();
		obj.makeRoot1(1);                                                                           
	    obj.root.left=obj.insert1(2);                                                                 
	    obj.root.right=obj.insert1(3);                                                                        
	    obj.root.left.left=obj.insert1(4);
	    obj.root.left.right=obj.insert1(5);
	    
	    obj.makeRoot2(1);
	    obj.root2.left=obj.insert2(3);
	    obj.root2.right=obj.insert2(2);
	    obj.root2.right.left=obj.insert2(5);
	    obj.root2.right.right=obj.insert2(4);
	    obj.checkMirror(obj.root,obj.root2);
	    
	}

}

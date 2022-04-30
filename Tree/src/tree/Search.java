package tree;

class BTSearch
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
    
    void search(int data,Node c)
    {
    	if(c.data==data) {
    		System.out.println("found:"+data);
    		flag=1;
    		return;
    	}
    	if(c.left!=null)
    	{
    		search(data,c.left);
    	}
    	if(c.right!=null)
    	{
    		search(data,c.right);
    	}
    	if(flag==0 && c==root)
    	{
    		System.out.println("not found:"+data);
    	}
    }
}

public class Search {

	public static void main(String[] args) {
		BTSearch obj=new BTSearch();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	   obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	    obj.root.right.left=obj.insert(6);
	    obj.root.right.right=obj.insert(7);
	    obj.root.right.left.left=obj.insert(8);
	  obj.search(5,obj.root);
	

	}

}

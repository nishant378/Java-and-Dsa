package tree;

class SumOfAllNodes
{
	int sum=0;
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
      
    void  SumOfTree(Node c)
    {
    	if(c==null)
    	{
    		return;
    	}
    	else
    	{
    		SumOfTree(c.left);
    		SumOfTree(c.right);
    		sum=sum+c.data;
    	}
    }
}
public class Problem5 {

	public static void main(String[] args) {
	SumOfAllNodes obj=new SumOfAllNodes();
	obj.makeRoot(1);
    obj.root.left=obj.insert(2);
    obj.root.right=obj.insert(3);
 
    obj.SumOfTree(obj.root);
    System.out.println("sum is:"+obj.sum);
	}

}

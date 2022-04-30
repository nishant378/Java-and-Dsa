package tree;

class BinaryTree
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
}
public class BinaryTreeInsertion {

	public static void main(String[] args) {
		BinaryTree obj=new BinaryTree();
		obj.makeRoot(1);
	    obj.root.left=obj.insert(2);
	    obj.root.right=obj.insert(3);
	    obj.root.left.left=obj.insert(4);
	    obj.root.left.right=obj.insert(5);
	    obj.root.right.left=obj.insert(6);
	    obj.root.right.right=obj.insert(7);
	    obj.root.right.left=null;//delete 6
		System.out.println(obj.root.data);
		System.out.println(obj.root.left.data);
		System.out.println(obj.root.right.data);
		System.out.println(obj.root.left.left.data);
		System.out.println(obj.root.left.right.data);
		//System.out.println(obj.root.right.left.data);delete 6
	   System.out.println(obj.root.right.right.data);

	}

}

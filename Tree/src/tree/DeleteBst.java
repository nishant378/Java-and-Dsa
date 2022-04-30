package tree;


class DeleteBstree
{
	Node root=new Node();
	Node c=new Node();
	class Node 
	{
		Node left;
		int data;
		Node right;
	}
	void makingRoot(int data)
	{
		root.left=null;
		root.data=data;
		root.right=null;
		c=root;
	}
	void  insert(Node c,int data)
	{
			if(c==null)
			{
				return ;
			}
			else  if(c.data>data)
			      {
				       if(c.left!=null)
				       {
				    	   insert(c.left,data);
				       }
				       else
				       {
				    	   Node newnode=new Node();
				    	   newnode.left=null;
				    	   newnode.data=data;
				    	   newnode.right=null;
				    	   c.left=newnode;
				       }
				  }
			else if(c.data<data)
				{
				    if(c.right!=null)
				    {
				    	insert(c.right,data);
				    }
				    else
				    {
				    	Node newnode=new Node();
				    	newnode.left=null;
				    	newnode.data=data;
				    	newnode.right=null;
				    	c.right=newnode;
				    }
				
					}
			
	 }
	     int CountChild(Node c)
	     {
	    	 if(c.left!=null && c.right==null)
	    	 {
	    		 return 1;
	    	 }
	    	 else if(c.right!=null && c.left==null)
	    	 {
	    		 return 11;
	    	 }
	    	 else if(c.left!=null && c.right!=null)
	    	 {
	    		 return 2;
	    	 }
	    	 else
	    	 {
	    		 return 0;
	    	 }
	     }
	     
	     void delete(Node c,int target)
	     {
	    	 if(c==null)
	    	 {
	    		 return;
	    	 }
	    	 else
	    	 {
	    		 if(c.data<target && c.right!=null)
	    		 {
	    			   if(c.right.data==target)
	    			   {
	    				   int temp=CountChild(c.right);
	    				   if(temp==0)
	    				   {
	    					   c.right=null;
	    				   }
	    				   else if(temp==1)
	    				   {
	    					    c.right=c.right.right;
	    				   }
	    				   else if(temp==11)
	    				   {
	    					   c.right=c.right.right;
	    				   }
	    				   else if(temp==2)
	    				   {
	    					  Node t= c.right.left;
	    					   c.right=c.right.right;
	    					   c.right.left=t;
	    				   }
	    			   }
	    			   else
	    			   {
	    				   delete(c.right,target);
	    			   }
	    		 }
	    		 else if(c.data>target && c.left!=null)
	    		 {
	    			 if(c.left.data==target)
	    			 {
	    				 int temp=CountChild(c.left);
	    				 if(temp==0)
	    				 {
	    					 c.left=null;
	    				 }
	    				 else if(temp==1)
	    				 {
	    					 c.left=c.left.left;
	    				 }
	    				 else if(temp==11)
	    				 {
	    					 c.left=c.left.right;
	    				 }
	    				 else if(temp==2)
	    				 {
	    					 Node t=c.right.left;
	    					 c.left=c.left.right;
	    					 c.left.left=t;
	    				 }
	    			 }
	    			 else
	    			 {
	    				 delete(c.left,target);
	    			 }
	    		 }
	    	 }
	     }
	     void traverse(Node c)
	     {
	     	if(c!=null)
	     	{
	     	     traverse(c.left);
	     	     traverse(c.right);
	     	    System.out.println(c.data);
	     	}
	     }
	
}
public class DeleteBst {

	public static void main(String[] args) {
		
		DeleteBstree obj=new DeleteBstree();
		  obj.makingRoot(5);
		 obj.insert(obj.root,3);
	      obj.insert(obj.root,2);
	      obj.insert(obj.root,8);
	      obj.insert(obj.root,6);
	      obj.insert(obj.root,11);
	      System.out.println("before");
	      obj.traverse(obj.root);
	      obj.delete(obj.root,8);
	      System.out.println("after");
            obj.traverse(obj.root);
	}

}

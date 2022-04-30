package tree;

class AvlTree 
{	
	Node root=new Node();
	Node c=new Node();
	Node temp;
	int j=-1;
	int currentdata=0;
	int flag=0;
	String a[]=new String[2];
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
		flag=1;
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
		currentdata=data;
		
		height(root);
	
	}
	void  Print(Node c)
	{
		if(c!=null)
		{
			
			Print(c.left);
			Print(c.right);
			System.out.println("data:"+c.data);
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
		    	int lb=height(c.left);
		    	int	 rb=height(c.right);
		    
		         balancefactor(c,lb,rb);
		         
		    		if(lb>rb)
		    		{
		    			return lb+1;
		    		}
		    		else
		    		{
		    			return rb+1;
		    		}
		    		
		       }
		    }
		    
		   void balancefactor(Node c,int lb,int rb)
		    {	    	
			    int balancefactor=lb-rb;
			    int bf=Math.abs(balancefactor);
			    if(bf+1==1 || bf+1==2)
			    {
			    	System.out.println("Balanced"+c.data);
			    }
			    else
			    {
			    	System.out.println("unbalanced:"+c.data);
			    	if(flag==1)
			    	{
			    	checkRotation(c);
			    	}
			    }
			   
		    }
		   
		void  MainNode(Node c,int data)
		   {
			   if(c==null)
			   {
				   return ;
			   }
			   else 
			   {
				   if(c.left!=null && c.left.data==data)
				   {
					   temp=c;
					   return;
				   }
				   else if(c.right!=null && c.right.data==data)
				   {
					   temp=c;
					   return;
				   }
				   else if(data<c.data)
				   {
					   MainNode(c.left,data);
				   }
				   else if(data>c.data)
				   {
					   MainNode(c.right,data);
				   }
			   }
		   }
		
		void findRotation(Node c,int data)
		{
			if(c==null && j==1)
			{
				return;
			}
			else if(j!=1)
			{
				if(data>c.data)
				{
					j++;
					a[j]="r";
					findRotation(c.right,data);
				}
				else if(data<c.data)
				{
					j++;
					a[j]="l";
					findRotation(c.left,data);
				}
			}
			j=-1;
		}
		
           void checkRotation(Node c)
	       {
        	   flag=0;
	    	findRotation(c,currentdata);
	    	System.out.println("a[0]:"+a[0]);
	    	System.out.println("a[1]:"+a[1]);
	    	if(a[0]=="r" && a[1]=="r")//right-right
	    	{
	    		System.out.println("right-right");
	    		if(c==root)
	    		{    		
	    		Node x=c.right;
	    		c.right=x.left;
	    		x.left=c;
	    		
	    	     root=x;
	    		}
	    		else if(c!=root)
	    		{
	    		   Node x=c.right;
	    		   c.right=x.left;
	    		   x.left=c;
	    		   MainNode(root,c.data);
	    		   if(temp.data>c.data)
	    		   {
	    			   temp.left=x;
	    		   }
	    		   else if(temp.data<c.data)
	    		   {
	    			   temp.right=x;
	    		   }
	    		}
	    	}
	    	else if(a[0]=="l" && a[1]=="l")//left-left
	    	{
	    		System.out.println("left-left");
	    		if(c!=root)
	    		{
	    	        Node w=c.left;
	    	        c.left=w.right;
	    	        w.right=c;
	    	    	MainNode(root,c.data);
	    		   	if(temp.data>c.data)
	    		   	{
	    		   		temp.left=w;	
	    		   	}
	    		   	else if(temp.data<c.data)
	    		   	{
	    		   		temp.right=w;
	    		   	}
	    		}
	    		
	    		else if(c==root)
	    		{
	    			Node w=c.left;
	    			c.left=w.right;
	    			w.right=c;
	    			root=w;
	    		}
	    	}
	    	else if(a[0]=="r" && a[1]=="l")//right-left
	    	{
	    		System.out.println("right left");
	    		if(c!=root)
	    		{
	    		      Node c1=c.right;
	    		      Node w=c1.left;
	    		      c1.left=w.right;
	    		      w.right=c1;
	    		      
	    		      c.right=w;
	    		       Node x=c.right;
	    		       c.right=x.left;
	    		       x.left=c;
	    		   	MainNode(root,c.data);
	    		   	if(temp.data>c.data)
	    		   	{
	    		   		temp.left=x;	
	    		   	}
	    		   	else if(temp.data<c.data)
	    		   	{
	    		   		temp.right=x;
	    		   	}
	    		   
	    		}
	    		else if(c==root)
	    		{
	    			Node c1=c.right;
	    			Node w=c1.left;
	    			c1.left=w.right;
	    			w.right=c1;
	    			
	    			c.right=w;
	    			Node x=c.right;
	    			c.right=x.left;
	    			x.left=c;
	    			root=x;
	    		}
	    	}
	    	else if(a[0]=="l" && a[1]=="r")//left-right
	    	{
	    		System.out.println("left right");
	    		if(c==root)
	    		{
	    		Node c1=c.left;
	    		Node x=c1.right;
	    		c1.right=x.left;
	    		x.left=c1;
	    		c.left=x;
	    		
	    		Node w=c.left;
	    		c.left=w.right;
	    		w.right=c;
	    		c=w;
	    		root=c;
	    		}
	    		
	    		else if(c!=root)
	    		{
	    			Node c1=c.left;
		    		Node x=c1.right;
		    		c1.right=x.left;
		    		x.left=c1;
		    		c.left=x;
		    		
		    		Node w=c.left;
		    		c.left=w.right;
		    		w.right=c;
		    		MainNode(root,c.data);
	    		   	if(temp.data>c.data)
	    		   	{
	    		   		temp.left=w;	
	    		   	}
	    		   	else if(temp.data<c.data)
	    		   	{
	    		   		temp.right=w;
	    		   	}
	    		}
	    	}
	    }
}
public class Avltree {

	public static void main(String[] args) {
		  AvlTree obj=new AvlTree();
         obj.makingRoot(27);
     obj.insert(obj.root,13);
     obj.insert(obj.root,11);
     obj.insert(obj.root,15);
     obj.insert(obj.root,12);
     obj.insert(obj.root,2);
     obj.insert(obj.root,3);
     obj.insert(obj.root,19);
        System.out.println("root:"+obj.root.data);
      
       obj.Print(obj.root);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	}

}

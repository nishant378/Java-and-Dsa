package linkedlist;



class InsertCircle
{
	Node c=new Node();
	Node start=new Node();
	int count=1;
	class Node
	{
		int data;
		Node next;
	}
	void firstdata(int data)
	{		
		start.data=data;
		start.next=null;
		c=start;
	}
	void enterdata(int data)
	{
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=start;
		c.next=newnode;
		c=c.next;
	}
	void display()
	{
		c=start;
		while(true)
		{
			if( c!=null && c.next!=start)
			{
				System.out.println(c.data);
				c=c.next;
			}
			else if(c!=null)
			{
				System.out.println(c.data);
				return;
			}
		}
	}
	
	void insert(int data,int position)
	{
		c=start;
		if(position==1)
		{
			Node newnode=new Node();
			newnode.data=data;
			newnode.next=start;
			while(c.next!=start)
			{
				c=c.next;
			}
			c.next=newnode;
			start=newnode;
		}
		else
		{
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=null;
		 c=start;
		 while(true)
		 {
			 if(count<position-1)
			 {
				 if(c.next==start) 
				 {
					 System.out.println("we  can't insert");
					 return;
				 }
				 else
				 {
				 c=c.next;
				 count++;
				 }
			 }
			 else if(count!=position)
			 {
				 Node nextnode=new Node();
				 nextnode=c.next;
				 c.next=new_node;
				 c=c.next;
				 c.next=nextnode;
				 c=nextnode;
				 return;
			 }
			 else
			 {
				 System.out.println("we  can't insert");
				 return;
			 }
		 }
	}
	}
}
public class InsertCir {

	public static void main(String[] args) {
	   InsertCircle obj=new InsertCircle();
	   obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
		obj.insert(50,3);
			obj.display();	

	}

}

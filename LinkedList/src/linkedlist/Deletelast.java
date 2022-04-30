package linkedlist;

class DeleteLast
{
	Node c=new Node();
	Node start=new Node();
	Node p=new Node();
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
		newnode.next=null;
		c.next=newnode;
		c=c.next;
	}
	void display()
	{
		c=start;
		while(c!=null)
		{
			System.out.println(c.data);
			c=c.next;
		}
	}
	
	void deletelast()
	{
		c=start;		
		p=start;
		while(true)
		{
		if(c.next!=null)
		{
			p=c;
			c=c.next;		    
		}
		else
		{
			p.next=null;
			c=p;
			return;
		}
		}
	}
}
public class Deletelast {

	public static void main(String[] args) {
		DeleteLast obj=new DeleteLast();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
		System.out.println("Data Before deleted:");
		obj.display();
		System.out.println("Data after deleted:");
		obj.deletelast();
			obj.display();	

	}

}

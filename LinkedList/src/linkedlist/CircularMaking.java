package linkedlist;

class Circular
{
	Node c=new Node();
	Node start=new Node();
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
}
public class CircularMaking {

	public static void main(String[] args) {
		Circular obj=new Circular();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
		obj.enterdata(4);
		obj.enterdata(5);
			obj.display();	

	}

}

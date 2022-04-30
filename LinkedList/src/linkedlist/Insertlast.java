package linkedlist;



class InsertLast
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
	
	void insertlast(int data)
	{
		c=start;
		while(true)
		{
			if(c.next!=null)
			{
				c=c.next;
			}
			else
			{
			   Node new_node=new Node();
			   new_node.data=data;
			   new_node.next=null;
			   c.next=new_node;
			   c=c.next;
			   return;
			}
		}
	}
}
public class Insertlast {

	public static void main(String[] args) {
		InsertLast obj=new InsertLast();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
	obj.insertlast(12);
			obj.display();	

	}

}

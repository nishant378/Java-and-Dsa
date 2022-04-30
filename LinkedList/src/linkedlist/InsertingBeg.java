package linkedlist;


class InsertBeg
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
	void insertBeg(int data)
	{
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=start;
		start=new_node;
	}
}
public class InsertingBeg {

	public static void main(String[] args) {
		InsertBeg obj=new InsertBeg();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
			obj.insertBeg(50);
			obj.display();	
	}

}

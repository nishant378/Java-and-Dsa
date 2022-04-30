package linkedlist;

class doublyLinklist
{
	Node start=new Node();
	Node c=new Node();
	class Node
	{
		Node prev;
		int data;
		Node next;
	}
	
	void firstdata(int data)
	{
		start.prev=null;
		start.data=data;
		start.next=null;
		c=start;
	}
	
	void enterdata(int data)
	{
		Node newnode=new Node();
		newnode.prev=c;
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
}
public class DoublyCreation {

	public static void main(String[] args) {
		doublyLinklist obj=new doublyLinklist();
		obj.firstdata(1);
		obj.enterdata(2);
		obj.enterdata(3);
		obj.enterdata(4);
		obj.display();

	}

}

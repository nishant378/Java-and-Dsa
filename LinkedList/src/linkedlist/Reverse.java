package linkedlist;



class ReverseLinkedList
{
	Node c=new Node();
	Node p=new Node();
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
	void reverse()
	{
           Node Next=new Node();
		p=null;
		c=start;
		while(c!=null)
		{
			Next=c.next;
			c.next=p;
			p=c;
			c=Next;
		}
		start=p;
		
	}
}
public class Reverse {

	public static void main(String[] args) {
		ReverseLinkedList obj=new ReverseLinkedList();
		obj.firstdata(1);	
	    obj.enterdata(2);
	    obj.enterdata(3);
	    obj.enterdata(4);
	    obj.enterdata(5);
		
		
		obj.reverse();
		
			obj.display();	

	}

}

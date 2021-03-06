package linkedlist;


class SortInsert
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
	
	void insert(int data)
	{
		c=start;
		p=start;
		while(c!=null)
		{
			if(c.data<=data)
			{
				p=c;
				c=c.next;
			}
			else if(data>start.data)
			{
				Node newnode=new Node();
				newnode.data=data;
				newnode.next=null;
				p.next=newnode;
				p=newnode;
				p.next=c;
				return;
			}
			else
			{
				Node newnode=new Node();
				newnode.data=data;
				newnode.next=start;
				start=newnode;
				return;
			}
			
		}
		if(p.next==null)
		{
			Node newnode=new Node();
			newnode.data=data;
			newnode.next=null;
			p.next=newnode;
			p=newnode;
			return;
		}
	}
	
}
public class Problem3 {

	public static void main(String[] args) {
	      SortInsert obj=new SortInsert();
	  	obj.firstdata(10);	
		obj.enterdata(20);
		obj.enterdata(30);
		obj.enterdata(40);
		obj.enterdata(70);
		obj.insert(33);
		obj.display();	

	}

}

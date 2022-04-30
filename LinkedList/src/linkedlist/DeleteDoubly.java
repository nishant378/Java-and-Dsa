package linkedlist;

class Deletedoubly
{
	Node start=new Node();
	Node c=new Node();
	Node p=new Node();
	int count=1;
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
	void delete(int position)
	{
		if(position==1)
		{
			start=start.next;
			c.next=null;
		}
		else
		{
			p=start;
			c=start;
			while(true)
			{
				if(count<position-1 && c.next!=null)
				{
					p=p.next;
					c=c.next;
					count++;
				}
				else if(c.next!=null)
				{
					c=c.next;
					p.next=c.next;
					if(p.next!=null)
					{
					c=c.next;
					}
					c.prev=p;
					//c.next=null;
					return;
				}
				else
				{
					System.out.println("we can't delete");
					return;
				}
			}
		}
	}
	
	}
public class DeleteDoubly {

	public static void main(String[] args) {
		Deletedoubly obj=new Deletedoubly();
		obj.firstdata(1);
		obj.enterdata(2);
		obj.enterdata(3);
		obj.enterdata(4);
		obj.delete(2);
		obj.display();

	}

}

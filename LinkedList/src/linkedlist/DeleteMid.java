package linkedlist;


class Deletemid
{
	Node p=new Node();
	Node c=new Node();
	int count=1;
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
	
	void deletemid(int position)
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
					c.next=null;
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
public class DeleteMid {

	public static void main(String[] args) {
		Deletemid obj=new Deletemid();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
		obj.enterdata(4);
		obj.enterdata(5);
		obj.enterdata(6);
		obj.deletemid(2);
			obj.display();	
	}

}

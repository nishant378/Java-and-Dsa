package linkedlist;


class Deletecir
{
	Node c=new Node();
	Node start=new Node();
	int count=1;
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
	
	void delete(int position)
	{
		if(position==1)
		{
			while(c.next!=start)
			{
				c=c.next;
			}
			start=start.next;
			c.next=start;
		}
		else
		{
			p=start;
			c=start;
			while(true)
			{
				if(count<position-1 && c.next!=start)
				{
					p=p.next;
					c=c.next;
					count++;
				}
				else if(c.next!=start)
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
public class DeleteCir {

	public static void main(String[] args) {
		Deletecir obj=new Deletecir();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
		obj.delete(2);
			obj.display();	
		
	}

}

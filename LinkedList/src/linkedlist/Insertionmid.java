package linkedlist;


class MidInsertion
{
	int count=1;
	Node start=new Node();
	Node c=new Node();
	Node p=new Node();
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
	
	void midInsertion(int data,int position)
	{
		Node new_node=new Node();
		new_node.prev=null;
		new_node.data=data;
		new_node.next=null;
		c=start;
		if(position==1)
		{
			Node newnode=new Node();
			newnode.prev=null;
			newnode.data=data;
			newnode.next=start;
			start=newnode;
		}
		else
		{
		while(true)
		{
			if(count<position)
			{
				if(c.next!=null)
				{
				p=c;
				c=c.next;
				count++;
				}
				else if(c!=null && count+1==position)
				{
					Node node=new Node();
					node.prev=null;
					node.data=data;
					node.next=null;
					node.prev=c;
					c.next=node;
					return;
				}
				else
				{
					System.out.println("we can't insert");
					return;
				}
			}	
			else if(c!=null)
			{
				new_node.prev=p;
			     new_node.next=c;
			     c.prev=new_node;
				p.next=new_node;			
				return;				
			}
		
		}
		}
	}
}
public class Insertionmid {

	public static void main(String[] args) {
        MidInsertion obj=new MidInsertion();
		obj.firstdata(1);
		obj.enterdata(2);
		obj.enterdata(3);
		obj.enterdata(4);
		obj.enterdata(5);
		obj.midInsertion(50,7);
		obj.display();

	}

}

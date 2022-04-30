package linkedlist;



class MidLink
{
	int mid=0;
	Node c=new Node();
	Node start=new Node();
	int count=0;
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
		count=1;
	}
	void enterdata(int data)
	{
		count++;
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
	void mid()
	{	
		if(count==1)
		{
			mid=1;
			System.out.println(start.data);
		}
		else
		{
			mid=(count/2)+1;
			c=start;
			int temp=1;
			while(true)
			{
			if(c!=null && temp<mid)
			{
				c=c.next;
				temp++;
			}
			else
			{
				System.out.println("Mid data:"+c.data);
				return;
			}
			}
		}
	}
}
public class Problem5 {

	public static void main(String[] args) {
		MidLink obj=new MidLink();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
		obj.mid();
			obj.display();	
		    System.out.println("count:"+obj.count);

	}

}

package linkedlist;

class MakingStack
{
	int top=0;
	Node start=new Node();
	Node c=new Node();
	Node p=new Node();
	class Node
	{
		int data;
		Node next;
	}
	
	void push(int data)
	{
		if(top==0)
		{
			start.data=data;
			start.next=null;
			c=start;
			top++;
		}
		else
		{
			c=start;
			Node newnode=new Node();
			newnode.data=data;
			newnode.next=null;
			while(c.next!=null)
			{
				c=c.next;
			}
			c.next=newnode;
			c=newnode;
			top++;
		}
	}
	
	void display()
	{
		c=start;
		while(c!=null && top!=0)
		{
			System.out.println("data:"+c.data);
			c=c.next;
		}
	}
	
	void pop()
	{
		if(top==0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
		c=start;
		p=start;
		while(c.next!=null)
		{
			p=c;
			c=c.next;
		}
		p.next=null;
		top--;
		}
	}
	
}
public class Problem1 {

	public static void main(String[] args) {
	MakingStack obj=new MakingStack();
    obj.push(1);
   obj.pop();
   obj.pop();
   obj.push(3);
   obj.display();
    System.out.println("top:"+obj.top);
	}

}

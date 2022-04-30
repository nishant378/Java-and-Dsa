package linkedlist;

//Merge list
class MergeList
{
		Node c1=new Node();
	Node start1=new Node();
	
	Node c2=new Node();
	Node start2=new Node();
	class Node
	{
		int data;
		Node next;
	}
	void firstdata1(int data)
	{		
		start1.data=data;
		start1.next=null;
		c1=start1;
	}
	void enterdata1(int data)
	{
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=null;
		while(c1.next!=null)
		{
			c1=c1.next;
		}
		c1.next=newnode;
		c1=c1.next;
	}
	void display1()
	{
		c1=start1;
		while(c1!=null)
		{
			System.out.println("First List:"+c1.data);
			c1=c1.next;
		}
	}
 
	void firstdata2(int data)
	{		
		start2.data=data;
		start2.next=null;
		c2=start2;
	}
	void enterdata2(int data)
	{
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=null;
		while(c2.next!=null)
		{
			c2=c2.next;
		}
		c2.next=newnode;
		c2=c2.next;
	}
	void display2()
	{
		c2=start2;
		while(c2!=null)
		{
			System.out.println("Second List:"+c2.data);
			c2=c2.next;
		}
	}
	
	void merge(int data)
	{
		c1=start1;
		c2=start2;
		while(c1.next!=null)
		{
			c1=c1.next;
		}
		while(c2.next!=null)
		{
			c2=c2.next;
		}
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=null;
		c1.next=new_node;
		c2.next=new_node;
		c1=new_node;
		c2=new_node;
	}
	
	void find()
	{
		c1=start1;
		c2=start2;
		while(true)
		{
		if(c1!=null)
		{
			if(c1==c2)
			{
				System.out.println("this is the data where it's merged:"+c1.data);
				return;
			}
			else if(c2.next!=null)
			{
				c2=c2.next;
			}
			else
			{
				c1=c1.next;
				c2=start2;
			}
		}
		else
		{
			System.out.println("there is no merging between the list");
			return;
		}
	
		}
	}
}
public class Problem4 {

	public static void main(String[] args) {
	
	MergeList obj=new MergeList();
		obj.firstdata1(1);	
		obj.enterdata1(2);
	
		obj.firstdata2(1);
		obj.enterdata2(2);
		obj.enterdata2(3);
	
		obj.merge(50);
		obj.enterdata1(500);
		obj.find();
	obj.display1();
	obj.display2();
		
           

	}

}

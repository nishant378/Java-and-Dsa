package linkedlist;



class SearchingLink
{
	Node c=new Node();
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
	
	void search(int search)
	{
		c=start;
		while(c!=null)
		{
		if(c.data==search)
		{
	          System.out.println("found");
	          return;
		}
		else
		{
			c=c.next;
		}
		}
		
		if(c==null)
		{
			System.out.println("Not found");
		}
	}
}
public class Searching {

	public static void main(String[] args) {
		SearchingLink obj=new SearchingLink();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
	obj.search(2);
			obj.display();	

	}

}

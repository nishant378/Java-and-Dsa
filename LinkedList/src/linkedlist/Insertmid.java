package linkedlist;

class InsertMid
{
	Node c=new Node();
	Node start=new Node();
	int count=1;
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
	
	void insertmid(int data,int position)
	{
		if(position==1)
		{
			Node new_node=new Node();
			new_node.data=data;
			new_node.next=start;
			start=new_node;
		}
		else
		{
		Node new_node=new Node();
		new_node.data=data;
		new_node.next=null;
		 c=start;
		 while(true)
		 {
			 if(count<position-1)
			 {
				 if(c==null) 
				 {
					 System.out.println("we can't insert");
					 return;
				 }
				 else
				 {
				 c=c.next;
				 count++;
				 }
			 }
			 else if(c!=null)
			 {
				 Node nextnode=new Node();
				 nextnode=c.next;
				 c.next=new_node;
				 c=c.next;
				 c.next=nextnode;
				 c=nextnode;
				 return;
			 }
			 else
			 {
				 System.out.println("we can't insert");
				 return;
			 }
		 }
		}
	}
}
public class Insertmid {

	public static void main(String[] args) {
		InsertMid obj=new InsertMid();
		obj.firstdata(1);	
		obj.enterdata(2);
		obj.enterdata(3);
		obj.enterdata(4);
		obj.enterdata(5);
		obj.enterdata(6);
		obj.enterdata(7);
		obj.insertmid(50,5);
			obj.display();	

	}

}

package ds;
import java.util.Scanner;;

class Node
{
	int data;
	Node node;
	Node newnode;
    void create(int n)
    {
	System.out.println("Enter data of first node:");
	Scanner obj1=new Scanner(System.in);
	int b=obj1.nextInt();
	data=b;
	this.node=null;
	
	for(int i=2;i<=n;i++)
	{
		System.out.printf("Enter %d node data",i);
		int c=obj1.nextInt();
		this.node=newnode;
		data=c;
		this.newnode=null;
	}
	obj1.close();
     }
    void display()
    {
        
    }
}
public class Linklist {

	public static void main(String[] args) {
		System.out.println("hello");
		Node obj=new Node();
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter amount of node:");
		int a=obj1.nextInt();
		

	obj.create(a);
	obj.display();
    obj1.close();
	}

}

package revision;

class C extends Thread
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("thread A:"+i);
		}
	}
}
class D extends Thread
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("thread B:"+i);
		}
	}
}
public class Program2 {

	public static void main(String[] args) {
		
	Thread obj=new C();
	Thread obj1=new D();
		
		obj.start();
		obj1.start();
	   
	      

	}

}

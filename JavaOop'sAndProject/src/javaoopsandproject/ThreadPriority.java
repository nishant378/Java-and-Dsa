package javaoopsandproject;

class Q implements Runnable 
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("thread Q:"+i);
		}
	}
}
class R implements Runnable
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("thread R:"+i);
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		Thread obj=new Thread(new Q());
		Thread obj1=new Thread(new R());
		obj.setPriority(8);
		obj1.setPriority(3);
		obj.start();
		obj1.start();

	}

}

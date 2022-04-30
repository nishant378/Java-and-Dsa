package threads;
class Y implements Runnable
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("Thread A:"+i);
		}
	}
}
class X implements Runnable
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("Thread B:"+i);
		}
	}
}
public class Priority {

	public static void main(String[] args) {
		Runnable obj=new Y();
		Runnable obj1=new X();
		Thread t1=new Thread(obj);
	     Thread t2 =new Thread(obj1);
	     t1.setPriority(9);
	     t2.setPriority(1);
	    System.out.println(t1.getPriority()); 
	    System.out.println(t2.getPriority());
	     t1.start();
	     t2.start();


	}

}

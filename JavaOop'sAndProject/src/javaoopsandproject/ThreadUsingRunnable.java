package javaoopsandproject;

class X implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("thread X:"+i);
		}
	}
}
class Y implements Runnable
{
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("thread Y:"+i);
		}
	}
}
public class ThreadUsingRunnable {

	public static void main(String[] args) {
	
	Thread t1=new Thread(new X());
	Thread t2=new Thread(new Y());
	t1.start();//parallelly running both of the threads 
	t2.start();//parallelly running both of the threads 

	}

}

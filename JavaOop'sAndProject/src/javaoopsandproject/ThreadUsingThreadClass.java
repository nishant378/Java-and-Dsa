package javaoopsandproject;

class C extends Thread
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("thread C:"+i);
		}
	}
}
class D extends Thread
{
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("thread D:"+i);
		}
	}
}
public class ThreadUsingThreadClass {

	public static void main(String[] args) {
		C obj1=new C();
		D obj2=new D();
		obj1.start();
		obj2.start();

	}

}

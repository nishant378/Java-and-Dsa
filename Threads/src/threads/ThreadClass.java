package threads;
class C extends Thread
{
	public void run()
	{
	     for(int i=0;i<=9;i++)
	     {
	    	 System.out.println("Thread C:"+i);
	     }
	}
}
class D extends Thread
{
	public void run()
	{
	     for(int i=0;i<=9;i++)
	     {
	    	 System.out.println("Thread D:"+i);
	     }
	}
}
public class ThreadClass {

	public static void main(String[] args) {
	C obj=new C();
	D obj1=new D();
	obj.start();
    obj1.start();
	}

}

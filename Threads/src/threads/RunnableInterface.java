package threads;

class A implements Runnable
{
	public void run()
	{
	for(int i=0;i<=9;i++)
	{
		System.out.println("Thread A:"+i);
	}
	}
}
class  B implements Runnable
{
	public void run()
	{
	for(int i=0;i<=9;i++)
	{
		System.out.println("Thread B:"+i);
	}
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		 Runnable obj=new A();// A obj=new A(); we can also write like this 
		 Runnable obj1=new B();// B obj1=new A(); we can  also write like this
	     Thread t1=new Thread(obj);//jo bhi class runnable interface ko implement karegi, ushi class ka object thread class kai constructor main aayga 
	  
	     Thread t2=new Thread(obj1);
	     t1.start();//start method call only run method
	     t2.start();//thread start to processing  every file in non-step process
	}

}

package abstraction;
abstract class ims
{
	String fees="30000";//always instance 
	abstract void fees();
	ims()
	{
		System.out.println("constructor called...1");
	}
	void fees2()
	{
		System.out.println("fees2");
	}
}
class bca extends ims
{
	bca()
	{
		
		System.out.println("constructor called ....2");
	}
	void fees()
	{
		System.out.println(fees);
	}

}
public class AbstractClass2 {

	public static void main(String[] args) {
		  bca obj=new bca();
		    obj.fees();
		    obj.fees2();
		   
		    

	}

}

package overriding;
class Base
{
	protected  void m1()
	{ 
		System.out.println("m1P");
		
		}
	public void m2()
	{
		System.out.println("m2P");
	}
}
class Derived extends Base
{
	protected void m1()
	   {
		System.out.println("m1C");
	   }
	 	public void m2()
	   {
		System.out.println("m2C");
	   }
}
public class AccessModifier {

	public static void main(String[] args) {
		 Base obj1=new Base();
		   obj1.m1();
		   //obj1.m2();
	   Base obj=new Derived();
	   obj.m1();
	   obj.m2();
	  
	}

}

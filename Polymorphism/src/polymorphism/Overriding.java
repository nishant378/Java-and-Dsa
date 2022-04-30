package polymorphism;
//Method overriding
class S
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class B extends S
{
	
}
class C extends S
{
	public void show()
	{
		System.out.println("In show C");
	}
}
public class Overriding {

	public static void main(String[] args) {
		B obj=new B();
		obj.show();
	    S obj1=new C();
		obj1.show();
		 C obj2=new C();
			obj2.show();
	}

}

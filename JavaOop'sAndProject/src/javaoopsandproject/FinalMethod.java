package javaoopsandproject;

class A
{
	final void show()//we use final if we don't want a method to be overridden
	{
		System.out.println("A");
	}
}
class B extends A
{
	/*void show()
	{//compile time error because you declared show method final in parent class
		System.out.println("B");
	}*/
}
public class FinalMethod {

	public static void main(String[] args) {
		A obj=new B();
		obj.show();

	}

}

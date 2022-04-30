package inner;
class Outer
{
	static void round()
	{
		System.out.println("Golmaal!");
	}
 static class Inner
	{
		void fun()
		{
			System.out.println("Let's fun!");
		}
	}
}
public class I1 {

	public static void main(String[] args) {
		Outer obj=new Outer();
		Outer.Inner obj1=new Outer.Inner();
	   obj1.fun();
	   Outer.round();

	}

}

package javaoopsandproject;

interface a
{
	int x1=10;
	void f1();
}
interface b
{
	int x=19;
	void f2();
}
class Tff implements a,b
{
	public void f1()
	{
		System.out.println(x);
	}
	public void f2()
	{
		System.out.println(x1);
	}
}
public class Interface3 {

	public static void main(String[] args) {
		a obj=new Tff();
		obj.f1();
		//obj.f2();compile time error because obj is type of "a" so it can only contain the method "f1()" not "f2()"

	}

}

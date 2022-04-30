package interfce;
interface i1
{
	void f1();
}
interface i2 extends i1
{
	void f2();
}
interface i3 extends i2,i1
{
	void f3();
}
class A implements i3
{
	public void f1()
	{
		System.out.println("f1()");
	}
	public void f2()
	{
		System.out.println("f2()");
	}
	public void f3()
	{
		System.out.println("f3()");
	}
}
public class Interface4 {

	public static void main(String[] args) {
		A obj=new A();
		obj.f1();
		obj.f2();
		obj.f3();
	}
}

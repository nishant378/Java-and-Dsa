package javaoopsandproject;

interface At
{
	int x1=10;
	void f1();
}
interface Bt
{
	int x=19;
	void f2();
}
class Tf implements At,Bt
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
public class Interface2 {

	public static void main(String[] args) {
		Tf obj=new Tf();
		obj.f1();
		obj.f2();

	}

}

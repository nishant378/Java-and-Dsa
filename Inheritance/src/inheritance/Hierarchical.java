package inheritance;
class A 
{
	String action;
	void Entertainment()
	{
		System.out.println("Akshay kumar");
	}
	void getdata()
	{
		System.out.println("Action:"+action);
	}
}
class B extends A
{
	void setdata(String a)
	{
		action=a;
	}
}

class C extends A
{
	int p;
}
class D extends A
{
	void getEntertainment()
	{
		Entertainment();
	}
}
public class Hierarchical {

	public static void main(String[] args) {
	D obj=new D();
	obj.Entertainment();
	obj.getEntertainment();
	B obj2=new B();
	obj2.setdata("Fight");
	obj2.getdata();
	C obj1=new C();
	obj1.p=2;
	System.out.println(obj1.p);

	}

}

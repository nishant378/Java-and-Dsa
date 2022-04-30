package javaoopsandproject;
class Test1
{
	int a;
	int b;
	Test1()
	{
		this(12,11);
	}
	Test1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
public class This2 {

	public static void main(String[] args) {
		Test1 obj=new Test1();
		obj.display();

	}

}

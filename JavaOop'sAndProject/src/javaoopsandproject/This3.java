package javaoopsandproject;

class Test2
{
	int a;
	int b;
	Test2()
	{
		a=10;
		b=12;
		display(this);
	}
	void display(Test2 obj) {
		System.out.println("a:"+a+" b:"+b);
	}
}
public class This3 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Test2 obj=new Test2();
		

	}

}

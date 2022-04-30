package thiskey;
class Test
{
	int a;
	int b;
	Test()
	{
		this(12,12);
	}
	Test(int a,int b)
	{
		
		this.a=a;
		this.b=b;
		
		System.out.println("a="+a+"b="+b);
		
	}
}
public class ThisCons {

	public static void main(String[] args) {
		Test t=new Test();
		
	}

}

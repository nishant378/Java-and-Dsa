package varargs;
class Test
{
	Test(int... a)
	{
		System.out.println("this is varargs");
	    for(int i:a)
	    {
	    	System.out.println(i);
	    }
	}
}
public class Varargs {

	public static void main(String[] args) {
		Test t=new Test(4,2,9);
		Test u=new Test(5,7);
	}

}

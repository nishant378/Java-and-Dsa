package recursion;
class D
{
	int fun1(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else
		{
			return 1+fun1(n/2);
		}
	}
}
public class Practice3 {

	public static void main(String[] args) {
	D obj=new D();
	System.out.println(obj.fun1(9));
	}

}

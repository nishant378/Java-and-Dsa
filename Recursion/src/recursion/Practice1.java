package recursion;
class E
{
	int fun1(int x,int y)
	{
		if(x==0)
		{
			return y;
			
		}
		else
		{
			return fun1(x-1,x+y);
		}
	}
}
public class Practice1 {

	public static void main(String[] args) {
		E obj=new E();
        System.out.println(obj.fun1(5,2));
	}

}

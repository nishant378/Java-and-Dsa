package recursion;
import java.math.BigInteger;
class C
{ 	
	BigInteger a=new BigInteger("0");
	BigInteger b=new BigInteger("1");
	void  fib(BigInteger count)
	{
	      int comparevalue=count.compareTo(BigInteger.valueOf(0));
			if(comparevalue>0)
			{
				BigInteger c=a.add(b);
				System.out.println(c);
				a=b;
				b=c;
				fib(count.subtract(BigInteger.valueOf(1)));	
		}
	}
}
public class Fib_Recursion {

	public static void main(String[] args) {
		double a1=System.nanoTime()/1000000.0; 
		BigInteger count=new BigInteger("780");
		
     
	C obj=new C();
	
	System.out.println(obj.a);
	System.out.println(obj.b);
	obj.fib(count.subtract(BigInteger.valueOf(2)));
	System.out.println(System.nanoTime()/1000000.0-a1);
	}

}

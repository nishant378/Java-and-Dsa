package recursion;
import java.math.BigInteger;
class B
{
	
	 BigInteger fact(BigInteger n)
	{
		if(n.equals(BigInteger.valueOf(1)))
		{
			return BigInteger.valueOf(1);
		}
		else
		{
			return  n.multiply(fact(n.subtract(BigInteger.valueOf(1))));
		}
		
	}
	
}
public class Factorail_Recursion {

	public static void main(String[] args) {
		 double a=System.nanoTime()/1000000.0; 
		B obj=new B();
		System.out.println(obj.fact(BigInteger.valueOf(100)));
		 System.out.println((System.nanoTime()/1000000.0-a));
	}

}

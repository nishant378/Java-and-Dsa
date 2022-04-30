package recursion;
import java.math.BigInteger;
class R
{
	BigInteger dumy=new BigInteger("1");
	BigInteger Pow(int base,int pow)
	{
		if(pow==0)
		{
			return BigInteger.valueOf(0);
		}
		else
		{
			dumy=dumy.multiply(BigInteger.valueOf(base));
		Pow(base,pow-1);
		return dumy;
		}
			
	}
}
public class PowerRecursion {

	public static void main(String[] args) {
		double a=System.nanoTime()/1000000.0; 
		R obj=new R();
		System.out.println(obj.Pow(50000,50000));
		  System.out.println((System.nanoTime()/1000000.0-a)+"ms");
	}

}

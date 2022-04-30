package recursion;

import java.math.BigInteger;
//Best case 
class S
{
	BigInteger dumy=new BigInteger("1");
	BigInteger Pow(BigInteger base,BigInteger pow)
	{
		if(pow.equals(BigInteger.valueOf(0)))
		{
			return BigInteger.valueOf(1);
		}
		else if(pow.mod(BigInteger.valueOf(2)).equals(0))
		{
			BigInteger y=Pow(base,pow.divide(BigInteger.valueOf(2)));
			return y.multiply(y);
		}
		else
		{
			return base.multiply(Pow(base,pow.subtract(BigInteger.valueOf(1))));
		}
			
	}
}
public class ExpressionPower {

	public static void main(String[] args) {
		double a=System.nanoTime()/1000000.0; 
		S obj=new S();
		System.out.println(obj.Pow(BigInteger.valueOf(50000),BigInteger.valueOf(50000)));
		  System.out.println((System.nanoTime()/1000000.0-a)+"ms");

	}
}

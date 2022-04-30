package recursion;

import java.math.BigInteger;

public class Fib_Iteration {

	public static void main(String[] args) {
		
		double a1=System.nanoTime()/1000000.0; 	
		BigInteger a=new BigInteger("0");
		BigInteger b=new BigInteger("1");
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=500000;i++)
		{
		BigInteger c=a.add(b);
			System.out.println(c);
			a=b;
			b=c;
		}
		 System.out.println(System.nanoTime()/1000000.0-a1);
	}

}

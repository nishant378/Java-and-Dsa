package recursion;

import java.math.BigInteger;


public class Factorial_Iteration {

	public static void main(String[] args) {
		  
		double a=System.nanoTime()/1000000.0; 	
		
		BigInteger f=new BigInteger("1");
		int n=1000;
		for(int i=n;i>=1;i--)
		{
			f=f.multiply(BigInteger.valueOf(i));
			System.out.println(f);
			
		}
		
		System.out.println(f);
		 System.out.println("time:"+(System.nanoTime()/1000000.0-a)+"ms");
	}

}

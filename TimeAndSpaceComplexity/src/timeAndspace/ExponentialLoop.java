package timeAndspace;

import java.math.BigInteger;

public class ExponentialLoop {

	public static void main(String[] args) {
	
		
		  BigInteger a[]=new BigInteger[10000000]; 

			for(int i=0;i<=9999999;i++)
			{
				a[i]=BigInteger.valueOf(2).pow(i);	
				System.out.println(a[i]);
		    }	
	}

}

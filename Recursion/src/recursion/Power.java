package recursion;
import java.math.BigInteger;
public class Power {

	public static void main(String[] args) {
		double a=System.nanoTime()/1000000.0; 
	 BigInteger base=new BigInteger("50000");
	 int power=50000;
	 BigInteger dumy=new BigInteger("1");
	 for(int i=1;i<=power;i++)
	 {
		 dumy=dumy.multiply(base);
	 }
	 System.out.println(dumy);
	 System.out.println((System.nanoTime()/1000000.0-a)+"ms");
	}

}

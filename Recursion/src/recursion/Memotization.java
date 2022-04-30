package recursion;
class X
{
	int f[]=new int[51];
	int  some(int n)
	{
		if(n<=1)
		{
			return  n;
		}
		if(f[n]!=-1)
		{
			return f[n];
		}
	 f[n]= some(n-1) +some(n-2);
	 return f[n];
	}
}
public class Memotization {

	public static void main(String[] args) {
		double a=System.nanoTime()/1000000.0; 
		    X obj=new X();
		  for(int i=0;i<51;i++)
		     {
		    	 obj.f[i]=-1;
		     }
		     System.out.println(obj.some(40));
		     System.out.println((System.nanoTime()/1000000.0-a)+"ms");
	}

}

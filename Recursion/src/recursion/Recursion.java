package recursion;
class Z
{
	int  some(int n)
	{
		if(n<=1)
		{
			return  n;
		}
	
	 return some(n-1) +some(n-2);
	
	}
}
public class Recursion {

	public static void main(String[] args) {
		double a=System.nanoTime()/1000000.0; 
		
	     Z obj=new Z();
	     System.out.println(obj.some(40));
	     System.out.println((System.nanoTime()/1000000.0-a)+"ms");
		
	
		

	}

}

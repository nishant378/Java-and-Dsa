package recursion;
class I
{
	void fun2(int n) 
	{ 
	  if(n == 0) 
	    return; 
	  
	  fun2(n/2); 
	  System.out.println("n:"+n);
	 System.out.println(n%2);
	}   
}
public class Practice4 {

	public static void main(String[] args) {
	I obj=new I();
	obj.fun2(21);

	}

}

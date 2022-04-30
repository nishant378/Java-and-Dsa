package finalize;
class h
{
public void finalize()
	{
	System.out.println("Palat!");	
	}
}
public class Finalize {
	
	public static void main(String[] args) {
		h obj=new h();
		obj=null;
	    System.gc();
		} 

	}



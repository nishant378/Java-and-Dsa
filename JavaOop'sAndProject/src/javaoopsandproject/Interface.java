package javaoopsandproject;

interface I1
{
    int x=10;
	void somefunction();
}
class V implements I1
{
	public void somefunction()
	{
	    System.out.println("Some function:"+x);
	}
}

public class Interface {

	public static void main(String[] args) {
	          V obj=new V();
	          obj.somefunction();
	          

	}

}

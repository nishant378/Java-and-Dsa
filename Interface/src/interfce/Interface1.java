package interfce;
interface in1
{
	int a=10;
	 void display();
	
}
class testclass implements in1
{
	public void display()
	{
		System.out.println(a);
	}
}
public class Interface1 {

	public static void main(String[] args) {
    testclass obj=new testclass();
    obj.display();
	}
}

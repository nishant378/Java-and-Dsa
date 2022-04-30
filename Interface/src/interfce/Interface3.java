package interfce;
interface if1
{
	/*We use default in place of static*/	static void display()
	{
		System.out.println("Display!");
	}
}
public class Interface3 implements if1 {

	public static void main(String[] args) {
     if1.display();

	}

}

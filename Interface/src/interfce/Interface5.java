package interfce;
interface i
{//object reference
	int a=10;
	void display();
}
class G implements i
{
	public void display()
	{
		System.out.println(a);
	}
}
public class Interface5 {

	public static void main(String[] args) {
		i obj=new G();//interface object reference 
		obj.display();
	}

}

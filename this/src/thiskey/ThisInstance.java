package thiskey;
class hi
{
	int a=9;
	hi idea()
	{
		return this;
	
	}
 void display()
 {
	 System.out.println("a="+a);
 }
}
public class ThisInstance {

	public static void main(String[] args) {
		hi h=new hi();
		h.idea().display();
        

	}

}

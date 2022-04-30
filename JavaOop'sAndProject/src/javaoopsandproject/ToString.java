package javaoopsandproject;

class ToStringg
{
	int rollno=10;
	String s="hi";
	public String toString()
	{
		return rollno+s;
	}
}
public class ToString {

	public static void main(String[] args) {
		ToStringg obj=new ToStringg();
	    System.out.println(obj.toString());

	}

}

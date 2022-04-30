package encapasulation;
class Encapsulated 
{
	private String name;//variables are private because we want to hide these variables from other classes and use it using methods
	private int rollno;
	private int age;
	public void setname(String n)
	{
		name=n;
	}
	public void setrollno(int r)
	{
		rollno=r;
	}
	public void setage(int a)
	{
		age=a;
	}
	public String getname()
	{
		return  name;
	}
	public int getrollno()
	{
		return rollno;
	}
	public int getage()
	{
		return age;
	}
}
public class E1 {

	public static void main(String[] args) {
		Encapsulated obj=new Encapsulated();
        obj.setage(42);
        obj.setname("N");
        obj.setrollno(10);
        System.out.println(obj.getage()); 
        System.out.println(obj.getname());
        System.out.println(obj.getrollno());
        
	}

}

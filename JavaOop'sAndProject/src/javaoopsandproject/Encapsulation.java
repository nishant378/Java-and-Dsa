package javaoopsandproject;
//Difference between encapsulation and abstraction
//Encapsulation hides only variables from other classes but in data abstraction its hide both variables and methods and show in other subclasses.
class Ash
{
	private String name;//it means you can use it in 
	public void setname(String n)
	{
		name=n;
	}
	public String getname() {
		return name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
	Ash obj=new Ash();
	obj.setname("N");
	System.out.println(obj.getname());

	}

}

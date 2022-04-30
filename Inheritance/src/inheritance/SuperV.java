package inheritance;
class Vehicle
{
	int maxspeed=80;
	
}
class Bike extends Vehicle
{
	int maxspeed=400;
	void display()
	{
		System.out.println("Max speed:"+super.maxspeed);
	}
}
public class SuperV {

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.display();
	}

}

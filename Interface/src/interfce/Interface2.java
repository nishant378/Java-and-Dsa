package interfce;
interface vehicle 
{//two classes inherit a single interface
	void changeGear(int a);
	void speedup(int b);
	void applyBrakes(int c);
}
class Bicycle implements vehicle 
{
	int gear;
	int speed;
	public void changeGear(int newgear)
	{
		gear=newgear;
	}
	public void speedup(int increment)
	{
		speed=speed+increment;
	}
	public void applyBrakes(int decrement)
	{
		speed=speed-decrement;
	}
	void printstate()
	{
		System.out.println("Speed:"+speed+";" +" "+"Gear:"+gear);
	}
}
class Bike implements vehicle
{
	int speed;
	int gear;
	public void speedup(int increment)
	{
		speed=speed+increment;
	}
	public void applyBrakes(int decrement)
	{
		speed=speed-decrement;
	}
	public void changeGear(int newgear)
	{
		gear=newgear;
	}
	void printstate()
	{
		System.out.println("Speed:"+speed+";"+" "+"Gear:"+gear);
	}
}
public class Interface2 {

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.applyBrakes(2);
		obj.changeGear(3);
		obj.speedup(130);
		obj.printstate();
		Bicycle obj1=new Bicycle();
		obj1.applyBrakes(3);
		obj1.changeGear(5);
		obj1.speedup(400);
		obj1.printstate();
	}

}

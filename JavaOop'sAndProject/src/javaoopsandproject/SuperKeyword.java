package javaoopsandproject;

class Vehicle
{
	int maxspeed=130;
}
class Cars extends Vehicle
{
	int maxspeed=180;
	void display()
	{
		System.out.println("Max speed:"+super.maxspeed);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
	Cars obj=new Cars();
	obj.display();

	}

}

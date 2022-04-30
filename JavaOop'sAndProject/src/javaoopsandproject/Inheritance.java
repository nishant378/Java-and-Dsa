package javaoopsandproject;

class Car
{
	int price,capacity;
	String fueltype,engine,colour;
	void setPrice(int P)
	{
		price=P;
	}
	void setFuelType(String F)
	{
		fueltype=F;
	}
	void setColour(String C)
	{
		colour=C;
	}
	void setEngine(String E)
	{
		engine=E;
	}
	void setCapacity(int C)
	{
		capacity=C;
	}
	int getPrice()
	{
		return price;
	}
	String getFuelType()
	{
		return fueltype;
	}
	String getColour()
	{
		return colour;
	}
	String getEngine()
	{
		return engine;
	}
	int getCapacity()
	{
		return capacity;
	}
}
class SportsCar extends Car
{
	int alaram;
	String music;
	void setalaram(int A)
	{
		alaram=A;
	}
	void setMusic(String M)
	{
		music=M;
	}
	int getAlaram()
	{
		return alaram;
	}
	String getMusic()
	{
		return music;
	}
}
public class Inheritance {

	public static void main(String[] args) {
	      SportsCar obj=new SportsCar();
	      obj.setalaram(10);
	      System.out.println("The time of the alaram :"+obj.getAlaram()+"pm");
	      obj.setMusic("Ranbir Kapoor's songs");
	      System.out.println("My fav music play station:"+obj.getMusic());
	      obj.setPrice(8);
	      System.out.println("The price of the car is:"+obj.getPrice()+"lakhs");
	      
	      

	}

}

package inheritance;
//Simple Inheritance 
class Car
{
	int price;
	String fueltype;
	String engine;
	String colour;
	int capacity;
	void setprice(int p)
	{
		price=p;
	}
	void setfueltype(String f)
	{
		fueltype=f;
	}
	void setengine(String e)
	{
		engine=e;
	}
	void setcolour(String c)
	{
		colour=c;
	}
	void setcapacity(int c)
	{
		capacity=c;
	}
	int getprice()
	{
		return price;
	}
	String getfueltype()
	{
		return fueltype;
	}
	String getcolour()
	{
		return colour;
	}
	String getengine()
	{
		return engine;
	}
	int getcapacity()
	{
		return capacity;
	}
}
class Sportscar extends Car
{
	int alaram;
	String music;
	void setalaram(int a)
	{
		alaram=a;
	}
	void setmusic(String m)
	{
		music=m;
	}
	int getalaram()
	{
		return alaram;
	}
	String getmusic()
	{
		return music;
	}
}
public class SimpleInheritance {

	public static void main(String[] args) {
		System.out.println("*****Car Details*****");
		System.out.println("*****Sportscar******");
		System.out.println("*****BMW******");
	Sportscar obj=new Sportscar();
	obj.setalaram(10);
	System.out.println("Alaram featues:"+obj.getalaram());
	obj.setmusic("Boyfriend Boyfriend...");
	System.out.println("Music:"+obj.getmusic());
    obj.setcolour("Black");
    System.out.println("Colour:"+obj.getcolour());
    obj.setprice(700000);
    System.out.println("Price:"+obj.getprice());
    obj.setfueltype("Diesel");
    obj.setengine("Diesel:"+"3000cc");
    System.out.println(obj.getengine());
    obj.setcapacity(4000);
    System.out.println("Capacity:"+obj.getcapacity());
	}

}

package interfce;

interface RegularPolygon
{
	abstract  int getNumSides();
	abstract  int getSideLength();
	default int getPerimeter(int n,int length)
	{
		return n*length;
	}
	default double getInteriorAngle(int n)
	{
		return (n-2)*(3.14)/n;
	}
}
class EquilateralTriangle implements RegularPolygon
{
	int a;
	EquilateralTriangle()
	{
		a=10;
	}
	public int getNumSides()
	{
		return 3;
	}
	public int getSideLength()
	{
		return a;
	}
	void totalSides()
	{
		System.out.println("Number of side of triangle:"+getNumSides());
	}
}
class Square implements RegularPolygon
{
	int b;
	Square()
	{
		b=15;
	}
	public int getNumSides()
	{
		return 4;
	}
	public int getSideLength()
	{
		return b;
	}
    void totalSides()
	{
		System.out.println("Number of side of square:"+getNumSides());
	}
}
public class Problem1 {

	public static void main(String[] args) {
		EquilateralTriangle obj=new EquilateralTriangle();
		obj.totalSides();
		System.out.println("Perimeter of equilateral triangle:"+obj.getPerimeter(obj.getNumSides(),obj.getSideLength()));		
		System.out.println("Interior angle of equilateral triangle:"+obj.getInteriorAngle(obj.getNumSides()));
		
		
		Square obj1=new Square();
		obj1.totalSides();
		System.out.println("Perimeter of square:"+obj1.getPerimeter(obj1.getNumSides(),obj1.getSideLength()));		
		System.out.println("Interior angle of the square:"+obj1.getInteriorAngle(obj1.getNumSides()));
		

	}

}

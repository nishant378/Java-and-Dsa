package setters;
class Bat
{
	int abdvuseit;
	String name="MRF";
	int getlength(int length)
	{
		System.out.print("Length:");
		return length;
	}
	double getweight(double weight)
	{
		System.out.print("Weight:");
		return weight;
	}
	int  getsize(int size)
	{
		System.out.print("Size:");
		return size;
	}
	void brand()
	{
		System.out.print("Brand:");
		System.out.println("MRF");
	}
}
public class Cricket {
	
	public static void main(String[] args) {
	Bat b=new Bat();
	  b.brand();
	System.out.println(b.getlength(10));
	System.out.println(b.getweight(2.2));
	System.out.println(b.getsize(3));
	System.out.println("Name of the Bat:"+b.name);
	b.abdvuseit=(int)(Math.random()*10);
	System.out.println("Random numbers:"+b.abdvuseit);
    if(b.abdvuseit==1)
    {
    	System.out.println("Lucky Bat!!");
    }
	}

}

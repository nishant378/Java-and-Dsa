package constructor;
class constructor
{
	int x=10;
    constructor(){
   	 System.out.println("this is Default constructor...");
   	 System.out.println("x:"+x);
    }
    void Constructor()
    {
   	 System.out.println("Mehod..");
    }
}
public class Default {
	
	public static void main(String[] args) {
	constructor d=new constructor();
      d.Constructor();
      new constructor();
	}

}

package constructor;
class Demo
{
	 int x;
	 static int b=10;
      Demo(int i)
      {
    	 x=i; 
    	 System.out.println(x);
      }
}
	public class Parameterized {


	public static void main(String[] args) {
		Demo d=new Demo(10);
         d.x=12;
         System.out.println(d.x);
         System.out.println(Demo.b);
	}

}

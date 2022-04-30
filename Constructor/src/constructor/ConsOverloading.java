package constructor;
class hello
{
   hello()
   {
	   System.out.println("hello");
   }
   hello(int x,int y)
   {
	   System.out.println("x="+x);
	   System.out.println("y="+y);
   }
   hello(int e)
   {
	   System.out.println(e);
   }
}
public class ConsOverloading {

	public static void main(String[] args) {
	hello h=new hello();
	hello b=new hello(2,3);
	hello t=new hello(3);
	
	}

}

package polymorphism;
class E
{ 
   void show()
   {
	   System.out.println("In show E");
   }
} 
class D extends E 
{ 
   void show()
   {
	   System.out.println("In show D");
   }
} 
  
public class Dispatch {

	public static void main(String[] args) {
		E obj=new E();
		obj.show();
		D obj1=new D();
		obj1.show();
		E a;
		a=obj;
		a.show();
		a=obj1;
		a.show();
	}
}

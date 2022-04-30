package decision_making;

public class Cat {
public void  speak()
{
	System.out.println("Meow!!!!!!");
}
	public static void main(String[] args) {
		boolean isbool=true;
		Cat c=new Cat();
         if(isbool)
         {
        	 c.speak();
        	 
         }
         else
         {
        	 System.out.println("Cann't speak!!!");
         }
	}

}

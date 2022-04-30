package number_class;
import java.util.Random;
public class Random2 {

	public static void main(String[] args) {
		Random obj=new Random();
		int i=obj.nextInt(11);
		System.out.println(i);
		
		if(i==5)
		{
			System.out.println("you win!!");
		}
		else
		{
			System.out.println("wrong choice");
		}
	}

}

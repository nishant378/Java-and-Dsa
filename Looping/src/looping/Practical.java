package looping;

public class Practical {

	public static void main(String[] args) {
		int Airforce=5;
		int Navy =5;
		while(Airforce>0)
		{
		if(Airforce==1 && Navy==1)
		{
			System.out.println("only one chance!!!");
		}
		System.out.println( "only "+Airforce+ " chance in IAF " );
		System.out.println( "only "+Navy+ " chance in IN " );
		Airforce=Airforce-1;
		Navy=Navy-1;
		
		if(Navy>0)
		{
			System.out.println("good chance to join IN");
		}
		else
		{
			System.out.println("Chances is over in IN");
		}
		if(Airforce>0)
		{
			System.out.println("good chance to join IAF");
		}
		else
		{
			System.out.println(" Chances is  over in IAF");
		}
		}
		} 
	
}


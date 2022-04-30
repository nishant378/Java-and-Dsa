package objects;
class Tapedeck
{
	int canrecord;
	void playTape()
	{
		System.out.println("tape playing");
	}
	void record()
	{
		System.out.println("tape recorded");
	}
}
public class Test3 {

	public static void main(String[] args) {
		Tapedeck obj=new Tapedeck();
        obj.canrecord=(int)(Math.random()*10);
        System.out.println(obj.canrecord);
         obj.playTape();
         if(obj.canrecord==1)
         {
        	 obj.record();
         }
        
	}

}

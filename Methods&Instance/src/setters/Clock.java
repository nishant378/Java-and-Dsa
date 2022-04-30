package setters;
class Clocks {
	
    String time;
    void setTime(String t)
    {
     time = t;
       }
    String getTime() 
    {
      return time;
     }
     }
public class Clock {

	public static void main(String[] args) {
		Clocks c = new Clocks();
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);

	}

}

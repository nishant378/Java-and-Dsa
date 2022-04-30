package stringclasses;

public class Capacity {

	public static void main(String[] args) {
	StringBuffer s=new StringBuffer();
	System.out.println(s.capacity());
s.append("Quantum University Roorkee");
System.out.println(s.capacity());//default capacity 16
	}
//its return current capacity.the default capacity is 16.IF THE NUMBER OF CHARACTER INCREASE FROM ITS CURRENT CAPACITY.IT INCREASE BY (OLD CAPACITY*2)+2=16*2+2=34
}

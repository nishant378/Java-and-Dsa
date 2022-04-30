package stringformat;

public class FormatI {

	public static void main(String[] args) {
		
		System.out.printf("i=%7d",5);
		System.out.printf("i=%2d",5);
		System.out.printf("i=%3d",5);
		System.out.printf("i=%-10d;",5);
		int i=3;
		
		String s=String.format("%d",i);
		System.out.println("\n"+s);
	}

}

package setters;

public class Copy {

	public static void main(String[] args) {
		int orig = 42;
		Copy x = new Copy();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
		}
		int go(int arg) {
		arg = arg * 2;
		return arg;
	}

}

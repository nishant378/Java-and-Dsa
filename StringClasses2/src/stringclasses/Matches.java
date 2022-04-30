package stringclasses;

public class Matches {

	public static void main(String[] args) {
		String s="hello my friend john";
		System.out.println(s.matches("he(.*)"));
		System.out.println(s.matches("(.*)friend(.*)"));
	}

}

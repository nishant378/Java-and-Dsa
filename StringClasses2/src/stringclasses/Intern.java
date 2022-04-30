package stringclasses;

public class Intern {

	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		System.out.println(s.intern());
		System.out.println(s1.intern());
	}

}

package stringClass;

public class Replace {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Quantum University Roorkee");
		s.replace(0, 5, "H");
        System.out.println(s);
	}

}

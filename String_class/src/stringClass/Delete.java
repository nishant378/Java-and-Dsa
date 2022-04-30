package stringClass;

public class Delete {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Quantum University Roorkee");
		s.delete(0,8);
		
		System.out.println(s);
		StringBuffer u=new StringBuffer("Quantum University Roorkee");
		u.delete(0,4);
		System.out.println(u);
	}

}

package overriding;
class P
{
	int p=6;
}
class C extends P
{
	int p=4;
}
public class SameAsVariable {

	public static void main(String[] args) {
		P obj=new C();
	       System.out.println(obj.p);
	}

}

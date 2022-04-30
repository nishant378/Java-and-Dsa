package inner;
class O 
{
	int x=4;

	 class I
	{
		void soop()
		{
			System.out.println("Yummy:"+x);
		}
	}
}
public class NonS {

	public static void main(String[] args) {
		O obj=new O();
		O.I obj1=obj.new I();
           obj1.soop();
	}

}

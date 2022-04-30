package arrays;
class Cat
{
	String s;
	int balance(int balance)
	{
		return balance;
	}
}
public class Array9 {

	public static void main(String[] args) {
    Cat obj[]=new Cat[3];//complete array as object
	obj[0]=new Cat();//declare every particular array as object
	obj[1]=new Cat();//declare every particular array as object
	obj[2]=new Cat();//declare every particular array as object
				obj[0].s="rahul";
		System.out.println(obj[0].s);
		System.out.println(obj[0].balance(10));
		System.out.println(obj[0].balance(10));
		
	}

}

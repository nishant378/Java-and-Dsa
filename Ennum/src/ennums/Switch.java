package ennums;
enum Beer
{
	rt,ui;
}
public class Switch {

	public static void main(String[] args) {
		Beer obj=Beer.rt;
		switch(obj)
		{
		case rt:
			System.out.println("rt works on bikes ");
			break;
		case ui:
			System.out.println("ui works on URI");
			break;
			default :
				System.out.println("this is the best chance for us");
				break;
		}

	}

}

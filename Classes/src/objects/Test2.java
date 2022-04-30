package objects;
class Movie
{
	String tittle;
	String genre;
	int rating;
	void playIt()
	{
		System.out.println("Playing the movie!");
	}
}
public class Test2 {

	public static void main(String[] args) {
		Movie one=new Movie();
        one.tittle="Gone with the stock";
        one.genre="Tragic";
        one.rating=-2;
        Movie two=new Movie();
        two.tittle="Lost in Cubicle Space";
        two.rating=5;
        two.genre="Comedy!!";
        two.playIt();
        System.out.println(two.genre);
	}

}

package setters;
class Music
{
	String  setTittle(String tittle)
	{
		System.out.print("Tittle:");
		return tittle;
	}
	String setArtist(String artist)
	{
		System.out.print("Artist:");
		return artist;
	}
	void play()
	{
		System.out.print("Playing this music:");
		System.out.println(" baby baby Baby o.....");
	}
}
public class Song {
	public static void main(String[] args) {
		Music m=new Music();
		System.out.println(m.setTittle("Baby"));
		System.out.println(m.setArtist("Justin"));
		m.play();
	}

}

package recursion;
import javax.swing.*;
import java.awt.*;
class Tutorial extends JFrame
{
	public Tutorial()
	{
		setTitle("Tutorial");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		int x=300;
		int y=300;
		for(int i=300;i>=0;i=i/2) {
	    g.setColor(Color.GREEN);
		g.drawOval(x,y,i,i);
	}

		
	}
}
public class Project {

	public static void main(String[] args) {
             
      Tutorial obj=new Tutorial();
       obj.paint(null);

	}

}

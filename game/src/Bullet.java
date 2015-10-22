import java.awt.Graphics;
import javax.swing.JPanel;

public class Bullet extends JPanel {
	private int x =0;
	private boolean right=false;
	public Bullet(Boolean pressedRight, int xPoint)
	{
		x=xPoint;
		right=pressedRight;
	}
	public void paintComponen(Graphics g)
	{
		super.paintComponent(g);
		
	}
}

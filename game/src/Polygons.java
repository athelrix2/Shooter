import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Polygons extends JPanel {
	
	private Rectangle body=new Rectangle();
	private int x=0;
	public Polygons()
	{
		body.setBounds(0, 250, 50, 100);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawRect(0,400,500,100);
		g.setColor(Color.GREEN);
		g.fillRect(0, 350, 500, 100);
		g.setColor(Color.RED);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(body);
		g2.draw(body);
	}
	public void updateBodyLocation(int deltaX)
	{
		body.setLocation(x+=deltaX, 250);
		repaint();
	}
	public int getX()
	{
		return x;
	}
}

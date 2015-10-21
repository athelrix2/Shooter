import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Polygons extends JPanel {
	
	private Rectangle body=new Rectangle();
	private int deltaX=0,x=0;
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
	public void updateBodyLocation()
	{
		body.setLocation(x+=deltaX, 250);
	}
	 public void keyPressed(KeyEvent e)
	 {

		 int key = e.getKeyCode();
		 if (key == 37)
	     {
			 deltaX = -2;
	     }
	     if (key == 39)
	     {
	    	 deltaX = 2;
	     }
	 }
	 public void keyReleased(KeyEvent e) {
	        
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            deltaX = 0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	        	deltaX = 0;
	        }

	        if (key == KeyEvent.VK_UP) {
	        	//deltaX = 0;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	        	//deltaX = 0;
	        }
	        if (key == KeyEvent.VK_X);
	        {
	        	
	        }
	    }
}

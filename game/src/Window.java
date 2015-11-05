import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Window extends JFrame{
	private KeyLogger movement=new KeyLogger();
	public static void main(String args[])
	{
		new Window();
	}
	public Window()
	{
		addKeyListener(new Logger());
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Polygons poly=movement.getShapes();
		add(poly);
		pack();
		this.setVisible(true);
	}
	private class Logger extends KeyAdapter{
		  @Override
		  public void keyReleased(KeyEvent e)
		  {
			  movement.keyReleased(e);
	      }

	      @Override
	      public void keyPressed(KeyEvent e)
	      {
	          movement.keyPressed(e);
	      }
	}
}

	        	  

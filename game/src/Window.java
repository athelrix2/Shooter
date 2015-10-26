import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Window extends JFrame{
	private KeyLogger movement=new KeyLogger();
	public Window()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		addKeyListener(new Logger());
		this.setSize((int)screenSize.getWidth(), (int)screenSize.getHeight());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(movement.getShapes());
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

	        	  

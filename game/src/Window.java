import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Window extends JFrame{
	private KeyLogger movement=new KeyLogger();
	public Window()
	{
		addKeyListener(new Logger());
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(movement.getShapes());
		for(Bullet bullet:movement.getBullet()){
			this.add(bullet);
		}
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

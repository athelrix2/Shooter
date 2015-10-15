import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Window extends JFrame{
	private Polygons shapes=new Polygons();
	public Window()
	{
		addKeyListener(new Logger());
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(shapes);
	}
	private class Logger extends KeyAdapter{
		  @Override
		  public void keyReleased(KeyEvent e)
		  {
			  shapes.keyReleased(e);
	      }

	      @Override
	      public void keyPressed(KeyEvent e)
	      {
	          shapes.keyPressed(e);
	          shapes.updateBodyLocation();
	          shapes.repaint();
	      }
	}
}

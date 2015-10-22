import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class KeyLogger {
	private Polygons shapes=new Polygons();
	private ArrayList<Bullet> bullets=new ArrayList<Bullet>();
	private Boolean pressedRight=false;
	public void keyPressed(KeyEvent e)
	 {

		 int key = e.getKeyCode();
		 if (key == 37)
	     {
			 shapes.updateBodyLocation(-2);
			 pressedRight=false;
	     }
	     if (key == 39)
	     {
	    	 shapes.updateBodyLocation(2);
	    	 pressedRight=true;
	     }
	 }
	 public void keyReleased(KeyEvent e) {
	        
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            //deltaX = 0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	        	//deltaX = 0;
	        }

	        if (key == KeyEvent.VK_UP) {
	        	//deltaX = 0;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	        	//deltaX = 0;
	        }
	        if (key == KeyEvent.VK_X);
	        {
	        	bullets.add(new Bullet(pressedRight, shapes.getX()));
	        }
	    }
	 public Polygons getShapes()
	 {
		 return shapes;
	 }
	 public ArrayList<Bullet> getBullet()
	 {
		 return bullets;
	 }
}

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class KeyLogger {
	private Polygons shapes=new Polygons();
	private Boolean pressedRight=false;
	public void keyPressed(KeyEvent e)
	 {

		 int key = e.getKeyCode();
		 if (key == 37)
	     {
			 shapes.updateBodyLocation(-2);
			 pressedRight=false;
	     }
		 else if (key == 39)
	     {
	    	 shapes.updateBodyLocation(2);
	    	 pressedRight=true;
	     }
		 else if (key == 88)
	     {
	    	 shapes.createThread(pressedRight);
	    	 System.out.println(key);
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
	        
	    }
	 public Polygons getShapes()
	 {
		 return shapes;
	 }
}

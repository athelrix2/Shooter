import java.awt.event.KeyEvent;

public class KeyLogger {
	private Boolean pressedRight=false;
	public void keyPressed(KeyEvent e)
	 {

		 int key = e.getKeyCode();
		 if (key == 37)
	     {
			 shapes.updateBodyLocation(-10);
			 pressedRight=false;
	     }
		 else if (key == 39)
	     {
	    	 shapes.updateBodyLocation(10);
	    	 pressedRight=true;
	    	 System.out.println(shapes.getX());
	     }
		 else if (key == 88)
	     {
	    	 
	    	 
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

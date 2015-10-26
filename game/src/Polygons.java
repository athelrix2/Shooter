import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.*;

public class Polygons extends JPanel {
	
	private Rectangle body=new Rectangle();
	private ArrayList<Rectangle> bullets=new ArrayList<Rectangle>();
	private ArrayList<Integer> loc=new ArrayList<Integer>();
	private int x=0,y=this.getHeight()-200;
	public Polygons()
	{
		body.setBounds(0, 250, 50, 100);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(0, this.getHeight()-100, this.getWidth(), 100);
		g.setColor(Color.RED);
		Graphics2D g2 = (Graphics2D) g;
		body.setLocation(x,this.getHeight()-200);
		g2.fill(body);
		g2.draw(body);
		g2.setColor(Color.BLUE);
		for(Rectangle bullet:bullets){
			g2.fill(bullet);
			g2.draw(bullet);
		}
		y=this.getHeight()-200;
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
	public void createThread(boolean right){
		//BulletThread newBullet=new BulletThread(x,right,this);
		//newBullet.start();
		new Thread(){ 
			public void run(){System.out.println("thread");
			    Rectangle rec = new Rectangle();
				bullets.add(rec);
				int xBul=x;
				int orgin=x;
				bullets.get(bullets.indexOf(rec)).setBounds(x, y, 20, 10);
				while(Math.abs(xBul-orgin)<=800){
					if(right)
						xBul++;
					else
						xBul--;
					bullets.get(bullets.indexOf(rec)).setLocation(xBul,y);
					repaint();
					try {
						sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				bullets.remove(bullets.indexOf(rec));
				repaint();
			}
		}.start();
	}
	/*public Bullet(Boolean pressedRight, int xPoint)
	{
		x=xPoint;
		right=pressedRight;
		bul.setBounds(0,0,100,100);
		System.out.println("MADE");
	}*/
}

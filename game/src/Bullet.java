import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Bullet extends JPanel{
	private int x =0;
	private boolean right=false;
	private Rectangle bul=new Rectangle();
	public Bullet(Boolean pressedRight, int xPoint)
	{
		x=xPoint;
		right=pressedRight;
		bul.setBounds(x,200,10,20);
	}
	public void paintComponen(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 350, 500, 100);
		g.setColor(Color.GRAY);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(body);
		g2.draw(body);
		
	}
	public void createThread(){
		//Thread runingBullet=
		new Thread("bullet"){
			private int xOrgin=x;
			public void run(){
				try
				{
					while(Math.abs(xOrgin-x)<=500){
						repaint();
						if(right)
							x++;
						else
							x--;
					}
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
			
		}.start();
	}
}

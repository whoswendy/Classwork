package GUIpractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import GUIpractice.components.Visible;

public abstract class Screen {
	
	private int width;
	private int height;
	private ArrayList <Visible> viewObjects;
	protected BufferedImage image;//buffer image data thats tells you how pixels are displayed
	//protected similar to private but accessible to subclasses
	
	public Screen(int width, int height)
	{
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
		
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);//red green blue and transparency (alpha)
		update();
		
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		//draw all visible components
		for(Visible v: viewObjects)
		{
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		
		
//		g.setFont(new Font("Comic Sans MS",Font.PLAIN,50));
//		g.drawString("^    ^", 200, 220);
//		g.drawOval(150, 100, 200, 200);
//		g.drawRect(175, 300, 150, 300);
//		g.drawLine(325, 310, 420, 420);
//		g.drawLine(175, 300, 250, 450);
//		
//		g.setColor(Color.green);
//		for(int i = 0; i< image.getWidth();i+=2)
//		{
//			g.drawLine(i,600,i,614);	
//		}
		
	}
	
	public BufferedImage getImage()
	{
		return image;
	}

	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		// TODO Auto-generated method stub
		return null;
	}


}

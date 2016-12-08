package GUIpractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Screen {
	
	private int width;
	private int height;
	protected BufferedImage image;//buffer image data thats tells you how pixels are displayed
	//protected similar to private but accessible to subclasses
	
	public Screen(int width, int height)
	{
		this.width = width;
		this.height = height;
		initImage();
		
	}

	private void initImage() {
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);//red green blue and transparency (alpha)
		update();
		
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font("Comic Sans MS",Font.PLAIN,50));
		g.drawString("^    ^", 200, 220);
		g.drawOval(150, 100, 200, 200);
		g.drawRect(175, 300, 150, 300);
		g.drawLine(325, 310, 420, 420);
		g.drawLine(175, 300, 250, 450);
		
		g.setColor(Color.green);
		for(int i = 0; i< image.getWidth();i+=2)
		{
			g.drawLine(i,600,i,614);	
		}
		
	}
	
	public BufferedImage getImage()
	{
		return image;
	}

}

package GUIpractice;

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
		
	}
	
	public BufferedImage getImage()
	{
		return image;
	}

}

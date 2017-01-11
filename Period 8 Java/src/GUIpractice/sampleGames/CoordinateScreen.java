package GUIpractice.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import GUIpractice.Screen;
import GUIpractice.components.Action;
import GUIpractice.components.AnimatedComponent;
import GUIpractice.components.Button;
import GUIpractice.components.Graphic;
import GUIpractice.components.MovingComponent;
import GUIpractice.components.TextArea;
import GUIpractice.components.TextLabel;
import GUIpractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener {

	private TextLabel label;
	private TextArea paragraph;
	private Button but;
	private Button button;
	private Graphic img;
	
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		label = new TextLabel(40,45,760,40,"");
		paragraph = new TextArea(40,85,550,40,"This is a whole paragraph,This is a whole paragraph,This is a whole paragraph,This is a whole paragraph,This is a whole paragraph,This is a whole paragraph,This is a whole paragraph");
//		but = new Button(20,30,100,40,"Button",Color.blue,new Action(){
//			public void act(){
//				
//			}
//		});
		button = new Button(200,200,100,30,"Button",new Color(0,76,153), new Action(){
			public void act()
			{
				//MouseFollower.game.setScreen(MouseFollower.practiceScreen);
			}
			
		});
		//img = new Graphic(50,50, 0.50 ,"resources/sampleImages/pikaCHU.png");
		//img = new Graphic(50,50,100,100,"resources/sampleImages/pikaCHU.png");
		//viewObjects.add(paragraph);
		//viewObjects.add(label);//adds into array list
		//viewObjects.add(button);
		//viewObjects.add(but);
		//viewObjects.add(img);
		
//		MovingComponent mc = new MovingComponent(30,60,80,80);
//		mc.setVy(3.00);//3 pixel every ms
//		mc.play();
//		viewObjects.add(mc);
		
		addAnimation(viewObjects);
		
	}


	private void addAnimation(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		AnimatedComponent A = new AnimatedComponent(40,50,150,150);
		try{
			int numOfRows = 5;
			int rows = 2;
			int w = 180;
			int h = 230;
			ImageIcon icon = new ImageIcon("resources/sampleImages/sprite.png");
			for(int i = 0; i<numOfRows * rows; i++)
			{
				//declare the cropped image 
				BufferedImage cropped = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0;
				int topMargin = 0;
				int x1 = leftMargin + w*(i%numOfRows);
				int y1 = topMargin + h*(i/numOfRows);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(),0,0,w,h,x1,y1,x1+w,y1+h,null);
				A.addFrame(cropped,150);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		viewObjects.add(A);
		A.setVx(3.00);//3 pixel every ms
		A.play();
	}


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent m) {
		// TODO Auto-generated method stub
		label.setText("Mouse at " + m.getX() + "," + m.getY());
		if(m.getX() > 500 && m.getY() < 400)
		{
			label.setText("Hello");
		}
		if(m.getY() > 400 && m.getX() < 500)
		{
			label.setText(":)");
		}
		
	}
	@Override
	public MouseMotionListener getMouseMotionListener()
	{
		return this;
	}
	@Override
	public MouseListener getMouseListener()
	{
		return this;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(button.isHovered(e.getX(), e.getY()))
		{
			button.act();
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

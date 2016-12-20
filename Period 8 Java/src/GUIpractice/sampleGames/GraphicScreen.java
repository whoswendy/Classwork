package GUIpractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.Action;
import GUIpractice.components.ClickableGraphic;
import GUIpractice.components.Visible;

public class GraphicScreen extends Screen implements MouseMotionListener, MouseListener {
	
	private ClickableGraphic pic;
	private int x;
	private int y;
	

	public GraphicScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		x = 100;
		y = 50;
		pic = new ClickableGraphic(x,y,0.5,"resources/sampleImages/pichu.png",new Action(){
			public void act()
			{
				pic = new ClickableGraphic(x,y,0.6,"resources/sampleImages/pikaCHU.png",new Action(){
					public void act()
					{
						pic = new ClickableGraphic(x,y,0.7,"resources/sampleImages/Raichu.png",new Action(){
							public void act()
							{
								
							}
						});
						viewObjects.add(pic);
					}
				});
				viewObjects.add(pic);
			}
			
		});
		viewObjects.add(pic);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(pic.isHovered(e.getX(), e.getY()))
		{
			pic.act();
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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public MouseListener getMouseListener()
	{
		return this;
	}
	
	public MouseMotionListener getMouseMotionListener()
	{
		return this;
	}

}

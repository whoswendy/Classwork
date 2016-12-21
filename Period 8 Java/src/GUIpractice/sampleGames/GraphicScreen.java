package GUIpractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.Action;
import GUIpractice.components.ClickableGraphic;
import GUIpractice.components.Graphic;
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
		pic = new ClickableGraphic(x,y,0.5,"resources/sampleImages/pichu.png");
		//pic = new ClickableGraphic(100,50,0.5,"resources/sampleImages/pichu.png");
		viewObjects.add(pic);
		pic.setAction(new Action(){
			public void act()
			{
				x+=110;
				pic = new ClickableGraphic(x,y, 0.60 ,"resources/sampleImages/pikaCHU.png");
				//pic = new ClickableGraphic(pic.getX() + 110,50,0.5,"resources/sampleImages/pikaCHU.png");
				//pic.setX(pic.getX + 110)
				viewObjects.add(pic);
				pic.setAction(new Action(){
					public void act()
					{
						x+=110;
						pic = new ClickableGraphic(x,y,0.7,"resources/sampleImages/Raichu.png");
						//pic = new ClickableGraphic(pic.getX() + 110,50,0.5,"resources/sampleImages/Raichu.png");
						//pic.setX(pic.getX + 110)
						viewObjects.add(pic);
					}

				});
			}

		});
		
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
	@Override
	public MouseListener getMouseListener()
	{
		return this;
	}
	@Override
	public MouseMotionListener getMouseMotionListener()
	{
		return this;
	}

}

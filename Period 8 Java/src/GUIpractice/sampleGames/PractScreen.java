package GUIpractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.Action;
import GUIpractice.components.Button;
import GUIpractice.components.Graphic;
import GUIpractice.components.Visible;

public class PractScreen extends Screen implements MouseListener{

	private Graphic pika;
	private Button back;
	private Button addP;
	private Button evolution;
	private int x;
	private int y;	

	public PractScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		x = 100;
		y = 50;
		pika = new Graphic( x, y, 0.50 ,"resources/sampleImages/pikaCHU.png");
		viewObjects.add(pika);
		back = new Button(200,100,100,50,"BACK",new Color(0,76,153), new Action(){
			public void act()
			{
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}

		});
		viewObjects.add(back);
		addP = new Button(200,180,100,50,"ADD",new Color(0,76,153), new Action(){
			public void act()
			{
				y += 50;
				pika = new Graphic(x,y, 0.50 ,"resources/sampleImages/pikaCHU.png");
				viewObjects.add(pika);
			}

		});
		viewObjects.add(addP);
		evolution = addP = new Button(200,300,100,50,"EVOLVE",new Color(0,76,153), new Action(){
			public void act()
			{
				MouseFollower.game.setScreen(MouseFollower.grScreen);
			}

		});
		viewObjects.add(evolution);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(back.isHovered(e.getX(), e.getY()))
		{
			back.act();
		}
		if(addP.isHovered(e.getX(), e.getY()))
		{
			addP.act();
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
	
	public MouseListener getMouseListener()
	{
		return this;
	}





}

package GUIpractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.Action;
import GUIpractice.components.Button;
import GUIpractice.components.Graphic;
import GUIpractice.components.Visible;

public class PractScreen extends Screen {
	
	private Graphic pika;
	private Button button;

	public PractScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		pika = new Graphic(50,50, 0.50 ,"resources/sampleImages/pikaCHU.png");
		
		
		
		viewObjects.add(pika);
	}



	

}

package GUIpractice.sampleGames;

import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.Visible;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		label = new TextLabel(40,45,760,40,"HELLO");
		viewObjects.add(label);//adds into array list
	}

}

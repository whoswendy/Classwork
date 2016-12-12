package GUIpractice.sampleGames;

import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.TextArea;
import GUIpractice.components.TextLabel;
import GUIpractice.components.Visible;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	private TextArea paragraph;
	
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
	//	label = new TextLabel(40,45,760,40,"sample text");
		paragraph = new TextArea(40,85,760,40,"This is a whole paragraph,This is a whole paragraph,This is a whole paragraph,This is a whole paragraph");
		//viewObjects.add(label);//adds into array list
		viewObjects.add(paragraph);
	}

}

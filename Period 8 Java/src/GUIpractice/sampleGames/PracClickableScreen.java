package GUIpractice.sampleGames;

import java.util.ArrayList;

import GUIpractice.ClickableScreen;
import GUIpractice.components.Action;
import GUIpractice.components.ClickableGraphic;
import GUIpractice.components.TextLabel;
import GUIpractice.components.Visible;

public class PracClickableScreen extends ClickableScreen {
	
	private ClickableGraphic p;
	private TextLabel text;
	private int x;
	private int y;

	public PracClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		x = 100;
		y = 50;
		p = new ClickableGraphic(x,y,0.1,"resources/sampleImages/squirtle.png");
		viewObjects.add(p);
		p.setAction(new Action(){
			public void act()
			{
				x+=110;
				p = new ClickableGraphic(x,y, 0.60 ,"resources/sampleImages/wartotle.jpg");
				viewObjects.add(p);
				p.setAction(new Action(){
					public void act()
					{
						x+=110;
						p = new ClickableGraphic(x,y,0.7,"resources/sampleImages/blastoise.jpg");
						viewObjects.add(p);
					}

				});
			}

		});
		text = new TextLabel(x, y + 100, 500, 50, "Squirtle Squirtle");
		viewObjects.add(text);
	}
}



package GUIpractice.WhackAMole;

import java.util.ArrayList;

import GUIpractice.ClickableScreen;
import GUIpractice.components.TextLabel;
import GUIpractice.components.Visible;

public class WhackAMoleScreen extends ClickableScreen {
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
		/**
		*to implement later, after Character Team implements PlayerInterface
		*/
		private PlayerInterface getAPlayer() 
		{
			return null;
		}

		/**
		*to implement later, after EnemyTeam implements MoleInterface
		*/
		private MoleInterface getAMole() 
		{
			return null;
		}
	}

}

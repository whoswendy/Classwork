package GUIpractice.Simon;

import java.awt.Color;
import java.util.ArrayList;

import GUIpractice.ClickableScreen;
import GUIpractice.WhackAMole.MoleInterface;
import GUIpractice.WhackAMole.PlayerInterface;
import GUIpractice.components.Button;
import GUIpractice.components.TextLabel;
import GUIpractice.components.Visible;

public class SimonScreenWendy extends ClickableScreen implements Runnable{
	
	private ArrayList<MoveInterfaceWendy> moves;
	private ProgressInterfaceWendy progress;
	private ButtonInterfaceWendy[] buttons;
	private TextLabel label; 
	private int rounds;
	private boolean acceptedInput;
	private int sequenceIndex;
	private int lastSelectedButton;

	public SimonScreenWendy(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterfaceWendy>();
		//add 2 moves to start
		lastSelectedButton = -1;
		moves.add(randomMove());
		moves.add(randomMove());
		rounds = 0;
		viewObjects.add(progress);
		viewObjects.add(label);

	}

	private MoveInterfaceWendy randomMove() {
		// TODO Auto-generated method stub
		ButtonInterfaceWendy Move;
		int rand = (int) (Math.random() * buttons.length);
		while(rand == lastSelectedButton)
		{
			rand = (int) (Math.random() * buttons.length);
		}
		Move = buttons[rand];
		lastSelectedButton = rand;
		return getMove(Move);
	}
	
	
	/*
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private MoveInterfaceWendy getMove(ButtonInterfaceWendy move) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private ProgressInterfaceWendy getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private ButtonInterfaceWendy getAButton() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private void addButtons() {
		// TODO Auto-generated method stub
		int NumOfButtons = 6;
		Color[] colors = {Color.red,Color.blue,Color.pink,Color.green,Color.orange,Color.yellow};
		for(int i = 0; i< NumOfButtons; i++)
		{
			final ButtonInterfaceWendy b = getAButton();
			b.setColor(colors[i]);
			b.setX();
			b.setY();
			b.setAction(new Action(){
				
				public void act(){
					if(acceptedInput)
					{
						Thread blink = new Thread(new Runnable(){

							public void run(){
							}
								b.highlight();
							});
					}
				}
			});
		}
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

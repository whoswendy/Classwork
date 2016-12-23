package GUIpractice.WhackAMole;

import java.awt.Graphics2D;

import GUIpractice.components.Component;

public class Player extends Component implements PlayerInterface {
	
	private int score;

	public Player(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseScore(int i) {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(1000);
			score++;
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub

	}

}

package GUIpractice.WhackAMole;

import GUIpractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private double appearTime;

	
	public Mole(int x, int y)
	{
		super(x,y,0.2,"resources/sampleImages/mole.png");
	}

	@Override
	public double getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearTime;
	}

	@Override
	public void setAppearanceTime(double d) {
		// TODO Auto-generated method stub
		this.appearTime = d;
		
	}

}

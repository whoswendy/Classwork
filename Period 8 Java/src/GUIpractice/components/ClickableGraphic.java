package GUIpractice.components;

public class ClickableGraphic extends Graphic implements Clickable{
	
	private Action action;

	public ClickableGraphic(int x, int y, String imageLocation, Action act) {
		super(x, y, imageLocation);
		this.action = act;

	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation, Action act) {
		super(x, y, w, h, imageLocation);
		this.action = act;
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action act) {
		super(x, y, scale, imageLocation);
		this.action = act;
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		action.act();
		
	}

}

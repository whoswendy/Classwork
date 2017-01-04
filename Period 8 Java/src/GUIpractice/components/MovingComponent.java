package GUIpractice.components;

import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {
	
	private double vx;
	private double vy;
	private double posex;
	private double posey;
	private boolean running;
	private long moveTime;//time when the image last moved

	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub

	}
	 
	public void setX(int x)
	{
		super.setX(x);
		posex = x;
	}
	
	public void setY(int y)
	{
		super.setY(y);
		posey = y;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

}

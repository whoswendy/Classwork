package GUIpractice.components;

import java.awt.Color;
import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {
	
	private double vx;//represent an actual location 
	private double vy;
	private double posex;
	private double posey;
	private boolean running;
	private long moveTime;//time when the image last moved
	
	public static final int REFRESH_RATE = 20;

	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		vx = 0;
		vy = 0;
		running = false;
		
	}
	
	public boolean isAnimated()
	{
		return true;
	}

	@Override
	public void run() {
		posex = getX();
		posey = getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running)
		{
			try {
				Thread.sleep(REFRESH_RATE);
				checkBehaviors();
				update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void checkBehaviors() {
		// TODO Auto-generated method stub
		if(getY() < 10 )
		{
			setY(10);
			vy*=-1;
		}
		if(getY() > 300 )
		{
			setY(300);
			vy*=-1;
		}
	}

	@Override
	public void update(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		long difference = currentTime - moveTime; //this calculates time since last moved
		if(difference >= REFRESH_RATE)//don't want it to be updating faster than the refresh rate
		{
			moveTime = currentTime;//an update is happening so update moveTime
			posex += vx * (double)difference/REFRESH_RATE;
			posey += vy * (double)difference/REFRESH_RATE;//increasing velocity therefore position
			//set only location of the screen
			super.setX((int)posex);
			super.setY((int)posey);
		}
		
		drawImage(g);
	}
	 
	public void drawImage(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillOval(0, 0, getWidth(), getHeight());
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

	public void play() {
		// TODO Auto-generated method stub
		if(!running)
		{
			Thread go = new Thread(this);
			go.start();
		}
	}

}

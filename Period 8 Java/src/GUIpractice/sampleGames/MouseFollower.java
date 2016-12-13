package GUIpractice.sampleGames;

import GUIpractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7549079317385885964L;
	private CoordinateScreen coordScreen;
	
	public static void main(String[] args)
	{
		new MouseFollower();
		GUIApplication game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}

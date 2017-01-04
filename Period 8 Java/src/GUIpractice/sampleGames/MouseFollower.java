package GUIpractice.sampleGames;

import GUIpractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	/**
	 * 
	 */
	public static CoordinateScreen coordScreen;
	public static PractScreen practiceScreen;
	public static GraphicScreen grScreen;
	public static PracClickableScreen prCScreen;
	
	public static MouseFollower game;

	
	public static void main(String[] args)
	{
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		practiceScreen = new PractScreen(getWidth(),getHeight());
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		grScreen = new GraphicScreen(getWidth(),getHeight());
		prCScreen = new PracClickableScreen(getWidth(),getHeight());
		
		setScreen(coordScreen);
	}

}

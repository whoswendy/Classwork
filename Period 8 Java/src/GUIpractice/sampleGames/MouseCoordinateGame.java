package GUIpractice.sampleGames;

import GUIpractice.GUIApplication;

public class MouseCoordinateGame extends GUIApplication{
	
	public static CoordinateScreen coordScreen;
	
	public static PractScreen practiceScreen;

	public static MouseCoordinateGame game;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		game = new MouseCoordinateGame();

		Thread app = new Thread(game);

		app.start();
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		practiceScreen = new PractScreen(getWidth(),getHeight());
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		
		setScreen(coordScreen);

	}

}

package GUIpractice;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{
	
	private Screen currentScreen;
	
	//you cannot instantiate "create" an abstract class 
	
	public GUIApplication()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		int x = 0;
		int y = 0;
		int width = 600;
		int height = 400;
		setBounds(x,y,width,height);
		initScreen();
		setVisible(true);
	}

	//method for creating and setting the starting screen
	protected abstract void initScreen();
	
	public void setScreen(Screen screen)
	{
		currentScreen = screen;
	}
	
	
	public void paint(Graphics g)
	{
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}

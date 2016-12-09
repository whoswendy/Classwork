package GUIpractice.sampleGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import GUIpractice.components.Component;

public class TextLabel extends Component {

	private String text;
	private String font;
	private int size;
	
	public TextLabel(int x, int y, int w, int h, String tex) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		this.text = tex;
		font = "Comic Sans MS";
		size = 30;
		update();
		
	}
	
	public void setText(String s)
	{
		this.text = s; 
	}
	
	public void setFont(String f)
	{
		this.font = f;
	}
	
	public void setSize(int n)
	{
		this.size = n;
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(font,Font.PLAIN,size));
		g.drawString(text, 4, getHeight()-5);
	}

}

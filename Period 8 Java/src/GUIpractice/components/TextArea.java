package GUIpractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String tex) {
		super(x, y, w, h, tex);
		
	}
	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		FontMetrics fm = g.getFontMetrics();
		if(getText() != null)
		{	
			String[] words = getText().split(" ");
			int lengthOfLine=0;
			String output="";
			for(int i=0;i<words.length;i++){
				int currentWordPix=fm.stringWidth(words[i]+" ");
				if(lengthOfLine+currentWordPix<=getWidth()){
					lengthOfLine+=currentWordPix;
					output+=words[i]+" ";
				}
				else{
					output+="\n";
					lengthOfLine=0;
				}
			}
			g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
			g.drawString(output, 4, getHeight()-5);
			
		}
		
	}

}

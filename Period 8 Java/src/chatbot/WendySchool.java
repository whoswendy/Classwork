package chatbot;

public class WendySchool implements Chatbot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	@Override
	public void talk(){
		inSchoolLoop = true;
		while (inSchoolLoop)
		{
			WendyMain.print("Type quit to go back.");
			//static call on promptInput method from WendyMain class
			schoolResponse = WendyMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0)
			{
				inSchoolLoop = false;
				WendyMain.promptForever();
			}
			WendyMain.print("That's my favorite part about school too"); 
		}
	}
}

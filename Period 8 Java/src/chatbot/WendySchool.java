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
			if(WendyMain.school.isTriggered(schoolResponse))
			{
				WendyMain.school.talk();
				inSchoolLoop = false;
			}
			WendyMain.print("That's my favorite part about school too"); 
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		String[] trigger = {"school", "class", "teachers"};//create a for-loop to iterate through array of triggers
		if (WendyMain.findKeyword(userInput, "school", 0) >= 0)
		{
			return true;
		}
		if (WendyMain.findKeyword(userInput, "class", 0) >= 0)
		{
			return true;
		}
		return false;
	}
}

package chatbot;

public class WendyHello implements Chatbot {
	
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"We already said hello", "Let's move the conversation along", 
			"We said hello already, did you forget?"};
	
	private String[] angryResponses = {"Okay seriously stp saying hi ", "That's it! BYE", 
			"What is wrong with you and saying hello"};
	
	private int helloCount;
	
	public WendyHello(){
		helloCount = 0;
	}

	@Override
	public void talk() {
		inHelloLoop = true;
		while (inHelloLoop)
		{
			helloCount++;
			printResponse();
			helloResponse = WendyMain.promptInput();
			//negate use
			if(!isTriggered(helloResponse))
			{
				inHelloLoop = false;
				WendyMain.promptForever(); 
			}
		}
	}

	private void printResponse() {
		if(helloCount > 4)
		{
			int responseSelection = (int) (Math.random() * angryResponses.length);
			WendyMain.print(angryResponses[responseSelection]);
		}
		else
		{
			int responseSelection = (int) (Math.random() * calmResponses.length);
			WendyMain.print(calmResponses[responseSelection]);
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		if(WendyMain.findKeyword(userInput, "hello", 0) >= 0)
		{
			return true;
		}
		if(WendyMain.findKeyword(userInput, "hi", 0) >= 0)
		{
			return true;
		}
		if(WendyMain.findKeyword(userInput, "hey", 0) >= 0)
		{
			return true;
		}
		return false;
	}

}

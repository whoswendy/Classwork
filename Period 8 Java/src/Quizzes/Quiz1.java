package Quizzes;

import java.util.Scanner;

public class Quiz1 {

static Scanner input = new Scanner(System.in) ;
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 pt visibility private
	//1 pt for data type declaration
	private static String username = "test_user";
	private static String password = "test";
	
	//1 pt correct method
	public static void main(String[] args){
		//1 pt for asking username once
		if(correctUser())
		{
			askPassword();
		}
		else
		{
			System.out.println("Unknown Username, please contact the network administrator");
		}
	}

	private static void askPassword() {
		// TODO Auto-generated method stub
		boolean inLoop = true;
		int triesRemaining = 3;
		
		while(inLoop)
		{
			System.out.println("Enter your password");
			//1 pt use waitForEntry() correctly
			String entry = waitForEntry();
			if(entry.equals(password))
			{
				System.out.println("You have logged in");
				inLoop = false;
			}
			else
			{
				//0.5 pt triesRemaining is changing
				triesRemaining--;
				if(triesRemaining == 0)
				{
					//0.5 pt for printing invalid password
					System.out.println("Invalid Password");
					//0.5 pt MAX 3 tries
					inLoop = false;
				}
				else
				{
					//0.5 pt print CORRECT number
					System.out.println("You have " + triesRemaining + " attempt(s) left.");
				}
			}
			
			
		}
		
	}

	private static boolean correctUser() {
		
		System.out.println("Enter a Username");
		
		//1 pt comparing strings
		/**if(waitForEntry().equals(username))
		{
			return true;
		}
		else return false;
		 */
		
		return waitForEntry().equals(username);
	}

}

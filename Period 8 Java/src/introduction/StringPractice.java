package introduction;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;//hover over Scanner and click change to Scanner
	static String user;//field = global var

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demonstateStringMethods();
		createFields();
		promptName();
		//promptForever();
		//promptInput();
	}
	
	public static void promptName() {
		// TODO Auto-generated method stub
		print("Enter your name");
		user = input.nextLine();
		print("Glad to meet you " + user + ". For the rest of the time I will call you " + 
				user + ". You may call me computer. We should become friends!");
	}

	private static void promptForever() {
		// TODO Auto-generated method stub
		while(true)
		{
			promptInput();
		}
	}

	public static void promptInput() {
		// TODO Auto-generated method stub
		print("Please Type Something " + user);
		String userInput = input.nextLine();
		print("Congratulations! you typed: " + userInput);
		
	}

	public static void createFields() {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		user = "";
		
	}

	public static void demonstateStringMethods()
	{
		String text1 = new String("Hello World");
		//string is the only object with an alternate constructor
		String text2 = "Hello World";//same as text1
				
		if(text1 .equals(text2))//== not how you compare objects use .equals()
		{
			print("These Strings are equal");
		}
		
	//primitive types:booleans ints doubles - don't have objects, constructors, methods
	//use == only for primitive types

		print(text1);
		print(text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0)
		{
			print("word1 comes before word2");
		}
		
	}
	
	public static void print(String s)
	{
		String printString = s;
		int cutOff = 10;
		if (printString.length() > cutOff)
		{
			for(int i = 0; i*cutOff<s.length(); i++)
			{	
				printString += getCut(s, cutOff, i+1) + "\n";
			}
		 
		}
		System.out.println(printString);//out and string("Hello World") are objects	
	}
	
	private static String getCut(String s, int cutOff, int cut)
	{
		int cutIndex = cut * cutOff;
		if (cutIndex > s.length())
		{
			cutIndex = s.length();
		}
		String currentCut = s.substring(0,cutIndex);
		
		int indexOfLastSpace = currentCut.length()-1;
		//start at last index, go backward
		for (int i = currentCut.length()-1; i >= 0 ; i--)
		{
			String letter = currentCut.substring(i, i+1);
			if (letter.equals(" "))
			{
				indexOfLastSpace = i;
				break;
			}
		}
		//shorten the cut to end on a space
		currentCut = currentCut.substring(0,indexOfLastSpace);
		return currentCut;
	}

}

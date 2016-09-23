package introduction;

	import java.util.Scanner;

public class StringPracVer2 {
		
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
			String printString = "";
			int cutOff = 35;
			//check for words to add, s had a length > 0
			
			while (s.length()>0)
			{
				String cut = "";
				String nextWord = "";
				//check to see if next word will fit on the line + there must still be words to add
				while (cut.length() + nextWord.length() < cutOff && s.length() >0)
				{
					//add next word to the line
					cut += nextWord;
					s = s.substring(nextWord.length());
					//identify the following word without space	
					int endOfWord = s.indexOf(" ");
					//if there are no more spaces this is the last word, so add the whole thing
					if(endOfWord == -1)
					{
						endOfWord = s.length()-1;//-1 for index
					}
					nextWord = s.substring(0, endOfWord+1);
				}
				
				printString += cut + "\n";
			}
			
			System.out.println(printString);//out and string("Hello World") are objects	
		}

	}

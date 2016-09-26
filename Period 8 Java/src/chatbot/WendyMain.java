package chatbot;

	import java.util.Scanner;

public class WendyMain {
			
			static String response;
			static boolean inMainLoop;
			static Scanner input;
			static String user;
			//List all the chatbots available under this class
			static Chatbot school;

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//demonstateStringMethods();
				createFields();
				//String s1 = " ";
				//String s2 = "a";
				//System.out.println(s1.compareTo(s2));
				promptName();
				promptForever();
				//promptInput();
			}
			
			public static void promptName() {
				// TODO Auto-generated method stub
				print("Enter your name");
				user = input.nextLine();
				print("Glad to meet you " + user + ". For the rest of the time I will call you " + 
						user + ". You may call me computer. We should become friends!");
			}

			public static void promptForever() {
				// TODO Auto-generated method stub
				inMainLoop = true;
				while(inMainLoop)
				{
					print("Hi, " + user + ". How are you?");
					response = promptInput();
					//response of how you feel
					if(findKeyword(response, "good", 0) >= 0)
					{
						print("That's wonderful, so gald you feel good");
					}
					else if(response.indexOf("school") >= 0 )
					{
						print("School is great. Tell me more about school");
						//exit while loop
						inMainLoop = false;
						//goto school's talk method
						school.talk();
					}
					else
						print("I don't understand");
				}
			}

			public static int findKeyword(String searchString, String keyWord, int startPosition) {
				//delete white space
				searchString = searchString.trim();
				//make lowercase
				searchString = searchString.toLowerCase();
				keyWord = keyWord.toLowerCase();
				//find first position of key word
				int pos = searchString.indexOf(0);
				while (pos >= 0)
				{
					//assume preceded and followed by space
					String  before = " ";
					String after = " ";
					//check character infront if exist
					if (pos > 0)
					{
						before = searchString.substring(pos-1, pos);
					}
					//check if character after keyword exist
					if(pos + keyWord.length() < searchString.length())
					{
						after = searchString.substring(pos + keyWord.length(), pos + keyWord.length()+1);
					}
					if (before.compareTo("a") < 0 && after.compareTo("a") < 0)
					{
						return pos;
					}
					else
					{
						pos = searchString.indexOf(keyWord, pos+1);
						//pos+1 looks for the next occurance of keyword
					}
				
				}
				return -1;
			}

			public static String promptInput() {
				// TODO Auto-generated method stub
				String userInput = input.nextLine();
				return userInput;
			}

			public static void createFields() {
				// TODO Auto-generated method stub
				input = new Scanner(System.in);
				user = "";
				school = (Chatbot) new WendySchool();
				
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

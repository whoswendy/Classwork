package introduction;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(s);//out and string("Hello World") are objects	
	}

}

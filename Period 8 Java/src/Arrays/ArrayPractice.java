package Arrays;

public class ArrayPractice {

	static boolean[] boos3;
	
	public static void main(String[] args) {
		//how do you time a process?
		long currentTime = System.currentTimeMillis();
		//initializingArraysExample();
		
		int x = 10;
		increase(x);
		System.out.println(x);
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		//print(someStrings);
	
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime - currentTime) + " miliseconds.");


	}
	
	private static int increase(int i) {
		// TODO Auto-generated method stub
		return i+1;
	}

	private static void makeSpecial(String s) {
		// TODO Auto-generated method stub
		s = "THIS STRING IS SPECIAL";
		//This don't change values this change assignment of variables
	}

	private static void print(String[] s) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< s.length; i++)
		{
			System.out.println(s[i]);
		}
		
	}

	private static void standardPopulate(String[] s) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< s.length; i++)
		{
			s[i] = "String #" + (i+1);
		}
		//int i = 0;
		//for(String x: s)
		//{
		//	i++;
		//	x = "String #" + i;
		//}
		
	}
	
	public static void initializingArraysExample()
	{
	
		/**
	 * Primitive Type Array
	 	- A primitive type array is an array specifically for containing primitive types int doubles booleans. 
	 	- Primitive type arrays are already in the system and start as 0
	 *	Object Array
	 	- An object array is an array that unless initialized start at null.
	 	- Different types in an array of common superclass
	*/	
		
		//If you want to put different primitive types into any array you must use their wrapper class
				
		//TWO different ways to initiate an array
		boolean[] boos1 = new boolean[3];
				/**
				 * in booleans unless stated otherwise always false
				 * in int primitively always 0
				 * in double 0.0
				 * in char space 
				*/
				//this can only be done at the declaration
				//because this sets size and content
		boolean[] boos2 = {false,false,false};

				//boos3 = {false,false,false}; this does NOT work
		boos3 = new boolean[3];
				
				//TWO ways of iterating through an array
				/**Standard FOR loop
				 	-the index is important to keep track of
				 	-you need to customize the order
				*/
				
				//for(int i = 0 ; i < boos1.length; i++)
				//{
				//	System.out.println(boos1[i]);
				//}
				
				/**FOR EACH loop
				    -the index is not important
				    -no need to customize
				    -automatically assigns a "handle"=identifier
				    -faster
				 */
				//for (boolean b:boos1)
				//{
					//booleans b = boos[i];
				//	System.out.println(b);
				//}
				
				//Object arrays
		String[] someStrings1 = new String[3];
				//prints null - nothing in greater sense of 0, null doesn't even exist can't do anything with it
				//someStrings1[0] = "a";
				//someStrings1[1] = "b";
				//someStrings1[2] = "c";
				
		String[] someStrings2 = {"a","b","c"};
				
		for (int i = 0; i<someStrings1.length; i++)
		{
			someStrings1[i] = "a new String";
					//String s = "a new string";
					//someStrings1[i] = s;
		}
				
				//for(String s:someStrings1)
				//{
				//	s = "a new String";
				//}
				//DOES NOT WORK
				
		for(String s:someStrings1)
		{
			System.out.println(s);
		}
	}
}

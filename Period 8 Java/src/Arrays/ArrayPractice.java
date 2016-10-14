package Arrays;

public class ArrayPractice {

	static boolean[] boos3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If you want to put different primitive types into any array you must use their wrapper class
		
		//TWO different ways to initiate an array
		boolean[] boos1 = new boolean[3];
		/**
		 * in booleans unless stated otherwise always false
		 * in int primitively always 0
		 * in double 0.0
		 * in char space 
		 * in string null
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

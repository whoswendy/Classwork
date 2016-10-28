package Arrays;

public class AdvancedArrayMethods {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
		//swap(array,0,array.length-1);
		shuffle(array);
		
		for(int i = 0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
			
	}
	



	private static void shuffle(Object[] array) {
		// TODO Auto-generated method stub
		for(int  i = 0; i< array.length; i++)
		{
			int random = (int) (Math.random() * 6);
			swap(array, i, random);
		}
		
	}




	private static void swap(Object[] ray, int a, int b) {
		// TODO Auto-generated method stub
		Object temp = ray[a];//PLACEHOLDER
		ray[a] = ray[b];
		ray[b] = temp;
	}


	private static void methodA(int[] somerray) {
		// TODO Auto-generated method stub
		int[] array = new int[100];//full of 0s
		int[] someArray = new int[50];
		
		someArray = array;//assigns someArray to array not equal
		System.out.println(someArray.length);
		
		someArray[30] = 1;
		//someArray is 100 zeroes and 1 one
		System.out.println(array[30]);//since someArray points to array, someArray[30] and array[30] = 1
		
		//methodA(someArray);
		
	}
	public static void copyArray(int[] original, int[] target)
	{
		//target = original; DOES NOT WORK 
		if(original.length == target.length)
		{
			for(int i = 0; i<original.length; i++)
			{
				target[i] = original[i];
			}
		}
		else
		{
			//print error message
			System.out.println("ERROR: tried to copy arrays of two different lengths");//fake error message
			//ERROR: exception 
		}
	}

}

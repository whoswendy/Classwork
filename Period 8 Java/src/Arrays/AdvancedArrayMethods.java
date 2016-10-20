package Arrays;

public class AdvancedArrayMethods {
	

	public static void main(String[] args) {
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

	private static void methodA(int[] someArray) {
		// TODO Auto-generated method stub
		int[] newArray = new int[someArray.length];
		
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

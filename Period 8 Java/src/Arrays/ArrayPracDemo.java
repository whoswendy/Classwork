package Arrays;

public class ArrayPracDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long currentTime = System.currentTimeMillis();
			
			listPrimes(120);
			
			int[] fiftyNumbers = new int[50];
			//populate(fiftyNumbers);
			//print(fiftyNumbers);
			//randomize(fiftyNumbers,50);
			//print(fiftyNumbers);
			//rollDice(fiftyNumbers, 4);
			//print(fiftyNumbers);
			//countResult(fiftyNumbers, 4);
			
			long endTime = System.currentTimeMillis();
			System.out.println("The process took " + (endTime - currentTime) + " miliseconds.");
			
	}
	
	private static void listPrimes(int lim) {
		// TODO Auto-generated method stub
		int lastToCheck = (int)(Math.sqrt(lim));
		boolean [] numbers = new boolean[lim + 1];
		for(int i = 0; i< lim + 1; i++)
		{
			numbers[i] = true;
		}
		numbers[0] = false;
		numbers[1] = false;
		//check all non crossed off numbers starting with 2
		for(int prime = 2; prime <= lastToCheck; prime++)
		{
			if(numbers[prime])
			{
				System.out.println("\n" + prime + " is prime." + " Crossing off: "); 
				for(int i = (int) (Math.pow(prime, 2)); i<lim+1; i += prime)//Math.pow(prime,2) squares prime
				{
					System.out.print(i + ", ");
					numbers[i] = false;
				}
			}
		}
		System.out.println("\n"+ "\n"+ "The Primes are: ");
		for(int i = 0; i<numbers.length; i++)
		{
			if(numbers[i])
			{
				System.out.print(i+ ", ");
			}
			
		}
	}

	private static void countResult(int[] array, int numberOfDice) {
		// TODO Auto-generated method stub
		int[] counter = new int[numberOfDice * 6 ];
		//populate(counter);
		for(int n: array)
		{
			counter[n-1] = counter[n-1] +1;
		}
		for(int i = numberOfDice; i<counter.length; i++)
		{
			System.out.println((i+1) + " was rolled " + 100*counter[i]/array.length + " percent of the time");
		}
		
		
	}

	private static void rollDice(int[] array, int numberOfDice) {
		// TODO Auto-generated method stub
		for (int i = 0; i<array.length; i++)
		{
			//int dice1 =  (int) ((1 + Math.random() * 6) );
			//int dice2 = (int) ((1 + Math.random() * 6) );
			//array[i] = dice1 + dice2;
			
			int dice = 0;
			for (int g = 1; g< numberOfDice+1; g++)
			{
				dice = dice + (int) ( Math.random() * 6 + 1 );
			}
			array[i] = dice;
		}
	}

	private static void randomize(int[] array, int max) {
		// TODO Auto-generated method stub
		for (int i = 0; i<array.length; i++)
		{
			int randomNum =(int) ((Math.random() * max) + 1);
			array[i] = randomNum;
		}
		
	}

	private static void populate(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i<array.length; i++)
		{
			array[i] = i+1;
		}
	}

	private static void print(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< array.length; i++)
		{
			System.out.println(array[i]);
		}
		
	}

}

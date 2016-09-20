package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		
		int[] results = new int[6];
		int[] unfairResults = new int[6];

		for(int index = 0; index < 10; index ++)
		{
			int result = rollFairDie();
			System.out.println("Roll #" + (index+1) + ":" + result);
			results[result-1] ++;
			
			int unfairResult = rollUnfairDie();
			System.out.println("Roll #" + (index+1) + ":" + unfairResult);
			unfairResults[unfairResult-1] ++;;
		}
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println(i+1 + " appeared " + results[i] + " times.");
			System.out.println(i+1 + " appeared " + unfairResults[i] + " times.");
		}
	

	}
	
	//returns 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random();//returns a double (0,1)
		int roll = (int) (6*rand);//[0,5]
		roll ++;
		return roll;
	}
	
	public static int rollUnfairDie(){
		double unfairRoll = Math.random();
		int rolling = (int) (6*unfairRoll+1);//[1,6]
		if (rolling == 1 || rolling == 6)
			return rolling;
		else
			return rollUnfairDie();
		
		//if (rolling == 1 || rolling == 2 || rolling == 3 || rolling == 5 || rolling == 6)
		//	return rollUnfairDie();
		
		//	return rolling;
	}

}

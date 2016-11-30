package Sort;

public class RecursionIntro {

	
	public static void main(String[] args) {
		
		hanoiSolution(8,"A", "B", "C");
		//System.out.println(factorialRecursion(10));
		
		//factorial(10);
		
		//helloWorld();
	}

	private static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg) {
		// TODO Auto-generated method stub
		if(numberOfDiscs <= 1)
		{
			System.out.println("Move " + startPeg + " to " + endPeg);
		}
		else
		{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
		
	}

	private static int factorialRecursion(int n) {
		// TODO Auto-generated method stub
		/**int fact = n;
		if(n == 1)
		{
			fact = fact * n;
			return fact;
		}
		else
		{
			fact = fact * factorialRecursion(n-1);
			return fact;
		}**/
		if(n>1)
		{
			return n* factorialRecursion(n-1);
		}
		return 1;
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int fact = n;
		for(int i = n-1; i>0; i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		return fact;
	}

	private static void helloWorld() {
		// TODO Auto-generated method stub
		System.out.println("Using a for loop");
		for(int i = 0; i<5; i++)
		{
			System.out.println("Hello World x" + i);
		}
		System.out.println("Without using a forloop");
		forLoop(5, new Action(){
			
			private int value = 0;

			public void act() {
				// TODO Auto-generated method stub
				System.out.println("Hello World x" + value);
				value++;
			}
		});
	}

	private static void forLoop(int i, Action action) {
		if(i<=0)//base case
		{
			return;
		}
		else
		{
			action.act();//standard action
			forLoop(i-1,action);//recursive call
		}
	}

}

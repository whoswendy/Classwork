package introduction;

public class RandomDeck {
	public static void main(String[]args) {
		String[] cardDeck = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] cardSymbols = {" of Diamond"," of Clover"," of Heart"," of Spade"};
		
		for (int i = 0; i<10; i++)
		{
			String card = cardDeck[pickCard()] + cardSymbols[pickSymbol()];
		}

	}
	
	public static int pickSymbol()
	{
		double pick = Math.random();
		int pickAgain = (int) (4*pick);//[0,3]
		pickAgain ++;
		return pickAgain;
	}
	
	public static int pickCard()
	{
		double pick = Math.random();
		int pickNumber = (int) (12*pick);//[0,12]
		pickNumber ++;
		return pickNumber;
	}

}

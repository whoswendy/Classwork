package introduction;

public class CardDraw {
	
	static String[] cardDeck = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	static String[] cardSymbols = {" of Diamond"," of Clover"," of Heart"," of Spade"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(cardDeck[pickCard()] + cardSymbols[pickSymbol()]);
		
		for(int i=0; i<10; i++)
		{
			String card = cardDeck[pickCard()] + cardSymbols[pickSymbol()];
			System.out.println(card);
		}
	}
	
	public static int pickSymbol()
	{
		double pick = Math.random();
		int pickAgain = (int) (4*pick);//[0,3]
		return pickAgain;
	}
	
	public static int pickCard()
	{
		double pick = Math.random();//[0,1)
		int pickNumber = (int) (12*pick);//[0,12)
		return pickNumber;
	}

}

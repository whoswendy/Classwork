package CaveExplorer;

public class GameStartEvent implements Playable {
	
	private static final String[] SEQUENCE_1 = {"<A little yellow mouse with brown stripes and a lightning shaped tail runs up to you>" +"Hi, I can see you are not from around here.","Do you like puzzles?"};
	private static final String[] SEQUENCE_2 = {"You are going to have so much fun playing my 2D games.","Take this map"};
	
	public GameStartEvent()
	{
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		readSequence(SEQUENCE_1);
		while(CaveExplorer.in.nextLine().toLowerCase().indexOf("yes") < 0)
		{
			CaveExplorer.print("Common, you know you like puzzles, say yes!");
		}
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);

	}
	
	public static void readSequence(String[] seq)
	{
		for(String s : seq)
		{
			CaveExplorer.print(s);
			CaveExplorer.print("- - - press enter - - -");
			CaveExplorer.in.nextLine();
		}
	}

}

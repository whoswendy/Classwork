package CaveExplorer;

public class PracticeFIeld {
	
	public static void main(String[] args)
	{
		String[][] field = new String[4][5];
		drawGrid(field);
		printPic(field);
	}

	private static void drawGrid(String[][] field) {
		// TODO Auto-generated method stub
		for(int row = 0; row <field.length;row++)
		{
			for(int col = 0; col<field[0].length;col++)
			{
				field[row][col] = "";
			}
		}
		for(int row = 0; row <field.length;row++)
		{
			for(int col = 0; col<field[0].length;col++)
			{
				field[row][col] = "_";
			}
		}
		for(int row = 0; row <field.length;row++)
		{
			for(int col = 0; col<field[0].length;col+=2)
			{
				field[row][col] = "|_|";
			}
		}
	}

	public static void printPic(String[][] imgArr)
	{
		for(String[] row : imgArr)
		{
			for(String col: row)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

}



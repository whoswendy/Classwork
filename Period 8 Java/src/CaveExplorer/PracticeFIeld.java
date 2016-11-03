package CaveExplorer;

public class PracticeFIeld {
	
	public static void main(String[] args)
	{
		String[][] field = new String[15][15];
		drawGrid(field);
		printPic(field);
	}

	private static void drawGrid(String[][] field) {
		// TODO Auto-generated method stub
		for(int row = 0; row < field.length; row++)
		{
			for (int col = 0; col < field[row].length; col++)
			{
				if(col == field[row].length-1)
				{
					field[row][col] = "|";
				}
				else
				{
					field[row][col] = "|_";
				}
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



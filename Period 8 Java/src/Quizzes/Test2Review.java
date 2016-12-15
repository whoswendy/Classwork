package Quizzes;

public class Test2Review {
	
	private static boolean[][] grid;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		grid = new boolean[5][5];
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
	}
	
	public static void switchRow(boolean[] row, int x)
	{
		//switch row[x-1], row[x], row[x+1] IF THEY EXIST
		for(int i = -1; i < 2; i++)
		{
			if(x+i >= 0 && x+1 < row.length)
			{
				row[x+1] = !row[x+1];//point if value is switched
			}
		}
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c)
	{
		//switches ABOVE and BELOW the value in row r and column c
		switchIfValid(grid,r-1,c);//point for correct element grid[r-1][c]
		switchIfValid(grid,r,c);
		switchIfValid(grid,r+1,c);//point for correct element grid[r+1][c]
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c)
	{
		if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length)
		{
			grid[r][c] = !grid[r][c];
		}
	}
	
	
	public static void buttonClick(int r, int c) {
		// TODO Auto-generated method stub
		if(r >= 0 && r < grid.length)//technically correct but not on rubric
		{
			switchRow(grid[r],c);
		}
		switchColumn(grid,r,c);
		//all above = 1pt, any error equal 0pts
		
		//win if all lights are on
		for(int row = 0; row<grid.length; row++)
		{
			for(int col = 0; col<grid[row].length; col++)
			{
				//1 of 2pts
				if(grid[row][col])
				{
					return;//1 of 2pts
				}
			}
		}
		System.out.println("You have solved the puzzle");
		
//Second Solution
//		boolean win = true;
//		for(int row = 0; row<grid.length; row++)
//		{
//			for(int col = 0; col<grid[row].length; col++)
//			{
//				//1 of 2pts
//				if(grid[row][col])
//				{
//					win = false;
//					break;
//				}
//			}
//		}
//		if(win)
//		{
//			System.out.println("You have solved the puzzle");
//		}
		
		
	}


	public static void printGrid(boolean[][] grid)
	{	
			for(boolean[] row : grid)
			{
				for(boolean col: row)
				{
					if(col)
					{
						System.out.print("O");
					}
					else
					{
						System.out.print("X");
					}		
				}
				System.out.println();
			}
			System.out.println("");
	}
	
	



}

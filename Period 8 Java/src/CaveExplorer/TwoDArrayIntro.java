package CaveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {
	
	
	public static void minesSweep()
	{
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}
	
	private static String[][] createField(boolean[][] mines) {
		// TODO Auto-generated method stub
		String[][] field = new String[mines.length][mines[0].length];
		
		for(int row = 0; row < field.length; row++)
		{
			for(int col = 0; col < field[row].length; col++)
			{
				if(mines[row][col])
				{
					field[row][col] = "X";
				}
				else
				{
					field[row][col] = countNearby(mines,row,col);
				}
			}
		}
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
//		checks only elements around main element
//		for(int r = row - 1; r <= row+1; r++)
//		{
//			for(int c = col - 1; c <= col+1; c++)
//			{
//				if(r>=0 && r<mines.length && c>=0 && c<mines[0].length)//this is to check that r and c are in the range of the array 
//				{
//					verifies that something wont go out of bound Array.indexOutOfBound
//				}
//			}
//		}
		
		//only consider actual elements BUT checks all possible elements so a lot SLOWER
//		int count = 0;
//		for(int r= 0; r<mines.length; r++)
//		{
//			for(int c=0; c<mines[r].length;c++)
//			{
//				if(Math.abs(r-row) + Math.abs(c-col) == 1 && mines[r][c])
//				{//using taxi cab distance to check for mines in the north,east,west and south
//					count++;
//				}
//			}
//		}
//		return "" + count;
		
		//this method allows you to be most specific for example you only want north and east
		int count = 0;
		count += isValidAndTrue(mines,row-1,col);
		count += isValidAndTrue(mines,row+1,col);
		count += isValidAndTrue(mines,row,col-1);
		count += isValidAndTrue(mines,row,col+1);
		return "" + count;
		
	}

	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		// TODO Auto-generated method stub
		if(i >= 0 && i < mines.length && j >= 0 && j < mines[0].length && mines[i][j])
		{
			return 1;
		}
		else return 0;
	}

	private static void plantMines(boolean[][] mines) {
		// TODO Auto-generated method stub
		int numberOfMines = 12;
		while(numberOfMines > 0)
		{
			int row = (int) (Math.random() * mines.length);
			int col = (int) (Math.random() * mines[0].length);
			
			//this prevents the same mine from being selected twice
//			while(mines[row][col])
//			{
//				 row = (int) (Math.random() * mines.length);
//				 col = (int) (Math.random() * mines[0].length);
//			}
//			numberOfMines--;
			
//			another possible way?
			if(!mines[row][col])
			{
			  mines[row][col] = true;
				numberOfMines--;
			}
		}
	}

	public static void createImage()
	{
		String[][] imgArr = new String[10][8];
		for(int row = 0; row < imgArr.length; row++)
		{
			//populate with coordinates
			for(int col = 0; col<imgArr[row].length;col++)
			{
				imgArr[row][col] = " ";
					
			}
		}
		//birds
		int times = 5;
		
		while(times > 0)
		{
			int rrow = (int) (Math.random() * 5 + 1);
			int ccol = (int) (Math.random() * 5 + 1);
			imgArr[rrow][ccol] = "v";
			times--;
			
		}
		//sun
		//imgArr[0][3] = "1";
		//imgArr[1][3] = "0";
		//imgArr[2][3] = "1";
		//imgArr[1][4] = "-";
		//imgArr[1][2] = "-";
		//grassy field
		for(int row = 6; row < imgArr.length; row++)
		{
			for(int col = 0; col < imgArr[row].length; col++)
			{
				imgArr[row][col] = "w";
			}
				
		}
		
		for(int col = 0; col<imgArr[0].length;col++)
		{
			imgArr[0][col] = "_";
			imgArr[imgArr.length-1][col] = "_";
		}
		
		for(int row = 1; row<imgArr[0].length+2;row++)
		{
			imgArr[row][0] = "|";
			imgArr[row][imgArr[0].length-1] = "|";
		}
		
		
		printPic(imgArr);
		
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
	
	public static void main()
	{
		String[] xox = {"x","o","x","o","x"};
		System.out.println(Arrays.toString(xox));
		//a 1D array prints a horizontal string
		
		String[][] arr2D = new String[5][4];//String[a][b] a= length/rows b= length of each array/col
		System.out.println("The height is " + arr2D.length);
		System.out.println("The width is " + arr2D[0].length);
		
		for(int row = 0; row < arr2D.length; row++)
		{
			//populate with coordinates
			for(int col = 0; col<arr2D[row].length;col++)
			{
				arr2D[row][col] = "(" + row + "," + col + ")";
					
			}
		}
		
		//print 2D array
		//every element in a 2D array is an array, so a for each loop looks like this:
		for(String[] row : arr2D)
		{
			System.out.println(Arrays.toString(row));
		}
	}

}

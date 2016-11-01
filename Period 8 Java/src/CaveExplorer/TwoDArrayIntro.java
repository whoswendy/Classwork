package CaveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		createImage();
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
		for(int row = 5; row < imgArr.length; row++)
		{
			for(int col = 0; col < imgArr[row].length; col++)
			{
				imgArr[row][col] = "w";
			}
				
		}
		
		for(String[] row : imgArr)
		{
			System.out.println(Arrays.toString(row));
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

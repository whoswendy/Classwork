package CaveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeExploring {

	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static String[][] pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr2D = new String[10][10];
		pic = new String[10][10];
		
		for(int row = 0; row < arr2D.length; row++)
		{
			//populate with coordinates
			for(int col = 0; col<arr2D[row].length;col++)
			{
				arr2D[row][col] = "(" + row + "," + col + ")";
					
			}
		}
		
		starti = 2;
		startj = 2;
		treasurei = 4;
		treasurej = 4;
		startExploring();
		
	}
	
	private static void startExploring() {
		// TODO Auto-generated method stub
		while(true)
		{
			fillGrid(pic);
			printPic(pic);
			System.out.println("You are in room " + arr2D[starti][startj] + ".");
			if(starti == treasurei && startj == treasurej)
			{
				break;
			}
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
		}
	}

	private static void fillGrid(String[][] grid) {
		// TODO Auto-generated method stub
		for(int row = 0; row < grid.length; row++)
		{
			for(int col = 0; col < grid[0].length; col++)
			{
				pic[row][col] = " ";
			}
		}
		drawGrid(grid);
		grid[starti][startj] = "X";
	}

	private static int[] interpretInput(String input) {
		//verify input is valid
		while(!isValid(input))
		{
			System.out.println("Sorry, in this game, you can only use the w, a, s, d controls."
					+ " Tell me again what would you like to do? ");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w"))
		{
			currenti--;
		}
		if(input.equals("s"))
		{
			currenti++;
		}
		if(input.equals("a"))
		{
			currentj--;
		}
		if(input.equals("d"))
		{
			currentj++;
		}
		int[] newCoordinates = {starti,startj};
		if(currenti >= 0 && currenti<arr2D.length && currentj >= 0 && currentj<arr2D[0].length)
		{
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}
		else
		{
			System.out.println("Sorry you have met the edge fo the universe, you may go no further in that direction");
		}
		return newCoordinates;
	}

	private static boolean isValid(String input) {
		// TODO Auto-generated method stub
		String[] validKeys = {"w","a","s","d"};
		for(int i = 0; i<validKeys.length; i++)
		{
			if (input.toLowerCase().equals(validKeys[i]))
			{
				return true;
			}
		}
		return false;
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
			for(int col = 0; col<field[0].length-1;col++)
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
	




}

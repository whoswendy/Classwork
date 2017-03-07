package Test3Review;

import java.util.ArrayList;

public class ListRunner {
	
	static ArrayList<Item> shoppingList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void printPurchasedItems() {
		// TODO Auto-generated method stub
//		for(Item i: shoppingList)
//		{
//			if(i.getPurchased())
//			{
//				System.out.println(i.getDescription());//1pt for printing
//				shoppingList.remove(i);//1pt for removal
//			}
//		}
		
		//another solution
		for(int i = 0; i<shoppingList.size(); i++)
		{
			if(shoppingList.get(i).getPurchased())
			{
				System.out.println(shoppingList.get(i).getDescription());//1pt for printing
				shoppingList.remove(i);//1pt for removal
				i--;
			}
		}
	}

	private static void doSomeShopping() {
		// TODO Auto-generated method stub
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
	}

	private static void initList(String[] justDescriptions) {
		// TODO Auto-generated method stub
		shoppingList = new ArrayList<Item>();//1pt for instantiating field
		for(int i = 0; i< justDescriptions.length; i++)//0.5pt for forloop
		{
			//another solution
			//Item object = new Item(justDescriptions[i]);//1pt for creating object
			//shoppingList.add(object);//0.5pt for adding
			shoppingList.add(new Item(justDescriptions[i]));//0.5pt for adding, 1pt for creating object
		}
	}

	private static String[] getDescriptions() {
		// TODO Auto-generated method stub
		String[] test = {"coffee","videogame","potato chips","a life"};
		return test;
	}

}

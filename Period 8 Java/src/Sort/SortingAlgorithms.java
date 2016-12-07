package Sort;

import java.util.Arrays;

public class SortingAlgorithms {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
		//System.out.println("- - - SELECTION SORT - - -");
		System.out.println(Arrays.toString(arrayToSort));
		//selectionSort(copy(arrayToSort));
		bubbleSort(copy(arrayToSort));
	}
	
	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
	}
	
	public static void bubbleSort(int[] arrayToSort)
	{
		for(int i=0;i<arrayToSort.length; i++)
		{
			 for(int j = 0; j<arrayToSort.length -1- i; j++)
			 {
				 if(arrayToSort[j]>arrayToSort[j+1])
				 {
					 swap(arrayToSort,j,j+1);
					 
				 }
			 }
			
		}
	}
	
	public static int[] merge(int[] partA, int[] partB){
		int aIndex = 0;
		int bIndex = 0;
		int[] merge = new int[partA.length + partB.length];
		int i = 0;
		//WHILE LOOP A
		while(aIndex < partA.length && bIndex < partB.length)
		{
			if(partA[aIndex] < partB[bIndex])
			{
				merge[i]=partA[aIndex];
				aIndex++;
				i++;
			}
			else
			{
				merge[i]=partB[bIndex];
				bIndex++;
				i++;
			}
		 }
		 //WHILE LOOP B 
		 while(aIndex < partA.length)
		 {
			 merge[i]=partA[aIndex];
			 aIndex++;
			 i++;
		 }
		//WHILE LOOP C 
		 while(bIndex < partB.length)
		 {
			 merge[i]=partB[bIndex];
			 bIndex++;
			 i++;
		 }
		 	return merge;
	}

}

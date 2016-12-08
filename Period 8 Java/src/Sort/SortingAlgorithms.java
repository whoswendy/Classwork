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
	
	public static int[] copy(int[] arr)
	{
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++)
		{
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arrayToSort)
	{
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++)
		{
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++)
			{
				if(arrayToSort[j]<minimum)
				{
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
	
	public static void insertionSort(int[] arrayToSort){
		//this algorithm takes one element at a time to 
		//add in sorted order...
		//start at 1 since the element at zero is
		//already in "sorted order" (since it is alone)
		for (int i = 1; i < arrayToSort.length; i++) {
			//with each element, i, go BACKWARDS from i, 
			//until you find a value that is smaller
			//swap as you go
			for(int j = i ; j > 0 ; j--){
				if(arrayToSort[j] < arrayToSort[j-1]){
					swap(arrayToSort,j,j-1);
				}
			}
		}
	}

	//note: merge sort is not an "in-place" algorithm. It actually makes copies of the initial array
	//so this is the only method that actual has a return type
	public static int[] mergeSort(int[] arrayToSort){
		int n = arrayToSort.length;

		if(n<=1){
			//trivial sort when only one (or no) element
			//is in the array
			return arrayToSort;
		}else{	
			//split the array in half
			int[] partA = new int[n/2];
			//be careful of rounding!
			int[] partB = new int[n-n/2];
			for(int i=0; i<n; i++){
				if(i<partA.length){
					partA[i]=arrayToSort[i];
				}else{
					partB[i-partA.length]=arrayToSort[i];
				}
			}
			return merge(mergeSort(partA),mergeSort(partB));
		}
	}
	
	
	//since quickSort is recursive, the start and end must be specified 
	//(to break it down through recursive calls)
	public static void quickSort(int[] arrayToSort, int start, int end)
	{
		//trivial case is when the array is empty or contains one element
		//sort only if this is not the case, (otherwise nothing is done)
		if(start<end){			
			//choose the pivot from the end
			int pivot = arrayToSort[end];
			System.out.println("PIVOT "+pivot);
			//pIndex is the index where the pivot will go at the end.
			//It is also the number of elements SMALLER than the pivot
			//(note: pivot cannot be smaller than start, since this is only
			//sorting elements after start)
			int pIndex = start;
			//compare every element to the pivot
			for(int i=start; i<end; i++){
				if(arrayToSort[i]<pivot){
					swap(arrayToSort,i,pIndex);
					//pIndex increases because there is another element smaller than the pivot
					pIndex++;
				}
			}
			//now put the pivot in the correct spot
			swap(arrayToSort,pIndex, end);
			//and sort the elements on the left and right of the pivot
			if(start<pIndex-1)
			{
				quickSort(arrayToSort, start, pIndex-1);
			}	
			if(pIndex-1 < end)
			{
				quickSort(arrayToSort, pIndex+1, end);
			}
		}
	}
	
	//AP required sorting algorithms
	//selection sort
	//insertion sort
	//merge sort
	//binary search

}

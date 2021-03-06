package com.Arrays;


class ArrayDemo{
	public static void main(String[] args){
		int[] ar = new int[10];
		
		System.out.println("-FILL-");
		Arrays.arrayFill(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
		
		System.out.println("-FILL MANUAL-");
		//Arrays.arrayFillManual(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
		
		System.out.println("-REVERSE-");
		Arrays.arrayReverse(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
		
		System.out.println("-SHUFFLE-");
		Arrays.arrayShuffle(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
		
		System.out.println("-BUBBLE SORT-");
		Arrays.arrayShuffle(ar);
		Arrays.arrayPrint(ar);
		Arrays.arraySortBubble(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
		
		System.out.println("-SELECTION SORT-");
		Arrays.arrayShuffle(ar);
		Arrays.arrayPrint(ar);
		Arrays.arraySortSelection(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
		
		System.out.println("-INSERTION SORT-");
		Arrays.arrayShuffle(ar);
		Arrays.arrayPrint(ar);
		Arrays.arraySortInsertion(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
		
		System.out.println("-FAST SORT-");
		Arrays.arrayShuffle(ar);
		Arrays.arrayPrint(ar);
		Arrays.arraySortFast(ar);
		Arrays.arrayPrint(ar);
		System.out.println("____________");
	}
}
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
	}
}
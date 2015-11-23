package com.Arrays;


class ArrayDemo{
	public static void main(String[] args){
		int[] ar = new int[10];
		Arrays.fillArray(ar);
		Arrays.printArray(ar);
		
		Arrays.reverseArray(ar);
		Arrays.printArray(ar);
	}
}
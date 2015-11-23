package com.Arrays;

public class Arrays{
		public static int[] fillArray(int[] array){
			for(int i=0;i<array.length;i++){
				array[i] = i;
			}
			
			return(array);
		}
		
		public static void printArray(int[] array){
			for(int e : array){
				System.out.print(e + " ");
			}
		}
		
		public static int[] reverseArray(int[] array){
			for(int i=0;i<array.length/2;i++){
				int tmp = array[i];
				array[i] = array[array.length - i -1];
				array[array.length - i -1] = tmp;
			}
			
			return(array);
		}
}
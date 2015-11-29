package com.Arrays;

import java.util.*;

public class Arrays{
		public static int[] arrayFill(int[] array){
			for(int i=0;i<array.length;i++){
				array[i] = i;
			}
			
			return(array);
		}
		
		public static int[] arrayFillManual(int[] array){

			for(int i=0;i<array.length;i++){
				
				boolean error = true;
				
				do{
					try{
						System.out.println("Enter " + i + " element : ");
						Scanner in = new Scanner(System.in);
						array[i] = in.nextInt();
						error = false;
					}catch(Exception e){
						System.out.println("This is not INT");
					}
					
				}while(error);
			}
			return(array);
		}
		
		public static void arrayPrint(int[] array){
			for(int e : array){
				System.out.print(e + " ");
			}
			
			System.out.println();
		}
		
		public static int[] arrayReverse(int[] array){
			for(int i=0;i<array.length/2;i++){
				int tmp = array[i];
				array[i] = array[array.length - i -1];
				array[array.length - i -1] = tmp;
			}
			
			return(array);
		}
		
		public static int[] arrayShuffle(int[] array){
			
			Random e = new Random();
			
			for(int i=0;i<array.length;i++){
				int index = e.nextInt(array.length);
				
				int tmp = array[i];
				array[i] = array[index];
				array[index] = tmp;
				
			}
			
			return(array);
		}
		
		public static int[] arraySortBubble(int[] array){
			
			for(int i=0;i<array.length;i++){
				for(int j=i;j<array.length;j++){
					if(array[i] > array[j]){
						int tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
			}
			
			return(array);
		}
		
		public static int[] arraySortSelection(int[] array){
			
			for(int i=0;i<array.length;i++){
				
				int min_i = i;
				
				for(int j=i;j<array.length;j++){
					if(array[min_i] > array[j]) min_i = j;
				}
				
				if(min_i != i){
					int tmp = array[i];
					array[i] = array[min_i];
					array[min_i] = tmp;
				}
			}
			
			return(array);
		}
		
		public static int[] arraySortInsertion(int[] array){
			
			for(int i=1;i<array.length;i++){
				int tmp = array[i];
				int j;
				
				for(j=i;j>0;j--){
					
					if(tmp > array[j-1]){
						break;
					}
					
					array[j] = array[j - 1];
					
				}
				
				array[j] = tmp;			
				
			}
			
			return(array);
			
		}
		
		public static int[] arraySortFast(int[] array){
			
			arraySortFast(array, 0, array.length-1);
			
			return(array);
		}
		
		private static int[] arraySortFast(int[] array, int First, int Last){
			int first = First;
			int last = Last;
			int middle = array[first + (last - first) / 2];
			
			do{
				while(array[first] < middle) first++;
				while(array[last] > middle) last--;
				
				if(first<=last){
					int tmp = array[first];
					array[first] = array[last];
					array[last] = tmp;
					
					first++;
					last--;
				}
			}while(first<=last);
			
			if(first < Last) arraySortFast(array, first, Last);
			if(First < last)arraySortFast(array, First, last);
			
			return(array);
		}
}
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
}
package arraydemo;

import java.util.Scanner;

public class ArrayExercise {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		
		//use loop initialize value to array
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]: ", i);
			arr[i] = sc.nextInt();
		}
		
		//sum all the elements of array
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total = total + arr[i];
		}
		System.out.println("Sum: " + total);
		
		sc.close();
		
	}
	
	
}

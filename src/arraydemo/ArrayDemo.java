package arraydemo;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		//1. declare array
		int[] a1;
		//int a2[];
		//int []a3;
		
		//2. instantiate array
		a1 = new int[3];
		
		//3. initialize value to array 
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		
		//4. print array
		System.out.println(a1[0]); //10
		System.out.println(a1[1]); //20
		System.out.println(a1[2]); //30
		
		//System.out.println(a1[3]); // error: ArrayIndexOutOfBoundsException
		
		//5. use loop to print array
		for(int i=0; i<a1.length; i++) {
			//System.out.println("array: " + a1[i]);
			System.out.printf("a1[%d]: %d\n", i, a1[i]);
		}
		
	}
}

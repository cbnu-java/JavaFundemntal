package arraydemo;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		//access the last element of array
		System.out.println(arr[arr.length-1]);
		
		//use normal loop
		/*for(int i=0; i>arr.length; i++) {
			System.out.printf("\n%d", arr[i]);
		}*/
		
		//use foreach loop
		for(int a : arr) {
			System.out.printf("\n%d", a);
		}
		
		int[] a1 = {1,2};
		System.out.println("\nlength: " + a1.length);
		System.out.println(a1[0]);
		
	}
}

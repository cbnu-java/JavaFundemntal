package array;

public class ArrayDemo {
	
	public static void main(String[] args) {
	
		//declare array
		int []arr = {1,2,3};
		int[] a1 = {1,2};
		int a2[] = {1,2};
		int a5[] = {};
		
		int a3[] = new int[] {1,2,3};
		int a4[] = new int[3];
		
		String[] studentName = {"Phearun", "Dara"};
		
		System.out.println(studentName[0]);
		System.out.println(studentName[1]);
		
		String[] tasks = new String[5];
		tasks[0] = "Task1";
		tasks[1] = "Task2";
		tasks[2] = "Task3";
		
		System.out.println(tasks[2]);
		
	}
}

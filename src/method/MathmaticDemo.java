package method;

public class MathmaticDemo {
	public static void main(String[] args) {
		
		MathmaticDemo m = new MathmaticDemo();
		int add = m.sum(10, 20);
		int sub = m.substract(20, 10);
		
		System.out.println("Sum: " + add); //30
		System.out.println("Sub: " + sub);//10
	}
	
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int substract(int a, int b) {
		int result = a - b;
		return result;
	}
}

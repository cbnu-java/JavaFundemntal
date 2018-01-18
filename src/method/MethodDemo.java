package method;

public class MethodDemo {
	
	public static void main(String[] args) {
		System.out.println("I'm main method!");
		
		//call static method
		MethodDemo.welcomeMessage();
		welcomeMessage();
		
		//call instance method
		MethodDemo m = new MethodDemo();
		m.method1();
	}
	
	//static method
	public static void welcomeMessage() {
		System.out.println("Hello method!");
	}
	
	//instance method
	public void method1() {
		System.out.println("Hello from method 1!");
	}
	
}







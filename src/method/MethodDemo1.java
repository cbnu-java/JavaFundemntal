package method;

public class MethodDemo1 {
	public static void main(String[] args) {
		
		MethodDemo1 m = new MethodDemo1();
		//m.showMessage("Phearun");
		//m.method2("Hello", "World");
		
		m.showMessage(10); // Age: 10
		m.showMessage("Hello"); // Hello Hello
	}
	
	//instance method or non-static method
	//method with parameter
	public void showMessage(String name) {
		System.out.println("Hello " + name);
	}
	//overloaded method = method with the same name but difference parameter data type or number of parameter
	public void showMessage(int age) {
		System.out.println("Age: " + age);
	}
	
	public void method2(String str, String name) {
		System.out.println(str +", "+ name);
	}
	
}

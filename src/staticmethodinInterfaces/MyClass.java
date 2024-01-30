package staticmethodinInterfaces;

interface A{
	static void sayHello() {
		System.out.println("Hello from A");
	}
}

public class MyClass implements A{

	public static void main(String[] args) {
//		MyClass ob = new MyClass();
		A.sayHello();
	}

}

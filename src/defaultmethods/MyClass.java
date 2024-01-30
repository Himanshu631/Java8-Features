package defaultmethods;

interface Parent{
	default void sayHello() {
		System.out.println("Hello");
	}
}

interface Parent2{
	default void sayHello() {
		System.out.println("Hello");
	}
}

class Child implements Parent{
	
}

public class MyClass implements Parent, Parent2{
	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.sayHello();
	}

	@Override
	public void sayHello() {
		Parent.super.sayHello();
	}
}

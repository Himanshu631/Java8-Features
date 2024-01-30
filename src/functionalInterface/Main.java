package functionalInterface;

public class Main {

    public static void main(String[] args) {
        MyInterface i = () -> "Hello from Main";
        System.out.println(i.sayHello());
    }
}

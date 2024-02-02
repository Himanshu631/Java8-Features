package methodreferences;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		List<String> students = Arrays.asList("John","Bob","Charlie");
//		students.forEach(x -> System.out.println(x));
//		students.forEach(Main::print);
		
		students.forEach(m::printer);
		
	}
	
	public void printer(String s) {
		System.out.println(s);
	}

}

package biPredicateConsumerFunction;

import java.util.function.BiFunction;

public class BiFunct {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> bifunc = (x,y) -> x.length() + y.length();
		
		System.out.println(bifunc.apply("Himanshu", "Paul"));
		
		
	}
}

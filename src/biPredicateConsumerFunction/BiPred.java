package biPredicateConsumerFunction;

import java.util.function.BiPredicate;

public class BiPred {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bipred = (x,y) -> x%2 == 0 && y%2 == 0;
		
		System.out.println(bipred.test(5, 7));
		System.out.println(bipred.test(52, 72));
		
		BiPredicate<String, String> bipred2 = (x,y) -> x.length() == y.length();
		
		System.out.println(bipred2.test("aero", "car"));
		System.out.println(bipred2.test("palace", "tombes"));

	}

}

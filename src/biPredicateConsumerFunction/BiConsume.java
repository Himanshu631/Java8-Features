package biPredicateConsumerFunction;

import java.util.function.BiConsumer;

public class BiConsume {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bicon = (x,y) -> System.out.println(x + y);
		
		bicon.accept(5, 9);
	}
}

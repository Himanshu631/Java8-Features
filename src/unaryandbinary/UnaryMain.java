package unaryandbinary;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryMain {

	public static void main(String[] args) {
		
		Function<Integer, Integer> func =  x -> x * 3;
		 
		UnaryOperator<Integer> num = n -> n *2;
		
		System.out.println(func.apply(9));
		System.out.println(num.apply(5));
	}

}

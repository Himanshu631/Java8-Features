package unaryandbinary;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryMain {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> func = (x,y)-> x * y;
		BinaryOperator<Integer> num = (x,y) -> x+y;
		
		System.out.println(func.apply(9, 8));
		System.out.println(num.apply(9, 8));
	}

}

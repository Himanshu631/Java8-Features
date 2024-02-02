package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
//		List<String>  fruits = Arrays.asList("apple","banana","cheery");
//		Stream<String>  fruitsstream  = fruits.stream();
//		
//		Stream<Integer> intStr = Stream.of(1,2,3);
//		Stream.iterate( 0 , n -> n * 2 ).limit(10).distinct();
//		
//		Stream<Integer> newStr = Stream.generate(() -> (int) Math.random()*10).limit(20);
//		
		List<Integer> list = Arrays.asList(1,3,2,4,6,6,4,6,4,466,78,99);
		
		List<Integer> filst = list.stream()
		.filter(x -> x % 2==0)
		.map(x -> x *2)
		.distinct()
		.sorted((a,b) -> b-a)
		.skip(1)
		.collect(Collectors.toList());
		System.out.println(filst);
		
	}

}

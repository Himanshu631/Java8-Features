package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Consumer<Integer> c = num -> System.out.println(num);
		c.accept(52);
		
		Consumer<List<Integer>> listofInt1 = li ->{
			for(Integer i : li) {
				System.out.println(i+100);
			}
		};
		
		Consumer<List<Integer>> listofInt2 = li ->{
			for(Integer i : li) {
				System.out.println(i+100);
			}
		};
		
		listofInt1.accept(Arrays.asList(1,2,3,4));
		
		listofInt1.andThen(listofInt2).accept(Arrays.asList(5,6,7,8));
	}

}

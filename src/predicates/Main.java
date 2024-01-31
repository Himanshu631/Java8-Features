package predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
//		Predicate<Integer> predicate = s -> s>100;
//		System.out.println(predicate.test(52));
		
//		List<Integer> nums = Arrays.asList(1,2,3,4,5);
//		int sum = nums.stream().filter(n -> n % 2 == 0).mapToInt(n->n).sum();
//		System.out.println(sum);
		
		
//		Predicate<String> startsWithH = x -> x.toLowerCase().startsWith("h");
//		System.out.println(startsWithH.test("imanshu"));
//		System.out.println(startsWithH.test("Himanshu"));
	
//		Predicate<String> endswithU = x -> x.toLowerCase().endsWith("u");
//		
//		Predicate<String> and = startsWithH.and(endswithU);
//		Predicate<String> or = startsWithH.or(endswithU);
//		Predicate<String> neg = startsWithH.negate();
//		
//		System.out.println(and.test("Himanshu"));
//		System.out.println(and.test("Manish"));
//		
//		System.out.println(or.test("Himanshu"));
//		System.out.println(or.test("Manish"));
//		
//		System.out.println(neg.test("Himanshu"));
//		System.out.println(neg.test("Manish"));
		
		Employee emp = new Employee("Ram", 21200);
		Predicate<Employee> emppred = e -> e.getSalary() > 100;
		
		System.out.println(emppred.test(emp));
		
	}
	
	public static class Employee{
		private String name;
		private int salary;
		
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
	}

}

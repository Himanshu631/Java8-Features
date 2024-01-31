package functionsinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<String, Integer> len = (str) -> str.length();
		Function<Integer, Boolean> num = (n) -> n % 2 == 0;
//		
//		System.out.println(len.apply("Himanshu"));
//		System.out.println(len.andThen(num).apply("Himanshu"));	
		
		Function<List<Student>, List<Student>> stroll = li ->{
			List<Student> res = new ArrayList<>();
				for(Student s:li) {
					if(len.andThen(num).apply(s.getName())) {
						res.add(s);
					}
				}
			return res;
		};
		
		Student s1 = new Student(101, "Rama");
		Student s2 = new Student(102, "Krishn");
		Student s3 = new Student(103, "Mohan");
		Student s4 = new Student(104, "Amit");
		
		List<Student> students = Arrays.asList(s1,s2,s3,s4);
		
		List<Student> filtered = stroll.apply(students);
		
//		System.out.println(filtered);
		
		Function<String, String> func1 = s -> s.toUpperCase();
		Function<String, String> func2 = s -> s.substring(0, 2);
		
//		Function<String,String> newfun = func1.andThen(func2);
		
//		System.out.println(newfun.apply("Himanshu"));
		
//		System.out.println(func1.andThen(func2).apply("Himanshu"));
		
		Function<Integer,Integer> func3 = x -> 2 * x;
		Function<Integer,Integer> func4 = x -> x * x;
		
//		System.out.println(func3.andThen(func4).apply(5));
//		System.out.println(func3.compose(func4).apply(5));

		Function<String, String> identity = Function.identity();
		System.out.println(identity.apply("Paul"));
	}
	
	private static class Student{
		private int rollno;
		private String name;
		
		public Student(int rollno, String name) {
			this.rollno = rollno;
			this.name = name;
		}
		public int getRollno() {
			return rollno;
		}
		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return "Rollno["+rollno+"] name["+name+"]";
		}
		
		
	}

}

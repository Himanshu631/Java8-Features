package constructorreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Noah");
//		List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
		List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());
		
		System.out.println(students);
	}

}

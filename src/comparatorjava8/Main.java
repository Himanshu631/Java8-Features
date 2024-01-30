package comparatorjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(53);
		list.add(35);
		
		Collections.sort(list, (o1,o2)-> o2 - o1);
		System.out.println(list);
		
		Set<Integer> s = new TreeSet<>();
		s.add(11);
		s.add(15);
		s.add(10);
		s.add(1);
		
		System.out.println("Set");
		System.out.println("Before sorting");
		System.out.println(s);
		
		Set<Integer> ss = new TreeSet<>((a,b) -> b - a);
		ss.add(11);
		ss.add(15);
		ss.add(10);
		ss.add(1);
		System.out.println("After sorting");
		System.out.println(ss);
		
		Map<Integer, String> m = new TreeMap<>();
		
		m.put(1, " Hello 1");
		m.put(3, " Hello 3");
		m.put(2, " Hello 2");
		m.put(4, " Hello 4");
		
		System.out.println("Before sorting");
		System.out.println(m);
		
		Map<Integer, String> mm = new TreeMap<>((a,b)->b-a);
		
		mm.put(1, " Hello 1");
		mm.put(3, " Hello 3");
		mm.put(2, " Hello 2");
		mm.put(4, " Hello 4");
		
		System.out.println("After sorting");
		System.out.println(mm);
		
		
		System.out.println("************ Custom class **************");
		
		Student s1 = new Student(1005, "Ram");
		Student s2 = new Student(1001, "Amit");
		Student s3 = new Student(1004, "John");
		Student s4 = new Student(1003, "Sharon");
		
		List<Student> studentlist = new ArrayList<Student>();
		
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		
		System.out.println("Before sorting");
		System.out.println(studentlist);
		
		Collections.sort(studentlist, (a,b) -> b.id - a.id );
		System.out.println("After sorting");
		System.out.println(studentlist);
		

	}

}

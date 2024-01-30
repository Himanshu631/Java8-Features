package anonymousinnerclass;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee() {
			
			@Override
			public double getSalary() {
				return 253600.15;
			}
			
			@Override
			public String getName() {
				return "Paul";
			}
		};
		
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}

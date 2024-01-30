package comparatorjava8;

public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name+" : "+this.id;
	}
}

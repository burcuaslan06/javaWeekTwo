package work2;

public class Course {
	
	public Course() {
		System.out.println("�al��t�m");
	
	}
	
	public Course(int id, String name, String instructor, String description) {
		System.out.println("Bende �al��t�m");
		this.id=id;
		this.name=name;
		this.instructor=instructor;
		this.description= description;
	}
	
	
	int id;
	String name;
	String instructor;
	String description;
	
}

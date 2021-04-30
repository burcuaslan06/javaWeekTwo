package work2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id=1;
		course1.name="C#-Angular";
		course1.instructor="Engin demiroğ";
		course1.description="Yazılım Geliştirme Kamp1";
		
		Course course2 = new Course(2, "Java-React", "Engin Demiroğ", "Yazılım Geliştirme Kamp2");

		Course course3 = new Course(3, "Programlamaya Giriş", "Engin Demiroğ", "Temel Kurs");

		Course[] courses = new Course[] {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println("Course id: " +course.id);
			System.out.println("Course name: " +course.name);
			System.out.println("Course instructor: " +course.instructor);
			System.out.println("Course description: " + course.description);
			System.out.println("---------------------");
		}
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.listCourse(course1);

		courseManager.addCourse(course2);
		courseManager.listCourse(course2);
		
		courseManager.addCourse(course3);
		courseManager.listCourse(course3);
	}

}

package Programming;

import Programming.learning.packages.students.Student;
import Programming.learning.packages.teachers.Teacher;

public class Packages {
	public static void main(String[] args) {
		Student student = new Student("Ganesh", 101);
		Teacher teacher = new Teacher("Mr. Kumar", "Java");

		System.out.println("=== Java Packages Demo ===");
		System.out.println(student.getDetails());
		System.out.println(teacher.getDetails());

		student.study();
		teacher.teach();
	}
}

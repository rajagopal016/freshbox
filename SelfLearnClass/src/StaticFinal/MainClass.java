package StaticFinal;

public class MainClass {

	public static void main(String[] args) {
		Student.change_college_name();
		Student s1 = new Student(11, "Raja");
		Student s2 = new Student(22, "Ravi");
		Student s3 = new Student(33, "Ramya");
		s1.display();
		s2.display();
		s3.display();

	}

}

package StaticFinal;

public class Student {
	int roll_number;
	String name;
	static String college = "MGT";
	static void change_college_name() {
		college = "MGIT";
	}
	
	Student(int r, String n){
		roll_number = r;
		name = n;
	}
	void display(){
		System.out.println("Roll Number : " + roll_number + "; Name : " + name + "; College : " + college);
	}

}

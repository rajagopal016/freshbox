package inheritance;

public class Employee extends person{
	float salary;
	Employee(String name, float salary) {
		super(name);
		this.salary = salary;
	}
	void display() {
		System.out.println(name + "  " + salary);
	}
	
}

package Constructors;

public class SuperCars extends Car {
	int cc;
	public SuperCars(String n, int cc) {
		super(n);
		this.cc = cc;
		System.out.println("The engine size is " + cc +"cc");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCars Ferrari = new SuperCars("X", 5000);
	}

}

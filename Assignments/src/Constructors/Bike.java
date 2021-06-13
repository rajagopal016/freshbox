package Constructors;

public class Bike {
	static int num;
	public Bike() {
		num++;
		System.out.println("Bike number is "+num);
	}
	public static void main(String[] args) {
		Bike R15 = new Bike();
	}

}

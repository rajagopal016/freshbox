package Constructors;

public class Car {
	static int num = 0;
	String name;
	public Car(String n) {
		num++;
		this.name = n;
		System.out.println("The car number is "+ num + " and the name is " + name);
	}

}

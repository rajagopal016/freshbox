package inheritance;

public abstract class Shape {
	abstract void draw();
}

class Triangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw triangle");
		
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
		
	}
	
}
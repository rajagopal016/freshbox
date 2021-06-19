package inheritance;

public class child extends parent{
	public void printer() {
		System.out.println("This is child");
	}

	public static void main(String[] args) {
		parent p1 = new child();
		p1.printer();

	}

}

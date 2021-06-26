package Exception;

public class Hello {
	public static void main(String[] args) {
		try {
			
			int a = 10;
			int b = 0;
			int i = a/b;
			System.out.println("a/b is " + i);
		}
		catch(ArithmeticException ex) {
			System.err.println("Error : " + ex.getMessage());
		}
	}

}

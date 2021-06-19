package Exception;

public class Hello {
	public static void main(String[] args) {
		try {
			
			int i = 10/0;
		}
		catch(ArithmeticException ex) {
			System.err.println("Error : " + ex.getMessage());
		}
	}

}

package Exception;

public class AgeException extends Exception {

	public AgeException(String s) {
		// TODO Auto-generated method stub
		super(s);
		}
	
	public static void main(String[] args) throws AgeException {
		
		int age = 8;
		try {
		if(age < 18) {
			throw new AgeException("Age should be 18+");
		}	
	}catch(AgeException e){
		System.out.println(e.getMessage());
	}


	}
}



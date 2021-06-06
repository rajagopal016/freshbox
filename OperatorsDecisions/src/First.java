
public class First {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2");
			
		}
		else {
			System.out.println("s1 not equals s2");
		}
		
		if(s1 == s2) {
			System.out.println("reference of s1 equals s2");
		}
		else {
			System.out.println("reference of s1 not equals s2");
		}
		SwitchCase sc1 = new SwitchCase();
		sc1.switchexample();
		
	}

}

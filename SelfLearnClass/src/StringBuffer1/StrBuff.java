package StringBuffer1;

public class StrBuff {

	public static void main(String[] args) {
		// 
		StringBuffer s8 = new StringBuffer("Hello Everyone");
		s8.append("!!");
		StringBuffer s9 = new StringBuffer("Hllo Everyone");
		s9.insert(1, "e");
		System.out.println(s8.toString());
		System.out.println(s9.toString());
		

	}

}

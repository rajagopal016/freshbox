package StringAPI;

public class StringOperation {

	public static void main(String[] args) {
		//Compare To
		String s1 = "AO";
		String s2 = "AB";
		System.out.println(s1.compareTo(s2));
		//Concatenate 
		String s3 = s1.concat(s2);
		System.out.println(s3);
		//Equals
		System.out.println(s1.equals(s2));
		//split
		String s4 = "I love my mom";
		String[] s5 = s4.split("\\s");
		for(String word:s5) {
			System.out.println(word);
		}
		//substring
		System.out.println(s4.substring(1));
		System.out.println(s4.substring(2,5));
		
		//format()
		String name = "James";
		String nameformat1 = String.format("My name is %s", name);
		String s6 = String.format("Value is %f", 333.43);
		String s7 = String.format("Value is %1.3f", 32.34);
		System.out.println(nameformat1);
		System.out.println(s6);
		System.out.println(s7);

	}

}

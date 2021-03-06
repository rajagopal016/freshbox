
public class WrapperExample {
	void wrapper() {
		int a = 10;
		Integer j = Integer.valueOf(a); //converting explicitly to integer 
		Integer k = a; //autoboxing
		System.out.println("a:" + a + " j:" + j + " k:" + k );
		
		Integer g = new Integer(100);
		int h = g.intValue(); //converting integer to int
		int l = g; //unboxing, now compiler will process conversion internally
		System.out.println("g:" + g + " h:" + h + " l:" + l );
	}

}

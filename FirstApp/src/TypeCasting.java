
public class TypeCasting {
	void cast() {
		int i = 100;
		long l = i;
		float f = l;
		System.out.println("Int variable " + i +".");
		System.out.println("long variable " + l +".");
		System.out.println("float variable " + f +".");
		
		double d1 = 100.43;
		float f1 = (float) d1;
		int i1 = (int) f1;
		
		System.out.println("double variable " + d1 +".");
		System.out.println("float variable " + f1 +".");
		System.out.println("int1 variable " + i1 +".");
		
	}

}

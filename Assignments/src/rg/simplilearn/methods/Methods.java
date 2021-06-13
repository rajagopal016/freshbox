package rg.simplilearn.methods;

public class Methods {
	public static void main(String[] args) {
		Methods a = new Methods();
		a.m1();
		System.out.println(a.m2());
		System.out.println(a.m3());
	}
	
	public void m1() {
		System.out.println("Hello");
	}
	
	public int m2() {
		return 1;
	}
	
	public String m3() {
		return "Hello";
	}
}

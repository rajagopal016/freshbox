package rg.simplilearn.Calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.println("Enter 1 for Add \nEnter 2 for Subtraction \nEnter 3 for Multiplication \nEnter 4 for Division \nEnter 5 for Square Root \nEnter 6 for Percentage");
		int opt = s.nextInt();
		DecimalFormat format = new DecimalFormat("0.#");
		if(opt > 4) {
			System.out.println("Enter one number for the operation : ");
			int a = s.nextInt();
			System.out.println("Answer is : " + format.format(c.chooseOperation(opt, a)));
		}
		else {
			System.out.println("Enter number 'a' for the operation : ");
			int a = s.nextInt();
			System.out.println("Enter number 'b' for the operation : ");
			int b = s.nextInt();
			System.out.println("Answer is : " + format.format(c.chooseOperation(opt, a, b)));
		}
		

	}
	public double chooseOperation(int opt, int a, int b) {
		double ans;
		int operator1;
		int operator2;
		this.operator1 = a;
		
		switch(opt) {
		case 1:
			ans = add(a, b);
			break;
		
		case 2:
			ans = sub(a, b);
			break;
		
		case 3:
			ans = mul(a, b);
			break;
		
		case 4:
			ans = div(a, b);
			break;
				
		default:
			ans = add(a, b);
			break;
			
		}
		return ans;
	}
	
	public double chooseOperation(int opt, int a) {
		double ans;
		switch(opt) {
		
		
		case 5:
			ans = sqroot(a);
			break;
			
		case 6:
			ans = percent(a);
			break;
			
		default:
			ans = sqroot(a);
			break;
		}
		return ans;
	}
	
	public int add(int a, int b) {
		return(a+b);
	}
	
	public int sub(int a, int b) {
		return(a-b);
	}
	public int mul(int a, int b) {
		return(a*b);
	}
	
	public double div(int a, int b) {
		return((double)a/b);
	}
	public double percent(int a) {
		return((double)a/100);
	}
	
	public double sqroot(int a) {
		return(Math.sqrt(a));
	}
}


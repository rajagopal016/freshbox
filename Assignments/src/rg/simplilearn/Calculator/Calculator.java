package rg.simplilearn.Calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	int operator1;
	int operator2;
	double ans;
	static int count=0;
	Scanner s = new Scanner(System.in);
	
	public void startCalci() {
		count++;
		System.out.println("This is count number "+ count);
		System.out.println("Enter 1 for Add \nEnter 2 for Subtraction \nEnter 3 for Multiplication \nEnter 4 for Division \nEnter 5 for Square Root \nEnter 6 for Percentage");
		int opt = s.nextInt();
		DecimalFormat format = new DecimalFormat("0.#");
		if(opt > 4) {
			System.out.println("Enter one number for the operation : ");
			int a = s.nextInt();
			System.out.println("Answer is : " + format.format(chooseOperation(opt, a)));
		}
		else {
			System.out.println("Enter number 'a' for the operation : ");
			int a = s.nextInt();
			System.out.println("Enter number 'b' for the operation : ");
			int b = s.nextInt();
			System.out.println("Answer is : " + format.format(chooseOperation(opt, a, b)));
			System.out.println(" ");
		}
	}
	private double chooseOperation(int opt, int a, int b) {
		

		this.operator1 = a;
		this.operator2 = b;
		
		switch(opt) {
		case 1:
			ans = add(operator1, operator2);
			break;
		
		case 2:
			ans = sub(operator1, operator2);
			break;
		
		case 3:
			ans = mul(operator1, operator2);
			break;
		
		case 4:
			ans = div(operator1, operator2);
			break;
				
		default:
			ans = add(operator1, operator2);
			break;
			
		}
		return ans;
	}
	
	private double chooseOperation(int opt, int a) {
		this.operator1 = a;
		switch(opt) {
		
		
		case 5:
			ans = sqroot(operator1);
			break;
			
		case 6:
			ans = percent(operator1);
			break;
			
		default:
			ans = sqroot(operator1);
			break;
		}
		return ans;
	}
	
	private int add(int a, int b) {
		return(a+b);
	}
	
	private int sub(int a, int b) {
		return(a-b);
	}
	private int mul(int a, int b) {
		return(a*b);
	}
	
	private double div(int a, int b) {
		return((double)a/b);
	}
	private double percent(int a) {
		return((double)a/100);
	}
	
	private double sqroot(int a) {
		return(Math.sqrt(a));
	}
}


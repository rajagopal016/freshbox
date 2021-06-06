import java.util.Scanner;

public class SwitchCase {
	void switchexample() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number from 1 to 5: ");
		String ip= sc.nextLine();
		switch(ip) {
		case "1":
			System.out.println("One");
			break;
		case "2":
			System.out.println("Two");
			break;
		case "3":
			System.out.println("Three");
			break;
		case "4":
			System.out.println("Four");
			break;
		case "5":
			System.out.println("Five");
			break;
		default:
			System.out.println("Not a valid number");
			break;
		
		}
	}

}

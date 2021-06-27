package FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) {
		BufferedReader fromUser;
		//BufferedReader is of type character stream
		fromUser = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter Name : ");
			String name = fromUser.readLine();
			System.out.println("Hello "+name);
			
			System.out.println("Enter Age : ");
			int age = Integer.parseInt(fromUser.readLine());
			
			System.out.println("Are you heart patient : ");
			Boolean heart = Boolean.parseBoolean(fromUser.readLine());
			if(heart || age < 18) {
				System.out.println("You are NOT eligible to be vaccinated");
			}else {
				System.out.println("You are eligible to be vaccinated");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

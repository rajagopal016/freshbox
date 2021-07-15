import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WelcomeScreen {
	String root = "C:\\LockedMeDotCom\\";
	public WelcomeScreen() { //This constructor checks if the root folder exists and creates if otherwise
		File f = new File(root);
		if (f.exists() && f.isDirectory()) {
		}else {
			f.mkdir();
		}
		
	}
	public void displayWelcomeMessage() { //This function displays Welcome msg
		System.out.println("Hi There! Welcome to LockedMe.com, an app to handle your files.");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayDeveloperDetails() {//This function displays Developer Details
		System.out.println("This app was developed by Rajagopal.");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayFeatures() {//This function displays Features
		System.out.println("This app has feature to display available files, add, search, delete files.");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void displayAvailableOptions() {//This function displays options to the user
		System.out.println("1. Display all files in the repository");
		System.out.println("2. Add a new file to the repository");
		System.out.println("3. Delete a file in the repository");
		System.out.println("4. Search a file in the repository");
		System.out.println("5. Exit");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		makeUserChoice();
	}
	
	private void processUserChoice(int choice) {//This function chooses the right function as per the user input
		switch(choice) {
			case 1:
				displayFiles display = new displayFiles();
				display.displayAllFiles();
				break;
			case 2:
				AddFile addFile = new AddFile();
				addFile.addNewFile();
				break;
			case 3:
				deleteFile deleteFile = new deleteFile();
				deleteFile.deleteFile();
				break;
			case 4:
				searchFile search = new searchFile();
				search.searchFile();
				break;	
			case 5:
				System.out.println("Bye... See you soon!");
				break;	
		}
	}
	
	public boolean checkFileExistsAndCaseSensitivity(File filename){
		File dir = new File("C:\\LockedMeDotCom");
	    String[] files = dir.list();
	    String filenameS = filename.getName();
	    for(String file : files)
	        if(file.equals(filenameS))
	            return true;
	    return false;
	}
	
	protected String getFileName(String purpose) {
		System.out.print("Enter file name to " + purpose + " : ");
		Scanner s = new Scanner(System.in);
		String fileName = s.nextLine();
		return fileName;
	}

	public void makeUserChoice() {//This function lets user choose a feature, it has a check if the input is valid
		System.out.print("Enter 1-5 to perform the operation : ");
		Scanner s = new Scanner(System.in);
		int userChoice = s.nextInt();
		if (userChoice < 1 || userChoice > 5) {
			System.out.println("Valid Choice is 1-5");
			makeUserChoice();
		}else {
			System.out.println("Processing your input");
			processUserChoice(userChoice);
		}

	}
	
	public static void main(String[] args) {
		WelcomeScreen user = new WelcomeScreen();
		user.displayWelcomeMessage();
		user.displayDeveloperDetails();
		user.displayFeatures();
		user.displayAvailableOptions();
		
	}

}

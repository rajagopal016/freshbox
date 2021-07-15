import java.io.File;
import java.util.concurrent.TimeUnit;

public class searchFile extends WelcomeScreen {
	public void searchFile() {
		File file = new File(root + getFileName("search")); //initialize File object and passing path as argument
		boolean exists = checkFileExistsAndCaseSensitivity(file);
		if(exists) {
			System.out.println("file is found"); //returns the path string  
			System.out.println("----------------------------------------------------------------");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayAvailableOptions();
		}  
		else  {  
			System.out.println("File doesn't exist at location | Enter an correct file name");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			searchFile();
		} 
		
	}

}

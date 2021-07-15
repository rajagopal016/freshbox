import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class deleteFile extends WelcomeScreen {
	File file;
	public void deleteFile() {
		this.file = new File(root + getFileName("delete")); //initialize File object and passing path as argument  
		try {
			boolean exists = checkFileExistsAndCaseSensitivity(file);
			if(exists) {
				boolean result = file.delete();
				if(result) {
					System.out.println("file deleted "+file.getCanonicalPath()); //returns the path string
				}else {
					System.out.println("File doesn't exist at location | Enter an correct file name");
					deleteFile();
				}
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
				deleteFile();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	
}

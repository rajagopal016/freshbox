import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddFile extends WelcomeScreen {
	File file;
	void addNewFile() {
		this.file = new File(root + getFileName("create")); //initialize File object and passing path as argument  
		boolean result;
		try {
			result = file.createNewFile();
		
			if(result){  
				System.out.println("file created "+file.getCanonicalPath());  
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("----------------------------------------------------------------");
				displayAvailableOptions();
			}  
			else  {  
				System.out.println("File already exist at location | Enter an unique file name");
				addNewFile();
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		     
	}  

}

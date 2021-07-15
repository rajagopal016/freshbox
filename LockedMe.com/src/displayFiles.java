import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class displayFiles extends WelcomeScreen {
	public void displayAllFiles() {//This function displays all file names sorted
		System.out.println("Displaying all files");
		File folder = new File(root);
		File[] listOfFiles = folder.listFiles();
		String[] fileNames = new String[listOfFiles.length];
		if(listOfFiles.length == 0) {
			System.out.println("No files availble right now, why don't you create one!");
		}
		for(int i = 0; i < listOfFiles.length; i++) {
			fileNames[i] = listOfFiles[i].getName();
		}
		Arrays.sort(fileNames);
		for(int i = 0; i < fileNames.length; i++) {
			System.out.println(fileNames[i]);
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
}

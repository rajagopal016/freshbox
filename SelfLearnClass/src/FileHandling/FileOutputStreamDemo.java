package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream("fileio", true); // true is to open in append mode
			String str = "\nByeBye!!!";
			byte[] b = str.getBytes();
			stream.write(b);
			System.out.println("Data Written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
